package com.cx.dragonnest.LeetCode;

/**
 * @author chenxin
 * @date 2023/07/31 15:56
 */
public class IsPalindrome {
	public boolean isPalindrome(int x){
		if(x <0 || (x % 10 ==0 && x != 0)){
			return false;
		}

		int reverseNum=0;
		while (x > reverseNum){
			/**
			 * 回文数 其实只需要反转一半的数字就可以进行比较 但是需要注意中位数的处理
			 * 如何判断是否反转一半 当反转的数大于等于 剩余的数据时 就代表已经反转一半数据了。
			 *
			 */
			reverseNum=reverseNum*10 + x%10;
			x /= 10;
		}

		return reverseNum == x || x== reverseNum/10;
	}
}
