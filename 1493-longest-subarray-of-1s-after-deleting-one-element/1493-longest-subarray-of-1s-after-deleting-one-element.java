class Solution {
    public int longestSubarray(int[] nums) {
        int i=0;
        int j = 0;
        int max = 0;
        int count = 0;int n = nums.length;
        while(j<n){
            if(nums[j]==0 ){
                // nums.remove(j);
                count ++;
            }
            // z=0
            while(count>=2){
                if(nums[i]==0){
                 count--;
                }
                i++;
            }
            max = Math.max(max,j-i);
            j++;
        }
return max;
        
    }
}
