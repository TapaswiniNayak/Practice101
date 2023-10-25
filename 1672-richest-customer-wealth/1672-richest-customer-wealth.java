class Solution {
    public int maximumWealth(int[][] accounts) {
        int curr_sum=0;
        int max=0;
        int i=0;
        while(i != accounts.length){
                for(int j=0; j<accounts[i].length; j++){
                   curr_sum=curr_sum+accounts[i][j];
                 }
                 max=Math.max(curr_sum,max);
                 curr_sum=0;
                 i++;
          }
          return max; 
    }
}