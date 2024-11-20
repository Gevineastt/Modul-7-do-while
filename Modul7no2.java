package modul7;

import java.util.Scanner;

public class Modul7no2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double uts1, uts2, uas, nilaitotal; // deklarasi variable uts1, uts2, uas
        String nilaiFinal;
        String ulang;

        do{
        //menginput nilai uts1, uts2, uas
        System.out.println("Masukan nilai uts1: ");
        uts1 = input.nextDouble();
        System.out.println("Masukan nilai uts2: ");
        uts2 = input.nextDouble();
        System.out.println("Masukan nilai uas: ");
        uas = input.nextDouble();

        //menghitung nilai total 
        nilaitotal = (0.3 * uts1) + (0.3 * uts2) + (0.4 * uas);

        //membuat percabangan untuk menenntukan nilai final 
        if (nilaitotal >= 80) {
            nilaiFinal = "A";
        } else if (nilaitotal >= 65) {
            nilaiFinal = "B";
        } else if (nilaitotal >= 55) {
            nilaiFinal = "C";
        } else if (nilaitotal >= 50) {
            nilaiFinal = "D";
        } else {
            nilaiFinal = "E";
        }
        //menampilkan hasil 
        System.out.println("Nilai total :" + nilaitotal);
        System.out.println("Nilai final :" + nilaiFinal);

        //membuat perulangan jika user ingin
        System.out.println("apakah anda ingin memasukan nilai lagi? (ya/tidak) :");
        ulang = input.nextLine();

        }while (ulang == "ya"|| ulang == "Ya" || ulang == "YA"); // membuat perulangan kembali jika user mejawab ya 

        input.close();
    }

}
