package basicProgram.leetcode;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0 ; j--) {
                if (nums[i] + nums[j] == target && nums[i] != nums[j]){
                    System.out.print("[ " + i + "," + j + "]");
                    break;
                }
                //System.out.print(nums[i]);
                //System.out.println();

            }

        }

    }


}
