package arrayCodes;

import java.util.Scanner;

public class SearchElementX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Element to Search in Array");
        int Ele= sc.nextInt();
        int ans=-1;
        for(int i=0;i<n;i++)
        {
           if(arr[i]==Ele)
           {
               ans=i;
           }
        }
        System.out.println("Found Element at index "+ans);
        }
}
