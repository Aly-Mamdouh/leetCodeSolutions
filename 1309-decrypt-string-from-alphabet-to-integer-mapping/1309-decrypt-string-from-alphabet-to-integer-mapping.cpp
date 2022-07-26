class Solution {
public:
    string freqAlphabets(string s) {
        vector<pair<int, char>>p;
		vector<int>v;
		for (int i = 1;i <= 26;i++) {
			p.push_back(make_pair(i, char(96 + i)));
		}
		
		for (int i = 0;i < s.size();) {
			
				if (i+2<s.size()&&s[i + 2] == '#') {
					int n = stoi(s.substr(i, 2));
					v.push_back(n);
					i += 3;
				}
				else {
					int n = stoi(s.substr(i, 1));
					v.push_back(n);
					i++;
				}
			
		}
		string str ;
		for (auto f : v) {
			for (auto d : p) {
				if (f == d.first) {
					str += d.second;
				}
			}
		}
        return str;
    }
};