class Solution {
public:
    bool arrayStringsAreEqual(vector<string>& v1, vector<string>& v2) {
        	string res1="", res2="";
		for (int i = 0;i < v1.size();i++) {
			res1 += v1[i];
		}
		for (int i = 0;i < v2.size();i++) {
			res2 += v2[i];
		}
	
		if (res1 == res2) {
			return true;
		}
		else {
			return false;
		}
    }
};