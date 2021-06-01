package leetcode.zsy.dynamic.num121;

/**
 * @author zousy
 * @version v1.0
 * @Description
 * @date 2021-06-01 16:36
 */
public class Solution {
    //public static int maxProfit(int[] prices) {
    //    int[] dp = new int[prices.length];
    //    for (int i = 0; i < prices.length-1; i++) {
    //        int price = max(prices,i+1) - prices[i];
    //        if (price < 0){
    //            dp[i] = 0;
    //        }
    //        dp[i] = price;
    //    }
    //    dp[prices.length-1] = 0;
    //    return max(dp,0);
    //}
    //
    //public static int max(int[] prices,int begin){
    //    int max = prices[begin];
    //    for (int i = begin; i < prices.length-1; i++) {
    //        int n = prices[i + 1];
    //        max = Math.max(max,n);
    //    }
    //    return max;
    //}

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }

}
