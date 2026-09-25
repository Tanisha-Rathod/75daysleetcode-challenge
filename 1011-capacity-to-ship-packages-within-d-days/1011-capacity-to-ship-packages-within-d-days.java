class Solution {

private int find(int weights[], int cap){
    int dayy=1;
    int load = 0;
    for(int i=0; i<weights.length; i++){
        if(load +weights[i]>cap){
            dayy = dayy+1;
   load = weights[i];
        }else{
            load+=weights[i];
        }

    }
    return dayy;

}


    public int shipWithinDays(int[] weights, int days) {
        int low =0;
        int high = 0;
        for(int weigh:weights){
            low = Math.max(low, weigh);
            high+=weigh;
        }
        while(low<=high){
            int mid = low+(high-low)/2;
            int day = find(weights, mid);
            if(day<=days){
                high= mid-1;

            }else{
                low = mid+1;
            }
        }
        return low;
    }
}