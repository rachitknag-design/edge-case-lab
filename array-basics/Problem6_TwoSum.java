// Find the indices of the two elements whose sum equals target.


public class Problem6_TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int start = 0;
        int end = 0;

        for(int i=0;i<arr.length-1;i++) {
            int search = target - arr[i];
            for(int j=i+1;j<arr.length;j++) {
                if(search == arr[j]) {
                    end = j;
                    break;
                }
            }
        }

        System.out.println(start+" "+end);
       
    }
}
