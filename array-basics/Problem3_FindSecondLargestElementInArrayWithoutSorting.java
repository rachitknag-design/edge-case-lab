import java.util.Scanner;

public class Problem3_FindSecondLargestElementInArrayWithoutSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = {12, 35, 1, 10, 34, 1};
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        for(int num : arr) {
            if(num>max) {
                second_max = max;
                max = num;
            } else if(num>second_max && num!=max) {
                second_max = num;
            }
        }
        System.out.println("Largest Element: "+max);
        System.out.println("Second Largest Element: "+second_max);
        sc.close();
    }
}