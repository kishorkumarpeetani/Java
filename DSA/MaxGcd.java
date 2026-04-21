package DSA;
public class MaxGcd {
    public static void main(String[] args) {

        int maxGcd = 0;
        int gcd;

        int[] result = new int[2];

      //  int[] arr = {5, 10, 15, 20};
        int[] arr = {10, 6, 4, 2};

        int size = arr.length;

        for(int i = 0; i < size; i++){
            for(int j = i + 1; j < size; j++){

                int a = arr[i];
                int b = arr[j]; 

                if(a != b){
                    while(b != 0){
                        int temp = b;
                        b = a % b;
                        a = temp;
                    }

                    gcd = a;

                    if(maxGcd < gcd){
                        maxGcd = gcd;
                        result[0] = arr[i]; 
                        result[1] = arr[j]; 
                    }

                    else if (maxGcd == gcd){

                        int minLcm = (result[0] * result[1]) / maxGcd;
                        int lcm = arr[i] * arr[j] / gcd;

                        if(lcm < minLcm){
                            result[0] = arr[i]; 
                            result[1] = arr[j];
                        }
                    }
                }
            }
        }

        for(int n : result)
            System.out.print(n + " ");
        
        System.out.println();
        
        System.out.println("GCD : " +maxGcd);
    }
}
