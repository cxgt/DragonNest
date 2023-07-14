package com.cx.dragonnest.TrySomething;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author chenxin
 * @date 2023/07/12 16:01
 */
public class TryPredicate {
	public static List<String> STUDENTS = Arrays.asList(
			"Lucy", "Tomas Kyte", "James Bond", "Yamlis", "Jack Luis"
	);

	public static void testPredicateAnd() {
		Predicate<String> letterLengthLimit = s -> s.length() > 5;
		Predicate<String> letterStartWith = s -> s.startsWith("J");
		// 打印长度大于5并且以J开头的学生名字
		STUDENTS.stream().filter(
				letterLengthLimit.and(letterStartWith)
		).forEach(System.out::println);
	}

	public static void testPredicateOr() {
		Predicate<String> letterLengthLimit = s -> s.length() > 5;
		Predicate<String> letterStartWith = s -> s.startsWith("J");
		// 打印长度大于5并且或者以J开头的学生名字
		STUDENTS.stream().filter(
				letterLengthLimit.or(letterStartWith)
		).forEach(System.out::println);
	}

	public static void testPredicateNegative() {
		Predicate<String> letterLengthLimit = s -> s.length() > 5;
		Predicate<String> letterStartWith = s -> s.startsWith("J");
		// 打印长度大于5并且不是以J开头的学生名字
		STUDENTS.stream().filter(
				letterLengthLimit.and(letterStartWith.negate())
		).forEach(System.out::println);
	}

	public static void testPredicateIsEqual() {
		Predicate<String> letterEqualPredicate = s -> Predicate.isEqual("Lucy").test(s);

		STUDENTS.stream().filter(
				letterEqualPredicate
		).forEach(System.out::println);
	}

	public static void main(String[] args) {
		// 创建谓词函数
		Predicate<Integer> pr = a -> (a > 18);
		// 利用谓词函数对参数做判断，满足谓词条件返回true否则false
		System.out.println(pr.test(19));

		System.out.println(">>>>测试and:");
		testPredicateAnd();
		System.out.println(">>>>测试or:");
		testPredicateOr();
		System.out.println(">>>>测试negative:");
		testPredicateNegative();
		System.out.println(">>>>测试isEqual:");
		testPredicateIsEqual();
	}

}
