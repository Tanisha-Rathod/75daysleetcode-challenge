class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int left = 0;
        int maxun = 0;
        int curr = 0;

        for(int right = 0; right<minutes; right++){
            if(grumpy[right]==1){
                curr+=customers[right];
            }}
maxun = curr;
int n = customers.length;
int right =minutes;
while(right<n){
    if(grumpy[right]==1){
        curr+=customers[right];
    }
    // curr-=customers[left];
    if(grumpy[left]==1){
        curr-=customers[left];
    }
    right++;
    left++;
    maxun = Math.max(maxun,curr);
    
}
int total = maxun;
int k =0;
for( k = 0;k<customers.length; k++){
    if(grumpy[k]==0){
        total+=customers[k];
    }
}
        
            
        
        return total;
    }
}