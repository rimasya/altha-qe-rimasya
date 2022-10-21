package JavaPart2;

import java.util.Scanner;

public class Problem2Palindrome {

    public static void main(String args[])
    {
        String x, y = "";
        Scanner a = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("Program Cek Kata Palindrome");
        System.out.println("=======================================");
        System.out.print("Input kata:");
        x = a.nextLine();
        int l = x.length();
        for(int k = l - 1; k >= 0; k--)
        {
            y = y + x.charAt(k);
        }
        if(x.equalsIgnoreCase(y))
        {
            System.out.println("TRUE.");
        }
        else
        {
            System. out.println("FALSE.");
        }
    }
}
