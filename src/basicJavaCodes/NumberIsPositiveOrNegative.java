package basicJavaCodes;

import java.util.Scanner;

public class NumberIsPositiveOrNegative {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0)
        {
            System.out.println("The number is positive");
        }
        else if(n<0)
        {
            System.out.println("The number is Negative");
        }
        else {
            System.out.println("The number is Zero");
        }
    }
}
