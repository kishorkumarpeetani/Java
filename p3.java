public class p3 {

    private static void swap(int[] a, int j, int i){
        a[j] = a[j] + a[i];
        a[i] = a[j] - a[i];
        a[j] = a[j] - a[i];
    }
    public static void main(String[] args) {
        int[] a = { 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1 };
        int n = a.length;

        int i = 0 , j = 0;

        while(j < n - 1){
            while(a[j] != 0 )
                j++;

            while(a[j] == 0){
                i = j + 1;
                if(a[i] != 0){
                    swap(a, j, i);
                    j++;
                    i++;

                }
            }
        }

        // --1-------

        // int k = 0;

        // for(int i = 0; i < n; i++){
        //     if(a[i] != 0){
        //         a[k] = a[i];
        //         k++;
        //     }
        // }
        // while(k < n){
        //     a[k++] = 0;
        // }

        for (int e : a) {
            System.out.print( e + " ");
        }
    }
}
