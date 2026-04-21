public class armstrngnum {
    public static void main(String[] args) {
        int n = 371;

        int temp = n, r = 0;

        while(temp > 0){
            int digit = temp % 10;

            r = r + (int)Math.pow(digit, 3);

            temp = temp / 10;
        }

        if(r==n) System.out.println("Armstrong Number ");

        else  System.out.println("Not an Armstrong Number");

        System.out.println("Total : "+ r);
    }
}
