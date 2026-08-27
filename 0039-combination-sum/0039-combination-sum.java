class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
List<List<Integer>>result = new ArrayList<>();
ArrayList<Integer>curr = new ArrayList<>();


backtrack(candidates,target,0,result,curr);
        return result;

    }

    private void backtrack(int[] candidates,int target,int start,List<List<Integer>>result,ArrayList<Integer>curr  ){
        if(target==0){
            result.add(new ArrayList(curr));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=start; i<candidates.length; i++){
        curr.add(candidates[i]);
        //single
        backtrack(candidates, target-candidates[i], i, result,curr);
        curr.remove(curr.size()-1);
    }
    
    }
}