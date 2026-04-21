public class binpat {
    public static void main(String[] args) {

        int n = 6;

        for(int i = 0; i < n; i++){

            int value = 0;

            if(i % 2 == 0) value = 1;
            
            for(int j = 0; j < i + 1; j++){
                System.out.print(value);
                value = 1 - value;
            }

            System.err.println();
        }
    }
}
