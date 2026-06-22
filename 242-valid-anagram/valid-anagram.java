class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mp = new HashMap<>();
        
        if (s.length() != t.length()) return false;
        
        int n = s.length();
        
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            mp.put(c, mp.getOrDefault(c, 0)+1);
        }
        
        for(int i = 0; i < n; i++){
            char c = t.charAt(i);
            if(!mp.containsKey(c)) return false;
            mp.put(c, mp.get(c)-1);
            if(mp.get(c) == 0){
                mp.remove(c);
            }
        }
        
        if(mp.isEmpty()) return true;
        return false;
    }
}