package arrayCodes;

import java.util.Scanner;

public class LargestAndSmallestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largestEle = Integer.MIN_VALUE;
        int smallestEle = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largestEle) {
                largestEle = arr[i];
            }
            if (arr[i] < smallestEle) {
                smallestEle = arr[i];
            }
        }

        System.out.println("Largest Element: " + largestEle);
        System.out.println("Smallest Element: " + smallestEle);
    }
}
