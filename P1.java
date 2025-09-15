class P1 {
    int maxSubarraySum(int[] arr) {
        // Code here
        int n = arr.length ;
        
        if(n == 1)  return arr[0] ;
        
        int maxSum = Integer.MIN_VALUE ;
        
        for(int i = 1 ; i < n ; i++){
            int index = 0 ;
            
            while(index < n){
                int sum = 0 ;
                for(int j = 1 ; j <= i && index < n ; j++){
                    sum += arr[index] ;
                    index++ ;
                }
                if(maxSum < sum)
                  maxSum = sum ;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        P1 p = new P1();
        System.out.println(p.maxSubarraySum(new int[]{2, 3, -8, 7, -1, 2, 3}));

    }
}

