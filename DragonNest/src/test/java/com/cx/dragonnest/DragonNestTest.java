package com.cx.dragonnest;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cx.dragonnest.entity.InfoNbrUser;
import com.cx.dragonnest.service.InfoNbrUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

/**
 * @author chenxin
 * @date 2023/06/30 11:03
 */
@SpringBootTest
public class DragonNestTest {
	// 当使用@Autowired注解的时候，其实默认就是@Autowired(required=true)，表示注入的时候，该bean必须存在，否则就会注入失败。
	// @Autowired(required=false)：表示忽略当前要注入的bean，如果有直接注入，没有跳过，不会报错
	@Autowired(required = false)
	private InfoNbrUserService infoNbrUserService;
	@Test
		//添加数据
//	this.accNbr = accNbr;
//		this.userId = userId;
//		this.state = state;
//		this.endTime = endTime;
//		this.provinceNo = provinceNo;
//		this.destroyTime = destroyTime;
	void save(){
		InfoNbrUser stu=new InfoNbrUser(null,"13314765711","123123",1,null,"78",null);
		infoNbrUserService.save(stu);
		System.out.println(stu);
	}
	@Test
		//修改数据
	void update(){
		InfoNbrUser stu=new InfoNbrUser(9L,"13314765711","123123",2,null,"78",null);
		infoNbrUserService.updateById(stu);
		System.out.println(stu);
	}
	@Test
		//删除数据
	void del(){
		//根据id删除单个
		// boolean res=stuService.removeById(6);
		//批量删除
		List<Integer> ids= Arrays.asList(1,3);
		boolean res=infoNbrUserService.removeByIds(ids);
		System.out.println(" 删除："+res);
	}

	@Test
		//查找数据
	void  findAll(){
		// Stu stu=stuService.getById(6);
		// System.out.println(stu.toString());

		// List<Integer> ids=Arrays.asList(3,5);
		// List<Stu> stus=stuService.listByIds(ids);
		// for (Stu stu1:stus)
		//     System.out.println(stu1.toString());
		//
		List<InfoNbrUser> stuList= infoNbrUserService.list();
		for (InfoNbrUser stu1:stuList)
			System.out.println(stu1.toString());
	}
	@Test
	void findsome(){
		QueryWrapper<InfoNbrUser> wrapper=new QueryWrapper<>();
		wrapper.select("id","acc_nbr","province_no")
				.gt("acc_nbr", 13000000);
		System.out.println(infoNbrUserService.list(wrapper));
	}
	@Test
	void findwithXml(){
		// //如果涉及到复杂数据库操作，还是需要编写mapper.xml文件
		// 1、定义接口映射器StuMappper，并提供接口方法getByage()，
		// 2.在resource/mapper创建和Mapper接口名称相同的SQL映射文件：StuMapper.xml
		// 其中namespace应该对应接口路径，
		// 3. 编写sql语句，id对应接口方法，返回值对应实体类或者其他数据类型
		//4，服务层调用该接口方法即可实现对应功能。
		System.out.println(infoNbrUserService.queryAllInfoNbrUser());
	}
}
