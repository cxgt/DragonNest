package com.cx.dragonnest.LeetCode;

/**
 * @author chenxin
 * @date 2023/07/31 17:09
 */
public class RomanToInt {
	public static void main(String[] args) {
		System.out.println(romanToInt2("III"));
	}

	public static int romanToInt2(String s) {
		int num =getValue(s.charAt(0));
		int sum=0;
		for (int i = 1; i < s.length(); i++) {
			int prenum=getValue(s.charAt(i));
			if(num >= prenum ){
				sum = sum + num;
			}else{
				sum = sum - num;
			}
			num=prenum;
		}
		return sum+num;
	}
	public int romanToInt(String s) {
		int sum = 0;
		int preNum = getValue(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			int num = getValue(s.charAt(i));
			if (preNum < num) {
				sum -= preNum;
			} else {
				sum += preNum;
			}
			preNum = num;
		}
		sum += preNum;
		return sum;

	}
		//LVIII  50+
	private static int getValue(char ch) {
		switch (ch) {
			case 'I':
				return 1;
			case 'V':
				return 5;
			case 'X':
				return 10;
			case 'L':
				return 50;
			case 'C':
				return 100;
			case 'D':
				return 500;
			case 'M':
				return 1000;
			default:
				return 0;
		}
	}
}
