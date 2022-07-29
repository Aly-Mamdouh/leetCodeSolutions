class Solution {
public:
    int sumOfLeftLeaves(TreeNode* root) {
        int sum=0;
        func(root, 0, sum);
        return sum;
    }
    
    void func(TreeNode* root, int take, int &sum){
        if(!root)
            return;
        
        if(!root->left && !root->right){
            if(take==1)
                sum += root->val;
            return;
        }
        
        func(root->left, 1, sum);
        func(root->right, 0, sum);
    }
};