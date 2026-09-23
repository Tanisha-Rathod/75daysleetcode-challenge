class Solution {
    public boolean backspaceCompare(String s, String t) {
       int n = s.length();
       int m = t.length();
       int i = n-1;
       int j = m-1;
       int skipS = 0;
       int skipT = 0;
       while(i>=0 ||j>=0){
        while(i>=0){
            if(s.charAt(i)=='#'){
                skipS++;
                i--;
            }else if (skipS>0){
                skipS--;
                i--;
            }else{
                break;
            }
        }
       

       while(j>=0){
            if(t.charAt(j)=='#'){
                skipT++;
                j--;
            }else if (skipT>0){
                skipT--;
                j--;
            }else{
                break;
            }
        }
            if (i >= 0 && j >= 0) {
                if (s.charAt(i) != t.charAt(j)) {
                    return false;
                }
            }

            // One string has a character, other doesn't
            if ((i >= 0) != (j >= 0)) {
                return false;
            }

            i--;
            j--;
        }

        return true;


    }
}