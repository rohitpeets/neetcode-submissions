class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ls=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            int[]intString=new int[26];
            for(int j=0;j<strs[i].length();j++){
                intString[strs[i].charAt(j)-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for (int k:intString){
                sb.append("#").append(k);
            }
            String key=sb.toString();
            if(ls.containsKey(key)){
                List<String> inner=ls.get(key);
                inner.add(strs[i]);
                ls.put(key,inner);
            }else if(!ls.containsKey(key)){
                List<String> input = new ArrayList<>();
                input.add(strs[i]);
                ls.put(key,input);
            }


        }
        return new ArrayList<>(ls.values());
        
    }
}
