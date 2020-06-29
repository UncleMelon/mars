package com.wy.dp;

/**
 * @author matthew_wu
 * @since 2020/6/28 21:09
 */
public class LongestIncreasingSubsequence {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{10,9,2,5,3,7,101,18}));
    }

    private static int solution(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        int[] dp = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }


        int res = 0;
        for (int value : dp) {
            res = Math.max(res, value);
        }

        return res;
    }


}
