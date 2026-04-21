class p11{
    private int findSum(int[] nums, int divisor){
        int sum = 0;

        for(int num : nums){
            sum += (num+divisor-1)/2;
        }

        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        int res = 0;

        for(int num : nums){
            low = Math.min(low, num);
            high = Math.max(high, num);
        }

        while(low<=high){
            int mid = low + (high-low)/2;

            if(findSum(nums, mid) <= threshold){
                res = mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        p11 solver = new p11();
        int[] arr = {1, 2, 3, 4, 5};
        int limit = 8;
        int result = solver.smallestDivisor(arr, limit);
        System.out.println("The minimum divisor is: " + result);
    }
}