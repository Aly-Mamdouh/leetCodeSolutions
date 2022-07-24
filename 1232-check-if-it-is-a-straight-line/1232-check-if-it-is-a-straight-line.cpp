class Solution {
public:
    bool checkStraightLine(vector<vector<int>>& coordinates) {
        vector<int>& p0 = coordinates[0], &p1=coordinates[1];
        int dx = p1[0]-p0[0], dy = p1[1]-p0[1];
        int n = coordinates.size();
        for(int i=2; i<n; i++) {
            vector<int>& pi = coordinates[i];
            int dX = pi[0]-p0[0], dY = pi[1]-p0[1];
            //Need to make sure dy/dx == dY/dX , so make sure dx*dY == dX*dy
            if(dx*dY!=dX*dy) return false;
        }
        return true;
    }
};