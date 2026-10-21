class Solution {
    int ans;
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer>map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            // map.put(nums[i], map.getOrDefault(0)+1);
       ans = target-nums[i];
          if(map.containsKey(ans)){
            return new int[]{map.get(ans), i};
          }else{
            map.put(nums[i], i);
          }
    }
    
    return new int []{-1,-1};    
    }
}