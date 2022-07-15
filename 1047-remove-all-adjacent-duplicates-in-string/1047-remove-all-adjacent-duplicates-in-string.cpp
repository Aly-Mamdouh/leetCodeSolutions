class Solution {
public:
    string removeDuplicates(string s) {
        stack<char>st;
		int i = 0;
		while(i<s.size()){
			if (st.empty() ||  s[i]!= st.top()) {
				st.push(s[i]);
				i++;
			}
			else {
				st.pop();
				i++;
			}
		}
		
		string str = "";
		while (!st.empty())
		{
			str = st.top() +str;
			st.pop();
		}
        return str;
    }
};