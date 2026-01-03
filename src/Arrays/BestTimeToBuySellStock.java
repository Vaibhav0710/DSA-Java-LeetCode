
/**
 * Problem: BestTimeToBuySellStock
 * Platform: LeetCode
 * Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 *
 * Approach:
 * Brute Force: 
 * Best approch: 
 * -
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

import java.util.*;

public class BestTimeToBuySellStock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] prices = new int[n];
        System.out.print("Enter prices: ");
        for (int i = 0; i < n; i++)
            prices[i] = sc.nextInt();

        int profit = maxProfit(prices);
        System.out.println("Max Profit: " + profit);
        sc.close();
    }

    // Solution Method
    private static int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            }
            profit = Math.max(profit, prices[i] - buyPrice);
        }
        return profit;
    }
}
