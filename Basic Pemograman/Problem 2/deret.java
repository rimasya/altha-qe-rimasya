package JavaPart2;

import java.util.Scanner;

public class deret {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Program Draw XYZ");
        System.out.println("========================================");


        int jumlah_deret, i;

        System.out.print("Masukan Angka: ");
        jumlah_deret = input.nextInt();
        System.out.println();
        for (i = 1; i <= jumlah_deret; i++) {
//            System.out.print(i + " ");
        }
        // int masuk = 0;
        if (i % 2 == 0) {
            System.out.print("X");
        } else {
            System.out.print("Y");
        }
//        int i = 3;
//        {
////            System.out.print("Z");
////            for (int x = 2; x < i; x++)
//            {
                if(i % 5 != 0) {
                System.out.print("Z");
//                    break;
            }

                System.out.print(i + " ");
                //  System.out.println();
            }
        }
//    }
//}
