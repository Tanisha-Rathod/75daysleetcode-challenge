class Solution {
    int n;
    public void backtrack(int[] nums, int idx,  List<List<Integer>>res, List<Integer>curr ){
        if(curr.size()>=2){
            res.add(new ArrayList<>(curr));
        }
        Set<Integer>set = new HashSet<>();
        for(int i=idx; i<n; i++){

if (set.contains(nums[i])) {
                continue;
            }


            if(curr.isEmpty() ||  nums[i]>= curr.get(curr.size()-1)){
                curr.add(nums[i]);// inclue
                backtrack(nums, i+1,  res, curr);
                curr.remove(curr.size()-1);
                set.add(nums[i]);
            }

        }
    }


    public List<List<Integer>> findSubsequences(int[] nums) {
        n = nums.length;
        List<List<Integer>>res = new LinkedList<>();
        List<Integer>curr = new ArrayList<>();


backtrack(nums, 0,  res, curr);
        return res;
    }
}