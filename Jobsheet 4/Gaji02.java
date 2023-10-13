import java.util.Scanner;

public class Gaji02{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int jmlMasuk, jmlTdkMasuk, gaji, potGaji, totGaji;

        System.out.println("Masukkan jumlah hari masuk kerja anda ");
        jmlMasuk = input.nextInt();
        System.out.println("Masukkan jumlah hari tidak masuk kerja anda ");
        jmlTdkMasuk = input.nextInt();
        System.out.println("Masukkan jumlah gaji anda ");
        gaji = input.nextInt();
        System.out.println("Masukkan jumlah potongan gaji anda ");
        potGaji = input.nextInt();

        totGaji = (jmlMasuk * gaji) - (jmlTdkMasuk * potGaji);
        System.out.println("Gaji yang anda terima adalah " + totGaji);
    }
}