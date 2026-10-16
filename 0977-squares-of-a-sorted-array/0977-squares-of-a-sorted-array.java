class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
         int tan[] = new int[n];
        for(int i=0; i<n; i++){
          tan[i]=   nums[i]*nums[i];
        }
        Arrays.sort(tan);
        return tan;
    }
}