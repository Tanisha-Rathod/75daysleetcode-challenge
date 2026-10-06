class Solution {
    public int maxConsecutiveAnswers(String answer, int k) {
    int i=0;
    int j =0;
    int n = answer.length();
    int result = 0;
    Map< Character,Integer>map = new HashMap<>();
    while(j<n){
        //insert freq
map.put(answer.charAt(j), map.getOrDefault(answer.charAt(j),0)+1);
    
//invalid window
while(Math.min(map.getOrDefault('T',0), map.getOrDefault('F',0))>k){
    char left = answer.charAt(i);
    map.put(left, map.get(left)-1);
    i++;
}
    
result = Math.max(result, j-i+1);
j++;

    }
return result;
        
    }
}