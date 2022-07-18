class Solution {
public:
    int firstUniqChar(string s) {
        map<char, int>mp;
		for (int i = 0;i < s.size();i++) {
			mp[s[i]]++;
		}
		bool ok = false;
		int idx = -1;
		for (int i = 0;i < s.size();i++) {
			if (mp[s[i]] == 1) {
				ok = true;
				idx = i;break;
			}
		}
		if (ok) {
			return idx ;
		}
		else {
			return -1;
		}
    }
};