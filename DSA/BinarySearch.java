package DSA;
public class BinarySearch{
    public static void main(String[] args) {

        int a[] = {2,5,24,34,59,67};
        int target = 34;

        int res = binarySearch(a, target);

        if(res == -1) System.out.println("Not Found!!!");

        else System.out.println("Found at index: " +res);

    }

    public static int binarySearch(int a[], int target){
        
        int start = 0, end = a.length - 1, mid;

        while(start <= end){
            mid = (start + end) / 2;
            if(a[mid] < target)
                start = mid + 1;
            else if(a[mid] > target)
                end = mid - 1;
            else  return mid;
        }

        return -1;
    }
}