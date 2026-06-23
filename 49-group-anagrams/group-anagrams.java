class Solution {
    public List<List<String>> groupAnagrams(String[] arr){
    HashMap<String, List<String>> mp = new HashMap<>();
    int n =  arr.length;
    for(int i = 0; i < n; i++){
        String curr = arr[i];
        char[] a = curr.toCharArray();
        Arrays.sort(a);
        String sorted = new String(a);
        if(!mp.containsKey(sorted)){
            mp.put(sorted, new ArrayList<>());
        }
        mp.get(sorted).add(curr);
    }
    List<List<String>> ans = new ArrayList<>();
    for(List<String>s : mp.values()){
        ans.add(s);
        }
        return ans;
    }
}