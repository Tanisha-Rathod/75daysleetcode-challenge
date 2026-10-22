class Solution {
    int n;
    int maxlen;

     private Set<String>st = new HashSet<>();
private void solve(String s, int i, StringBuilder curr, int count){
    if(count<0)return;
    if(i==n){
    if(count==0){
        if(maxlen<curr.length()){
             maxlen = curr.length();
             st.clear();
        }
        if(curr.length()==maxlen){
            st.add(curr.toString());
        }}
        return;
    }
    char c = s.charAt(i);
    if(c!='(' && c!=')'){
        curr.append(c);
        solve(s,i+1, curr, count);
        curr.deleteCharAt(curr.length()-1);
        return;
    }
        curr.append(c);
solve(s,i+1,curr, count+(c=='('?1:-1));
curr.deleteCharAt(curr.length()-1);
solve(s,i+1,curr,count);
return;
}
    

    public List<String> removeInvalidParentheses(String s) {
n = s.length();
maxlen = 0;
st.clear();
solve(s,0,new StringBuilder(),0);
return new ArrayList<>(st);
        
    }
}