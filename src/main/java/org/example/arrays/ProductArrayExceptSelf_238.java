package org.example.arrays;

import java.util.Arrays;

public class ProductArrayExceptSelf_238 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        ProductArrayExceptSelf_238 productArrayExceptSelf_238 = new ProductArrayExceptSelf_238();
        productArrayExceptSelf_238.productExceptSelf(nums);
    }

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        for(int i = 1; i < n; i++) {
            ans[i] = ans[i-1] * nums[i-1];
        }
        //System.out.println("1 > " + Arrays.toString(ans));
        int curr = 1;
        for(int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        //System.out.println(Arrays.toString(nums));
        //System.out.println(Arrays.toString(ans));
        return ans;

    }
}
