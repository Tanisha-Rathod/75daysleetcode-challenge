class Solution {
    private int findDayOfYear(String day, int[] prefix){
        int month = Integer.parseInt(day.substring(0, 2));
        int date  = Integer.parseInt(day.substring(3));
         
        return prefix[month-1]+date;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
       int[]  nums ={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
       int prefix[] = new int[13];
       prefix[1]=31;//jan
       for(int i=2;i<nums.length; i++){
        prefix[i] = prefix[i-1]+nums[i-1];
       }
    int arriveAliceDay = findDayOfYear(arriveAlice, prefix);
        int leaveAliceDay  = findDayOfYear(leaveAlice, prefix);
        int arriveBobDay   = findDayOfYear(arriveBob, prefix);
        int leaveBobDay    = findDayOfYear(leaveBob, prefix);
int overlap = Math.min(leaveBobDay ,leaveAliceDay )-Math.max( arriveBobDay ,arriveAliceDay )+1;
return Math.max(0,overlap);
    }
}