package com.careerdevs.Edabit;

public class MaximumDifference {
    public static void main(String[] args) {
        difference(new int[]{-9, -8, 6, -9, 15, 6});
    }

    public static int difference(int[] nums) {

        int biggestNum = nums[0];
        int lowestNum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > biggestNum) {
                biggestNum = nums[i];
            } else if (nums[i] < lowestNum) {
                lowestNum = nums[i];
            }
        }
        return biggestNum - lowestNum;
    }

// Additional solution, requires importing Arrays
//    Arrays.sort(nums);
//		return nums[nums.length - 1] - nums[0];
}
