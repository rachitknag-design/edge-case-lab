//Print an Array in Reverse Without Changing It

import java.util.Scanner;

public class Problem2_PrintanArrayinReverseWithoutChangingIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter array elements: ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements in reverse order: ");
        for(int i=arr.length-1;i>=0;i--) {
            System.out.print(arr[i]+" ");
        } 

        sc.close();
    }
}