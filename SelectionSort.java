class SelectionSort {
    public static void main(String[] args) {

        int n = 6, temp;
        int a[] = {23, 54, 12, 43, 14, 26};
        int minIndx = 0;

        for(int i = 0; i < n - 1 ; i++){
            minIndx = i;

            for(int j = i + 1; j < n; j++){

                if(a[minIndx] > a[j]){
                    minIndx = j;
                }
            }

            temp = a[minIndx];
            a[minIndx] = a[i];
            a[i] = temp;
        }

        for(int e : a)
            System.out.println(e);
    }
     
}