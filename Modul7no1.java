
package modul7;

import java.util.Scanner;

public class Modul7no1 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            double a, b, c;

            // menginput nilai yang dimasukan oleh user dan akan dioperasi kan 
            do{
                System.out.print("Masukan nilai a (tidak boleh 0): ");
                a = input.nextDouble();
             }while ( a==0);

             System.out.print("Masukan nilai b: ");
             b = input.nextDouble();
             System.out.print("Masukan nilai c: ");
             c = input.nextDouble();

             // menghitung discriminant
             double d = b*b - 4*a*c;

             // menentukan jenis akar
             if (d > 0) {
                double akar1 = (-b + Math.sqrt(d)) / (2 * a);
                double akar2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.print("Mempunyai dua akar real dan berbeda");
                System.out.print("Akar 1: " + akar1 %.2f);
                System.out.print("Akar 2: " + akar2 %.2f);
             }else if (d == 0) {
                double akar = -b / (2 * a);
                System.out.print("Mempunyai satu akar real");
                System.out.print("Akar : " + akar);
             }else {
                System.out.println("Persamaan kuadrat tidak mempunyai akar real");
             }
         input.close();
    }
    
}
