class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
            
        int[] counter = new int[26];

        for(char c : s.toCharArray()){
            counter[c - 'a']++;
        }

        for(char c : t.toCharArray()){
            counter[c - 'a']--;
        }

        for(int value : counter){
            if(value != 0)
                return false;
        }

        return true;
    }
}