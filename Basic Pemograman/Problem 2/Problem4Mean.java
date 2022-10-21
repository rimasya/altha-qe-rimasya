package JavaPart2;

import java.util.Scanner;

public class Problem4Mean {
    public static void main(String[] args)
    {
        int input;
        Scanner scan = new Scanner(System.in);

        // Input bilangan banyak data
        System.out.println("=======================================");
        System.out.println("Program Menghitung Mean");
        System.out.println("=======================================");
        System.out.print("Masukkan berapa banyak data: ");

        input = scan.nextInt();

        // Cek apakah nilai dari input > 0
        if (input > 0)
        {
            // Input masing-masing data berdasarkan nilai arraynya

            System.out.println("Masukkan isi data berupa angka:");
            int[] data =  new int[input];
            for (int i = 0; i < input; i++)
            {
                System.out.print("- Isi Data ke-" +(i + 1)+ " = ");
                data[i] = scan.nextInt();
            }

            // Tampilkan hasil perhitungannya -> mean, \
            System.out.println("Hasil Perhitungan:");
            System.out.printf("- Mean\t\t= %.1f%n", mean(data));

        }
        else
            // Jika input <= 0 maka keluar pesan kesalahan
            System.err.println("Silahkan masukkan banyak data lebih dari 0");
    }
    
    // Fungsi untuk Mean -> rata-rata
    static double mean(int[] data)
    {
        int tambah = 0;
        for (int dataTambah : data)
        {
            // Menjumlah seluruh data array
            tambah += dataTambah;
        }

        // Mulai Melakukan perhitungan rata-rata
        return tambah / (double) data.length;
    }


    // Fungsi untuk mengurutkan
    static int[] urutkan(int[] data)
    {
        int temp;
        for (int i = 0; i < data.length-1; i++)
        {
            for (int j = data.length-1; j > i; j--)
            {
                if (data[j-1] > data[j])
                {
                    temp        = data[j];
                    data[j]     = data[j-1];
                    data[j-1]   = temp;
                }
            }
        }

        return data;
    }
}
