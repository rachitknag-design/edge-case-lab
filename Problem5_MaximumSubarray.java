public class Problem5_MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        int tempStart = 0;
       for(int i=0;i<arr.length;i++) {
        sum = sum+arr[i];
        if(sum>max_sum) {
            max_sum = sum;
            start = tempStart;
            end = i;

        }
        if(sum<0) {
            sum = 0;
            tempStart = i+1;
        }
       }
       System.out.println(max_sum);
       System.out.println("start : "+start);
       System.out.println("end : "+end);
    }
}
