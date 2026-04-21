public class QuickSort {
    public static void quickSort(int[] arr, int low, int high){   
        if(low < high){
            int pivot = low;
            int i = low + 1;
            int j = high;
            int temp;
            while(i <= j){
                while( i <= high && arr[i] <= arr[pivot])
                    i++;
                while( j >= low && arr[j] > arr[pivot])
                    j--;
                if(i < j){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            temp = arr[j];
            arr[j] = arr[pivot];
            arr[pivot] = temp;

            quickSort(arr, low, j - 1);
            quickSort(arr, j + 1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = { 6, 9, 7, 5, 2, 3 };
        int n = arr.length;

        quickSort(arr, 0,  n - 1);
        
        for(int num : arr)
            System.out.print(num + " ");
    }
}