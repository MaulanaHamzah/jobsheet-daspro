import java.util.Scanner;
public class PemilihanPercobaan102 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        String hasil;
        int angka = input02.nextInt();

        hasil = (angka % 2 == 0) ? "Bilangan genap" : "Bilangan ganjil";
        System.out.println(angka + " adalah " + hasil);
    }
}