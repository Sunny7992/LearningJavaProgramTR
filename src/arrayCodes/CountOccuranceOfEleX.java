package arrayCodes;

import java.util.Scanner;

public class CountOccuranceOfEleX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Element to Search");
        int Ele =sc.nextInt();
        int count=0;
        for(int j = 0; j< n; j++)
        {
            if(Ele==arr[j])
            {
                count++;
            }
        }
        System.out.println("The Number of time element in array  " +count);

    }
}
