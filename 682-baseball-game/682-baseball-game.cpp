class Solution {
public:
    int calPoints(vector<string>& ops) {
        
       stack<int>st;
		for (int i = 0;i < ops.size();i++) {
			string str = ops[i];
			if (!st.empty()&&str == "C") {
				st.pop();
			}
			else if (!st.empty()&&ops[i] == "D") {
				st.push(st.top() * 2);
			}
			else if (ops[i] == "+") {
				int a = st.top();
				st.pop();
				int b = st.top();
				st.pop();
				int c = a + b;
				st.push(b);
				st.push(a);
				st.push(c);
			}
			else {
				st.push(stoi(ops[i]));
			}
		}
		int sum = 0;
		while (!st.empty()) {

			int c = st.top();
			st.pop();
			sum = sum + c;
		}
        return sum;
        
    }
};