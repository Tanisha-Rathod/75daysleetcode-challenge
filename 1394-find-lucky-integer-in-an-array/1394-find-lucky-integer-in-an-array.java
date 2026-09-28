class Solution {
    public int findLucky(int[] arr) {
        // Heap<Integer,Integer>heap  =new Heap<>();
         Map<Integer, Integer> map = new HashMap<>();
         for(int  num:arr){
            map.put(num, map.getOrDefault(num,0)+1);
         }
         int ans = -1;
         for(int num : map.keySet()){
            if(map.get(num)==num){
                ans = Math.max(ans,num);
            }
         }
         return ans;
    }
}