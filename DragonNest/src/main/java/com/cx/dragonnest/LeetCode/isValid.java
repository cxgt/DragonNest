package com.cx.dragonnest.LeetCode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author chenxin
 * @date 2023/08/02 15:19
 */
public class isValid {
	private static final Map<Character, Character> hashMap = new HashMap<Character, Character>() {{
		put('{', '}');
		put('[', ']');
		put('(', ')');
		put('?', '?');
	}};
	public static void main(String[] args) {
		System.out.println(isValid("(){}}{"));
	}

	public static boolean isValid(String s) {
		LinkedList checkList=new LinkedList();
		checkList.addFirst("?");

		for (Character c : s.toCharArray()) {
			if(hashMap.containsKey(c))checkList.addLast(c);
			else if(hashMap.get(checkList.removeLast()) != c) return false;
		}

		return checkList.size() == 1 ;
	}
}
