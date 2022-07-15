class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int mx = 0,mn=prices[0];
		for (int i = 1;i < prices.size();i++) {
			int cur =prices[i]-mn;
			mx = max(mx, cur);
			if (prices[i] < mn) {
				mn = prices[i];
			}
		}
        return mx;
    }
};