package DSA;
public class MaxProfit {

    private static int profit(int[] a){
        int min = a[0];

        int maxProfit = 0;

        for(int i = 1; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
                continue;
            }

            maxProfit = Math.max(maxProfit, a[i] - min);
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int[] a = {7,6,4,3,1};

        System.out.println("Max Profit : " +profit(a));
        
    }
}
