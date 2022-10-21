package JavaPart1;

import java.util.Scanner;

public class faktorBilangan {
    public static void main(String[] args)
    {
        int bilangan;
        Scanner input = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("Program Mencari Faktor Bilangan");
        System.out.println("=======================================");
        System.out.print("Masukkan Angka : ");
        bilangan = input.nextInt();
        System.out.print("Faktor dari " + bilangan + " adalah : ");
        for(int i=1;i<=bilangan;i++)
        {
            if(bilangan%i == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
