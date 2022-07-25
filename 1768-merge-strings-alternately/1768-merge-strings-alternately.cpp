class Solution {
public:
    string mergeAlternately(string s, string x) {
        string str="",re="";
        int mn = min(s.size(), x.size());
		for (int i = 0;i < mn;i++) {
			str += s[i];
			str += x[i];
		}
		if (mn == s.size()) {
			for (int i = mn;i < x.size();i++) {
				re += x[i];
			}
		}
		else {
			for (int i = mn;i < s.size();i++) {
				re += s[i];
			}
		}
		str += re;
        return str;
    }
};