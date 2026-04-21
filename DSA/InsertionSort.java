package DSA;
public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {6, 9, 7, 5, 2, 3};
        int n = arr.length;
        int j, key;

        for(int i = 1; i < n; i++){
            key = arr[i];
            j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        for(int k : arr){
            System.out.print(k+" ");
        }
    }
}
