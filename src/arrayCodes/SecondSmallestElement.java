package arrayCodes;

import java.util.Scanner;

public class SecondSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int largest=arr[0];
        int secondlar=0;
        for (int i = 1; i < n; i++){
            if(largest<arr[i])
            {
                secondlar=largest;
                largest=arr[i];
            }

        }
        System.out.println("The second largest element "+secondlar);

    }
}
