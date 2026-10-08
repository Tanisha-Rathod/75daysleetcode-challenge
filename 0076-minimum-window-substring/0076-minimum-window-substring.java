class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        if(n<t.length()) return "";
        Map<Character, Integer>map = new HashMap<>();
        //storing
        for(char ch : t.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int i=0;
        int j =0;
        int starti = i;
        int minwindow = Integer.MAX_VALUE;
        int countreq = t.length();
        while(j<n){
            char ch = s.charAt(j);
            // if(map.containsKey(ch) && countreq>0)
            //     countreq--;
            if (map.getOrDefault(ch, 0) > 0)
    countreq--;
            map.put(ch, map.getOrDefault(ch, 0)-1);
        
        
while(countreq==0){
    //shrinnking
    int currwin = j-i+1;
    if(currwin<minwindow){
        minwindow = currwin;
    starti = i;

}
//
char cha = s.charAt(i);
map.put(cha, map.getOrDefault(cha, 0)+1);
// if(map.containsKey(cha)&&map.get(cha)>0){
//     countreq++;
if (map.get(cha) > 0){
    countreq++;
}
i++; 

} 
j++;

    }
    //   return minWindowSize == Integer.MAX_VALUE ? "" : s.substring(start_i, start_i + minWindowSize);
        

           return minwindow == Integer.MAX_VALUE
                ? ""
                : s.substring(starti, starti + minwindow);
    }
}