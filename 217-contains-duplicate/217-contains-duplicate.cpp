class Solution {
public:
    bool containsDuplicate(vector<int>& v) {
        bool ok = false;
		sort(v.begin(), v.end());
		for (int i = 0;i < v.size() - 1;i++) {
			if (v[i] == v[i + 1]) {
				ok = true;break;
			}
		}
        return ok;
    }
};