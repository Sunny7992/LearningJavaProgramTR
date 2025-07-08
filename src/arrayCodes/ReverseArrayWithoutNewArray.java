package arrayCodes;

import java.util.Scanner;

public class ReverseArrayWithoutNewArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0, j = n - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("Reversed Array:");
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }

    }
}
