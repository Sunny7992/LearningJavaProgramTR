package paterrnPrintingCodes;

import java.awt.*;
import java.util.Scanner;
//     *
//   * * *
// * * * * *
public class PyramidStarPattern {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=n-i;j>0;j--) {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++ ) {
                System.out.print(" *");
            }
        System.out.println();
        }

    }
}
