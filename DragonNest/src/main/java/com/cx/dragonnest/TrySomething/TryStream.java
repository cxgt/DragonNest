package com.cx.dragonnest.TrySomething;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @author chenxin
 * @date 2023/07/12 15:39
 */
public class TryStream {
	void testForEach(List<String> stringList){
		stringList.stream().forEach(s -> System.out.println(s));
		System.out.println("------------");
		stringList.stream().forEach(s -> s=s+"c");
		stringList.stream().forEach(s -> System.out.println(s));
	}

	void tryMap(List<String> stringList){
		stringList.stream().forEach(s -> System.out.println(s));
		System.out.println("------------");
		stringList.stream().map(s -> s+"a");
		stringList.stream().forEach(s -> System.out.println(s));
	}

	void testFilter(List<String> stringList){
		System.out.println(stringList.stream().filter(s -> StringUtils.isBlank(s)).count());
	}
	public static void main(String[] args) {
		List<String> intList= Arrays.asList("1","2","3","4","5");
		List<String> stringList= Arrays.asList("cx","gss","jcm",""," ");
		TryStream stream=new TryStream();
		stream.testFilter(stringList);
//		stream.testForEach(stringList);
//		stream.tryMap(stringList);
	}
}
