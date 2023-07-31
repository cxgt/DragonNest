package com.cx.dragonnest;

import com.cx.dragonnest.service.InsoAssetInventoryService;
import com.cx.dragonnest.service.InsoSysManageService;
import org.flowable.engine.*;
import org.flowable.engine.history.HistoricActivityInstance;
import org.flowable.engine.repository.Deployment;
import org.flowable.engine.repository.ProcessDefinition;
import org.flowable.engine.runtime.ActivityInstance;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.task.api.Task;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author chenxin
 * @date 2023/06/30 11:03
 */
@SpringBootTest
public class DragonNestFlowAbleTest {
	// 当使用@Autowired注解的时候，其实默认就是@Autowired(required=true)，表示注入的时候，该bean必须存在，否则就会注入失败。
	// @Autowired(required=false)：表示忽略当前要注入的bean，如果有直接注入，没有跳过，不会报错
//	@Autowired(required = false)
//	private InfoNbrUserService infoNbrUserService;
	@Autowired(required = false)
	private InsoSysManageService insoSysManageService;

	@Autowired(required = false)
	private InsoAssetInventoryService insoAssetInventoryService;
//
// 部署流程
@Test
public void test1() {
	//获取流程引擎ProcessEngine
	ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
	RepositoryService repositoryService = processEngine.getRepositoryService();
	// 获取RepositoryService
	Deployment deploy = repositoryService.createDeployment()
			.addClasspathResource("test_rollback.bpmn20.xml")
			.name("任务回退02")
			.deploy();
	System.out.println("deploy.getId() = " + deploy.getId());
	System.out.println("deploy.getName() = " + deploy.getName());
}

	// 启动流程
	@Test
	public void test2() {
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
		RuntimeService runtimeService = processEngine.getRuntimeService();

		// 启动流程时，给变量 user1 分别赋值
		Map<String, Object> variables = new HashMap<>();
		variables.put("user1", "张一");// 用户任务1的处理人
		variables.put("num", 3); // 请几天假
		variables.put("description", "工作累了，想出去玩玩"); // 请假的原因
		ProcessInstance processInstance = runtimeService.startProcessInstanceById("TaskFallback:2:7ba68235-2474-11ee-bc6f-6a7b11c2e1fb", variables);
		System.out.println("流程定义的ID：" + processInstance.getProcessDefinitionId());
		System.out.println("流程实例的ID：" + processInstance.getId());
		//流程定义的ID：TaskFallback:1:ec0a4cf2-246c-11ee-963c-9ac9fa53c7a1
		//流程实例的ID：b3cd859b-246d-11ee-a706-52afc6a5eccc
	}

	// 用户1（张一）完成任务
	@Test
	public void test3() {
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
		TaskService taskService = processEngine.getTaskService();
		Task task = taskService.createTaskQuery()
				.processDefinitionId("TaskFallback:2:7ba68235-2474-11ee-bc6f-6a7b11c2e1fb")
				.taskAssignee("张一")
				.singleResult();
		// 用户1（张一）完成任务流程时，给变量 user2 分别赋值
		Map<String, Object> variables = new HashMap<>();
		variables.put("user2", "张二");// 用户任务2的处理人
		System.out.println(task);
		System.out.println("------------------");
		if (task != null) {
			taskService.complete(task.getId(), variables);
			System.out.println("------------------");
		}
	}


	// 用户2（张二）完成任务
	@Test
	public void test4() {
		ProcessEngine processEngine=ProcessEngines.getDefaultProcessEngine();
		TaskService taskService= processEngine.getTaskService();
		Task task = taskService.createTaskQuery()
				.processDefinitionId("TaskFallback:2:7ba68235-2474-11ee-bc6f-6a7b11c2e1fb")
				.taskAssignee("张二")
				.singleResult();
		Map<String,Object> variables=new HashMap<>();
		variables.put("user3","张三");
		System.out.println(task);
		System.out.println("------------------");
		if (task != null) {
			System.out.println("------------------");
			taskService.complete(task.getId(),variables);
			System.out.println("------------------");
		}
	}

	@Test
	public void test5() {
		ProcessEngine processEngine=ProcessEngines.getDefaultProcessEngine();
		TaskService taskService= processEngine.getTaskService();
		Task task = taskService.createTaskQuery()
				.processDefinitionId("TaskFallback:2:7ba68235-2474-11ee-bc6f-6a7b11c2e1fb")
				.taskAssignee("张三")
				.singleResult();
		Map<String,Object> variables=new HashMap<>();
		variables.put("user4","张四");
		System.out.println("------------------");
		if (task != null) {
			taskService.complete(task.getId(),variables);
			System.out.println("------------------");
		}
	}

	@Test
	public void test6() {
		ProcessEngine processEngine=ProcessEngines.getDefaultProcessEngine();
		HistoryService historyService = processEngine.getHistoryService();
		List<HistoricActivityInstance> list = historyService.createHistoricActivityInstanceQuery()
				.processDefinitionId("TaskFallback:2:7ba68235-2474-11ee-bc6f-6a7b11c2e1fb")
				.finished()
				.orderByHistoricActivityInstanceEndTime().asc()
				.list();
		System.out.println("------------------");
		for (HistoricActivityInstance activity : list) {
			System.out.println(activity.getActivityId() + " took "
					+ activity.getDurationInMillis() + " milliseconds");
		}
	}

