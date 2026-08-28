class Solution {
    private void getpermutation(int[] nums,  int idx, List<List<Integer>>ans ){
        List<Integer> list = new ArrayList<>();
        if(idx==nums.length){
            for(int num:nums){
                list.add(num);
            }
            ans.add(list);
            return ;

        }


        for(int i=idx; i<nums.length; i++){
int temp = nums[idx];
 nums[idx] = nums[i]; nums[i] = temp;
                 

            // swap(nums[idx], nums[i]);
            getpermutation(nums,idx+1,ans);
           temp = nums[idx];
 nums[idx] = nums[i]; nums[i] = temp;
            // swap(nums[idx],nums[i]);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        // List<Integer>list = new LinkedList<>();
        List<List<Integer>>ans = new LinkedList<>();
        getpermutation(nums,0, ans);
        return ans;



        
    }
}