package DSA.basics;

import java.util.HashMap;

public class Recursion {
	public static  int[] smallerNumbersThanCurrent(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap();
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i])) {
				continue;
			}
			for (int j = 0; j < nums.length; j++) {
				if (!map.containsKey(nums[i])) {
					map.put(nums[i], 0);
				}
				if (nums[j] < nums[i]) {
					map.put(nums[i], map.get(nums[i]) + 1);
				}
			}
		}
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			result[i] = map.get(nums[i]);
		}
		return result;
	}

	public static void main(String[] args) {
		smallerNumbersThanCurrent(new int[] {8,1,2,2,3});
	}
}
