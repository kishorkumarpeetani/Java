public class MergeSort {

    private static void mergeSort(int arr[], int l, int r){
        
        if(l < r){
            // int mid = (l + r) / 2;

            //optimal for larger l and r 
            int mid = l + (r - l) / 2;

            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);

            merge(arr, l, mid, r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        
        int lArr[] = new int[n1]; 
        int rArr[] = new int[n2]; 

        for(int i = 0; i < n1; i++){
            lArr[i] = arr[l + i];
        }
        for(int i = 0; i < n2; i++){
            rArr[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = l;

        while(i < n1 && j < n2){
            if(lArr[i] < rArr[j]){
                arr[k++] = lArr[i++];
            }
            else {
                arr[k++] = rArr[j++];
            }
        }

        while(i < n1){
            arr[k++] = lArr[i++];
        }

        while(j < n2){
            arr[k++] = rArr[j++];
        }

    }

    public static void main(String[] args) {
        
        int[] arr = { 6, 9, 7, 5, 2, 3 };
        int n = arr.length;

        mergeSort(arr, 0, n - 1);
        
        for(int num : arr)
            System.out.print(num + " ");
    }
}