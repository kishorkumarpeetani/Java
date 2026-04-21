package DSA;
public class BubbleSort {

    public static void swap(int j, int[] a){
        int temp = a[j];
        a[j] = a[j + 1];
        a[j + 1] = temp;

    }

    public static void main(String[] args) {
        int n = 6;
        int a[] = {23, 54, 12, 43, 14, 26};

        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){  //Note !!!!
                if (a[j] > a[j + 1]) {
                    swap(j, a);
                }
            }
        }

        for(int e : a)
         System.out.print(e + " ");
    }
}
