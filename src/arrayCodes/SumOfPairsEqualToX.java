package arrayCodes;

import java.util.Scanner;

public class SumOfPairsEqualToX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=8;
        System.out.println("Pairs with sum " + target + ":");
        boolean found = false;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                    found=true;
                }
            }
        }
        if (!found) {
            System.out.println("No such pairs found.");
        }
    }
}
