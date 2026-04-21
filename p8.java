public class p8 {
    public static void main(String[] args) {
        int[][] nums = {{1,2}, {3}, {4,5,7}};

        for(int num[] : nums){
            for(int n : num){
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}