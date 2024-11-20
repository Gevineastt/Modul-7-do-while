package modul7;

import java.util.Scanner;

public class Modul7no3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // menginput jumlah mangga sesuai yang dimasukan oleh user
        System.out.print("Masukkan jumlah mangga yang akan diproses: ");
        int jumlahMangga = input.nextInt();

        // membuat variable untuk jumlah setiap jenis kualitas mangga
        int jumlahBiasa = 0;
        int jumlahBagus = 0;
        int jumlahUnggul = 0;

        // inisialisasi variable counter
        int i = 1;

        // looping untuk membaca berat mangga
        do {
            double berat;
            do {
                System.out.print("Masukkan berat mangga ke-" + i + ": ");
                berat = input.nextDouble();
                if (berat <= 0) {
                    System.out.println("Berat harus positif");
                }
            } while (berat <= 0);

            // melakukan percabangan untuk menentukan kualitas mangga berdasarkan berat
            if (berat < 500) {
                jumlahBiasa++;
            } else if (berat >= 500 && berat < 750) {
                jumlahBagus++;
            } else {
                jumlahUnggul++;
            }

            i++; // meningkatkan setiap counter
        } while (i <= jumlahMangga); // looping sampai jumlah mangga terpenuhi

        // Menampilkan hasil
        System.out.println("\nJumlah mangga berdasarkan kualitas:");
        System.out.println("BIASA: " + jumlahBiasa);
        System.out.println("BAGUS: " + jumlahBagus);
        System.out.println("UNGGUL: " + jumlahUnggul);

        input.close();
    }
}