	@Test
	public void test7() {
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
		RuntimeService runtimeService = processEngine.getRuntimeService();

		// 当前的任务定义key，即ACT_RU_TASK表的TASK_DEF_KEY_字段
		List<String> currentActivityIds = new ArrayList<>();
		currentActivityIds.add("userTaskId4");
		// 需要回退的目标节点的任务定义key，即ACT_RU_TASK表的TASK_DEF_KEY_字段
		String newActivityId = "userTaskId3";
		// 回退操作
		runtimeService.createChangeActivityStateBuilder()
				.processInstanceId("0348a58a-2475-11ee-b59d-fa0534445ecc")
				.moveActivityIdsToSingleActivityId(currentActivityIds, newActivityId)
				.changeState();
	}

	// 创建流程部署
	/**
	 * 流程部署涉及的表
	 * ACT_GE_BYTEARRAY表中新增该流程定义相关的BPMN流程图及其图片。
	 * DEPLOYMENT_ID_：对应流程部署的id。
	 * BYTES_：二进制形式的文件内容。
	 * NAME_：部署时文件的路径。
	 * ACT_RE_DEPLOYMENT表中新增该流程部署相关的内容。
	 * ID_：流程部署ID，每个流程部署对应的编号。
	 * NAME_：流程部署名称，在部署流程的时候使用.name()方法编写。
	 * DEPLOY_TIME_：部署时间。
	 * ACT_RE_PROCDEF表中新增该流程定义相关的内容。
	 * ID_：流程定义ID，组成规则为【KEY_:VERSION_:自增长ID】，例如【myLeave:1:4】。
	 * KEY_：流程定义KEY，在其他服务中一般使用KEY来查找相应流程并进行操作；如果部署了多个KEY相同的流程定义，会自动生成一个版本号VERSION_更高的流程定义，并且在通过KEY查找流程定义时，会自动查找版本号最新的流程定义。
	 * NAME_：流程定义的名称，在BPMN设计的时候编写。
	 * VERSION_：流程定义版本号，如果有多个KEY相同的流程定义，会通过版本号进行区分，同时版本号也参与构成流程定义ID。
	 * DEPLOYMENT_ID_：该流程定义对应的流程部署ID，表示在ID为DEPLOYMENT_ID_的流程部署中，生成了本条流程定义。
	 */
	@Test
	public void testDeployment() {
		// 1.获取流程引擎ProcessEngine
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();

		// 2.获取RepositoryService
		RepositoryService repositoryService = processEngine.getRepositoryService();

		// 3.进行流程部署（BPMN文件->Activiti数据库）
		Deployment deploy = repositoryService.createDeployment()
				.name("请假申请流程") // 流程部署的名称
				.addClasspathResource("bpmn/leave.bpmn") // 流程资源相对路径
				.addClasspathResource("bpmn/leave.png")
				.deploy(); // 完成部署

		// 4.输出部署信息
		System.out.println("流程部署id=" + deploy.getId());
		System.out.println("流程部署name=" + deploy.getName());
	}



	// 查询流程定义

	/**
	 * 流程查询涉及的表
	 * ACT_RE_DEPLOYMENT
	 *
	 * ID_：流程部署ID。
	 * NAME_：流程部署名称。
	 * DEPLOY_TIME_：部署时间。
	 * ACT_RE_PROCDEF
	 *
	 * ID_：流程定义ID，组成规则为【流程定义KEY:版本号:自增长ID】。
	 * KEY_：流程定义KEY。
	 * NAME_：流程定义的名称，在BPMN设计的时候编写。
	 * VERSION_：流程定义版本号。
	 * DEPLOYMENT_ID_：该流程定义对应的流程部署ID。
	 */
	@Test
	public void testQueryProcessDefinition() {
		// 1.获取流程引擎ProcessEngine
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();

		// 2.获取RepositoryService
		RepositoryService repositoryService = processEngine.getRepositoryService();

		List<ProcessDefinition> processDefinitionList =
				repositoryService.createProcessDefinitionQuery()
						// 添加查询条件
						.processDefinitionName("流程定义的name")
						.processDefinitionId("流程定义的id")
						.processDefinitionKey("流程定义的key")
						// 排序
						.orderByProcessDefinitionVersion().asc()
						//查询结果
						//.count() // 返回结果集的数量
						//.listPage(firstResult, maxResults) // 分页查询
						//.singleResult() // 只返回一个结果
						.list(); // 返回总的结果集

		for(ProcessDefinition processDefinition:processDefinitionList){
			System.out.println("id:" +processDefinition.getId());
			System.out.println("name:" +processDefinition.getName());
			System.out.println("key:" +processDefinition.getKey());
			System.out.println("version:" +processDefinition.getVersion());
			System.out.println("resourceName:" +processDefinition.getDiagramResourceName());
		}
	}

}
