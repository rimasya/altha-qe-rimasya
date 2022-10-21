package JavaPart2;

import java.util.Scanner;

public class Problem1BilanganPrima {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("Program Cek Bilangan Prima");
        System.out.println("=======================================");

        int n,i;
        boolean angka_prima = true;

        System.out.print("Input sebuah angka bulat: ");
        n = input.nextInt();

        // 0 dan 1 bukan angka prima
        if (n == 0 || n == 1) {
            angka_prima = false;
        }
        else {
            for (i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    angka_prima = false;
                    break;
                }
            }
        }

        if (angka_prima)
            System.out.println( n + " TRUE");
        else
            System.out.println( n + " FALSE");
    }
}
