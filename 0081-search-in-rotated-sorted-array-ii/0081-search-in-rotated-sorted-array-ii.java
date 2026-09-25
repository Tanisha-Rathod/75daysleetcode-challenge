class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int st = 0;
        int end =n-1;;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(target== nums[mid]){
                return true;
            }
            if(nums[st]==nums[mid]&& nums[end]==nums[mid]){
                st++;
                end--;
                continue;

            }
            if(nums[st]<=nums[mid]){//left sorted
            if(nums[st]<=target && target<=nums[mid]){
                end = mid-1;//left
            }else{
                st = mid+1;//right
            }


            }else{//right sorted

            if(nums[mid]<=target && target<=nums[end]){
st = mid+1;
            }else{
                end = mid-1;
            }
        }
        }
        return false;
    }
}