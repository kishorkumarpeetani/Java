// User function Template for Java
class Solution {
    public int maximumProfit(int prices[]) {
        // code here
        int maxProfit  = 0 , i = 0;
        
        int length  = prices.length ; 
        
        boolean purchased = false ;
        
        while(i < length - 1){
            
            if(!purchased){
              while(prices[i] > prices[i + 1] && i < length - 1)
                i++;
              
               maxProfit -= prices[i] ;
               purchased = true ;
            }
        
            else {
                while(prices[i] < prices[i + 1] && i < length - 1)
                  i++;
              
                maxProfit += prices[i] ;
                purchased = false ;
            }
        }
        
        return maxProfit;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int prices[] = {100, 180, 260, 310, 40, 535, 695} ; 
        System.out.println(s.maximumProfit(prices));
    }
}