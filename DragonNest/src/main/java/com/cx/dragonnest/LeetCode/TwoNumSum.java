package com.cx.dragonnest.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chenxin
 * @date 2023/07/31 14:25
 */
public class TwoNumSum {
	/**
	 * 循环
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSumForCirculate(int[] nums, int target) {
		int[] ans = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					ans[0] = i;
					ans[1] = j;
					return ans;
				}
			}
		}
		return ans;
	}


	/**
	 * Sort + double pointer
	 * 排序+双指针
	 *
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSumWithSortAndDoublePointer(int[] nums, int target) {
		int m = 0, n = 0, k, board = 0;
		int[] res = new int[2];
		int[] tmp1 = new int[nums.length];
		System.arraycopy(nums, 0, tmp1, 0, nums.length);
		Arrays.sort(nums);
		for (int i = 0, j = nums.length - 1; i < j; ) {
			if (nums[i] + nums[j] < target)
				i++;
			else if (nums[i] + nums[j] > target)
				j--;
			else if (nums[i] + nums[j] == target) {
				m = i;
				n = j;
				break;
			}
		}
		for (k = 0; k < nums.length; k++) {
			if (tmp1[k] == nums[m]) {
				res[0] = k;
				break;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (tmp1[i] == nums[n] && i != k)
				res[1] = i;
		}
		return res;
	}


	/**
	 * 利用哈希表
	 *
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSumWithHashTable(int[] nums, int target) {
		Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; ++i) {
			if (hashtable.containsKey(target - nums[i])) {
				return new int[]{hashtable.get(target - nums[i]), i};
			}
			hashtable.put(nums[i], i);
		}
		return new int[0];
	}


}
