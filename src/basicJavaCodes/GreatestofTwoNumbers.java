package basicJavaCodes;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class GreatestofTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if (n1 == n2)
        {
            System.out.println("Both Number are same");
        }
        else if(n1<n2)
        {
            System.out.println("N2 is the greater Number "+n2);
        }
        else {
            System.out.println("N1 is the greater Number "+n1);
        }

    }
}
