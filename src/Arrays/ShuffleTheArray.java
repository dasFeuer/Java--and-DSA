package Arrays;

import java.util.Arrays;

public class ShuffleTheArray {
    static int[] shuffle(int[] nums, int n){
        int[]ans = new int[2*n];
        for (int i = 0; i < n; i++) {
            ans[2*i] = nums[i];
            ans[(2*i) + 1] = nums[i + n];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]nums = {2,5,1,3,4,7};
        int n = 3;
        int[] result = shuffle(nums, n);
        System.out.println(Arrays.toString(result));
    }
}
