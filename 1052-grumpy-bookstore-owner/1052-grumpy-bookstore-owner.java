class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int maxunsatisfied = 0;
        int currun =0;
        for(int i=0;i<minutes; i++){
            currun+= customers[i]*grumpy[i];
        }
        maxunsatisfied = currun;
        int i=0;
        int j = minutes;
        int n = customers.length;
        while(j<n){
            currun+=customers[j]*grumpy[j];
            currun-=customers[i]* grumpy[i];
            maxunsatisfied = Math.max(maxunsatisfied, currun);
            i++;
            j++;

        }
        int total = maxunsatisfied;
        for(int k=0; k<n; k++){
            total += customers[k]* (1-grumpy[k]);
        }
        return total;
    }
}