class Solution {
public:
    int maxSubArray(vector<int>& v) {
      int mx = v[0];
		int sum = v[0];
		for (int i = 1;i < v.size() ;i++) {
			sum += v[i];
			sum = max(sum, v[i]);
			mx = max(mx, sum);
		}
        return mx;
    }
};