class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int rem = (100 - purchaseAmount) % 10;

        return (rem > 5) ? (100 - purchaseAmount) + (10 - rem) : (100 - purchaseAmount) - (100 - purchaseAmount) % 10;
    }
}