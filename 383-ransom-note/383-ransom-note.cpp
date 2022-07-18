class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        bool ok = false;
       
        sort(ransomNote.begin(), ransomNote.end());
		sort(magazine.begin(), magazine.end());

		int cnt = 0;
		for (auto d : magazine) {
			if (d == ransomNote[cnt]&&cnt<ransomNote.size()) {
				cnt++;
			}
		}
		if (cnt >= ransomNote.size()) {
            ok = true;
		}
        else{
            ok=false;
        }
        return ok;
    }
};