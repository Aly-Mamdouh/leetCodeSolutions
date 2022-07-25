class Solution {
public:
    char findTheDifference(string s, string x) {
    	char str = ' ';
        sort(s.begin(), s.end());
		sort(x.begin(), x.end());
		for (int i =0;i < s.size();i++) {
			if(s[i]!=x[i])
				return x[i];
		}
		return x[x.size() - 1];
        
    }
};