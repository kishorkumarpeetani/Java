public class p2 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};

        int n = a.length;

        int k = 10;

        k = k % n;

        reverse(a, 0, n - 1);

        reverse(a, 0, k - 1);

        reverse(a, k, n - 1);

        for (int i : a) {
            System.out.print( i +" ");
        }

        
    }

    public static void reverse(int[] a, int l, int r){
        while(l < r){
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;

            l++;
            r--;
        }
    }
}
