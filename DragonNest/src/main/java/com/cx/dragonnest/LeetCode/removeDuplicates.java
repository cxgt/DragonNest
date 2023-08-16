package com.cx.dragonnest.LeetCode;

import com.alibaba.fastjson2.JSONObject;
import com.alibaba.nacos.shaded.com.google.gson.JsonObject;

import java.util.Arrays;

/**
 * @author chenxin
 * @date 2023/08/02 17:08
 */
public class removeDuplicates {

	public static void main(String[] args) {
		int[] ints=new int[]{1,1,2,3,3,3,4,4,4,55};
		int i = removeDuplicates(ints);
		System.out.println(JSONObject.toJSONString(Arrays.copyOfRange(ints,0,i+1)));
		System.out.println(JSONObject.toJSONString(ints));
	}
	public static int removeDuplicates(int[] nums) {
		if(nums == null && nums.length == 0) return 0;

		int slowPoint=0;
		int fastPoint=1;

		while(fastPoint < nums.length){
			if(nums[slowPoint] != nums[fastPoint]){
				nums[slowPoint+1] =nums[fastPoint];
				++slowPoint;
			}
			++fastPoint;
		}
		return slowPoint;
	}
}
