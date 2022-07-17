class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        
        bool clm = true, row = true, bo = true,ok=false;
		// colum
		for (int i = 0;i < 9;i++) {
			int cnt = 0;
			map<char, int>mpc;
			for (int j = 0;j < 9;j++) {
				if (board[i][j] != '.') {
					char ch = board[i][j];
					cnt++;
					mpc[ch]++;
				}
			}

			if (mpc.size() != cnt) {
				clm = false;break;
			}
		}
		// row
		for (int i = 0;i < 9;i++) {
			int cnt = 0;
			map<char, int>mpr;
			for (int j = 0;j < 9;j++) {
				if (board[j][i] != '.') {
					char ch = board[j][i];
					cnt++;
					mpr[ch]++;
				}
			}
			if (mpr.size() != cnt) {
				row = false;break;
			}
		}
		//check each 3*3 matrix
		for (int bl = 0; bl < 9; bl++) {
			int cnt = 0;
			map<char, int>mpbl;
			for (int i = bl / 3 * 3; i < bl / 3 * 3 + 3; i++) {
				for (int j = bl % 3 * 3; j < bl % 3 * 3 + 3; j++) {
					if (board[i][j] != '.') {
						char ch = board[i][j];
						cnt++;
						mpbl[ch]++;
					}
				}
				if (mpbl.size() != cnt) {
					bo = false;break;
				}
			}
		}

		if (clm && row && bo) {
			ok = true;
		}
		else {
			ok = false;
		}
        
        return ok;
        
    }
};