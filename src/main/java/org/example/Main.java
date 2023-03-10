package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {2, 1, 2};

        System.out.print(solution.singleNumber(nums));
    }
}

class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++){
            ans ^= nums[i];
        }
        return ans;
    }
}