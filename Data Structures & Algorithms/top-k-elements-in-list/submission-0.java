class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> ls=new HashMap<>();
        for(int i:nums){
            if(ls.containsKey(i)){
                ls.put(i,ls.get(i)+1);
            }else{
                ls.put(i,1);
            }
        }
        PriorityQueue<Integer> heap=new PriorityQueue<>((a,b) ->ls.get(a)-ls.get(b));
        for (int n:ls.keySet()){
            heap.add(n);
            if(heap.size()>k){
                heap.poll();
            }
            
        }
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = heap.poll();
        }
        return result;
        
    }
}
