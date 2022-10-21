package JavaPart1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MainMenu {

    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*Program*/
        //panggil metode
        mainMenu();
    }
    private static void mainMenu(){

        //pilihan menu
        System.out.println("=========================================");
        System.out.println("1. Segitiga Siku-Siku");
        System.out.println("2. Konversi Nilai");
        System.out.println("3. Faktor Bilangan");
        System.out.println("4. Keluar\n");

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);

        try {
            System.out.print("Masukan Pilihan Menu : ");
            String input = bufferedReader.readLine();

            //kondisional untuk pilihan menu yang dimasukan
            if (input.isEmpty()) {
                System.out.println("\nAnda tidak memasukkan inputan, silahkan coba lagi.\n");
                mainMenu();
            } else {
                int numberOfString = Integer.parseInt(input);

                if (numberOfString == 1) {
                    segitigaSiku();
                } else if (numberOfString == 2){
                    konversiNilai();
                } else if (numberOfString == 3) {
                    faktorBilangan();
                } else if (numberOfString == 4) {
                    System.out.println("\nThank You For Using This Application.\n");
                } else {
                    System.out.println("\nTidak ada pilihan, silahkan coba lagi.\n");
                    mainMenu();
                }
            }
        } catch (NumberFormatException | IOException e) {
            System.out.println("\nTidak ada pilihan, silahkan coba lagi.\n");
            mainMenu();
        }
    }


    private static void segitigaSiku() {
        SegitigaSiku segitiga;
        double s1, s2;
        char coba;

        segitiga = new SegitigaSiku();

         do {
            System.out.print("\nMasukan alas segitiga siku-siku: ");
            s1 = scanner.nextDouble();
            System.out.print("Masukan tinggi segitiga siku-siku: ");
            s2 = scanner.nextDouble();
           // System.out.println("Luas segitiga: " + roundingMode(segitiga.luas(s1, s2)));
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
         } while (coba == 'Y' || coba == 'y');
            System.out.print("\n");

            mainMenu();
    }
    private static void konversiNilai() {
        konversiNilai konversi;
                konversi= new konversiNilai();
        konversiNilai nilai;
        System.out.println("Program Konversi Nilai Mahasiswa");
        System.out.println("=========================================");
        System.out.println("\nMasukkan Sebuah Nilai :");


        nilai = new konversiNilai();
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();

        char coba;

            if (a >= 100) {
                System.out.println("Invalid");
            } else if (a >= 80 && a <= 100) {
                System.out.println("Nilai Anda A");
            } else if (a >= 65 && a <= 79) {
                System.out.println("Nilai Anda B+");
            } else if (a >= 50 && a <= 64) {
                System.out.println("Nilai Anda B");
            } else if (a >= 35 && a <= 49) {
                System.out.println("Nilai Anda C");
            } else if (a >= 0 && a <= 34) {
                System.out.println("Nilai Anda D");
            } else {
                System.out.println("Invalid");
            }
            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        boolean b = coba == 'Y' || coba == 'y';
        System.out.print("\n");


        mainMenu();
    }
    public static void faktorBilangan() {
        System.out.println("Program Faktor Bilangan");
        System.out.println("=========================================");
        System.out.println("\nMasukkan Sebuah Nilai :");


        Scanner input = new Scanner(System.in);
      //  System.out.print("Masukkan angka yang ingin dicari faktornya : ");

        int bilangan = input.nextInt();
        System.out.print("Faktor dari " + bilangan + " adalah : ");
        for(int i=1;i<=bilangan;i++)
        {
            if(bilangan%i == 0)
            {
                System.out.print(i + " ");
            }
        }
        System.out.print("\nIngin mencoba lagi? (y/t) : ");
        char coba;
        coba = scanner.next().charAt(0);
        System.out.print("\n");
        boolean b = coba == 'Y' || coba == 'y';

        System.out.print("\n");

        mainMenu();
    }


    private static String roundingMode(double number) {
        DecimalFormat df = new DecimalFormat("#.#####");
        df.setRoundingMode(RoundingMode.CEILING);
        return df.format(number);
    }
}
