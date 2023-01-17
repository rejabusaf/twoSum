package twoSum;

import java.util.Arrays;

public class twoSum {
	public static int [] twoSumIndex(int[] nums, int target) {
		int i = 0;
		int j = 0;
		int x = 0;
		int y = 0;
		int c1;
		int c2;
		while(i < nums.length) {
			c1 = nums[i];
			j = i + 1;
			while(j < (nums.length)) {
				c2 = nums[j];
				if(target == (c1 + c2)) {
					x = i;
					y = j;
				}
				j++;
			}
			i++;
		}
		int[] posArray = {x, y};
		return posArray;

	}

	public static void main(String[] args) {
		int [] nums = {3,10,11,12,7,4};
		int target = 18;
		int [] result = twoSumIndex(nums, target);
		System.out.println(Arrays.toString(result));

	}
}

