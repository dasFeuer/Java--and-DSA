package Arrays;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        int[] answer = getConcatenation(nums);
        System.out.println(Arrays.toString(answer));
    }


    static int[] getConcatenation(int[] nums){
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }

}
