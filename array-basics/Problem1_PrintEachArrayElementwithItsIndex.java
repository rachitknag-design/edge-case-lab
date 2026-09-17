// Print Each Array Element with Its Index

import java.util.Scanner;

public class Problem1_PrintEachArrayElementwithItsIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter arr elments: ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("array elements are:\n ele : index");
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]+" : "+i);
        }

        sc.close();
    }
}