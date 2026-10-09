class Solution {
    public int maxVowels(String s, int k) {
        int count =0;
        String v = "aeiou";
        int max = 0;
        for(int i=0; i<k; i++){
            if(v.indexOf(s.charAt(i))!=-1){
            count++;}
        }
        max = count;
        int i=0;
        int j =k;
        while(j<s.length()){
            //shrink
            if(v.indexOf(s.charAt(i))!=-1){
                count--;
            }
            i++;
            if(v.indexOf(s.charAt(j))!=-1){
                count++;
            }
            max = Math.max(max , count);
            j++;
        }
        return max;
    }
}