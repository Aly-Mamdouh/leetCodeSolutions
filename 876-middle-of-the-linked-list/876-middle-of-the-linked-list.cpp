class Solution {
public:
    ListNode* middleNode(ListNode* head)
    {
        ListNode* p = head, *q = head;
        while (q and q->next)
        {
            p = p->next;
            q = q->next->next;
        }
        return p;
    }
};