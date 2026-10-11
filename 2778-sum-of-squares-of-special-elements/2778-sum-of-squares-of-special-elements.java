class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int yes = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                //since java is 0 based index 
                 yes += nums[i-1]*nums[i-1];
            }
        }
        return yes;
    }
}