class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        double amount = 0;

        Arrays.sort(prices);
        Arrays.sort(discounts);

        int i = prices.length - 1;
        int j = discounts.length - 1;

        while (i >= 0 && j >= 0) {
            amount += prices[i] * (100 - discounts[j]) / 100D;
            i--;
            j--;
        }

        while (i >= 0) {
            amount += prices[i];
            i--;
        }
        return amount;
    }
}