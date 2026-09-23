class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>s = new Stack<>();
        for( String ops:operations){
            if(ops.equals("C")){
                s.pop();
            }else if(ops.equals("D")){
                s.push(2*s.peek());
            }else if(ops.equals("+")){
                int a = s.pop();
                int b = s.peek();
                s.push(a);
                s.push(a+b);
            }else{
                s.push(Integer.parseInt(ops));
            }
        }
        int sum =0;
        while(!s.isEmpty()){
            sum+=s.pop();
        }
        return sum;
    }
}