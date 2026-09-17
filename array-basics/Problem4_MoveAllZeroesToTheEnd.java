public class Problem4_MoveAllZeroesToTheEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0, 2, 0, 3, 0};
        int j=0;

        for(int i=0;i<arr.length;i++) {
            if(arr[i]!=0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println("Arrays after modification: ");
        for(int num : arr) { 
            System.out.print(num+" ");
        }
    }
}
