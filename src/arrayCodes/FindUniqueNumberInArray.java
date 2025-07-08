package arrayCodes;

import java.util.Scanner;

public class FindUniqueNumberInArray {
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
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                   arr[i]=arr[j]=-1;
                }
            }
        }
       int ans=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                ans=arr[i];
            }
        }
        System.out.println("Unique Number "+ans);
    }
}
