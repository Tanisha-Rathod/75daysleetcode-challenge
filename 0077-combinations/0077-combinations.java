class Solution {
    private static void solve(int start, int n , int k, List<Integer>temp, ArrayList<List<Integer>>list){
        if(k==0){
            list.add(new ArrayList<>(temp));
            return;
        }
        // if(start>n){
        //     return;
        // }



        for(int i=start; i<=n; i++){
            temp.add(i);
            solve(i+1,n,k-1,temp,list);
            temp.remove(temp.size()-1);
        }

    }
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<List<Integer>>list = new ArrayList<>();
        // List<<List<Integer>>temp = new ArrayList<>();
        // List<Integer> temp;
        List<Integer> temp = new ArrayList<>();
        solve(1,n, k ,temp,list);
        return list;
        
    }
}