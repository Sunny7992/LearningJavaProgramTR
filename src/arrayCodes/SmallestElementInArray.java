package arrayCodes;

import java.util.Scanner;

public class SmallestElementInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        for(int j=1;j<n;j++)
        {
            if(largest>arr[j])
            {
                largest=arr[j];
            }
        }
        System.out.println("The smallest element in array  " +largest);

    }
}
