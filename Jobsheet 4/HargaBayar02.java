import java.util.Scanner;
public class HargaBayar02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int harga, jumlah, jmlHalBuku;
        char merkBuku;
        double dis, total, bayar, jmlDis;

        System.out.println("Masukan harga barang yang dibeli ");
        harga = input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli ");
        jumlah = input.nextInt();
        System.out.println("Masukkan jumlah halaman buku yang dibeli");
        jmlHalBuku = input.nextInt();
        System.out.println("Merk buku yang akan dibeli ");
        merkBuku = input.next().charAt(0);
        System.out.println("Masukkan diskon dari barang yang dibeli ");
        dis = input.nextDouble();

        total = harga * jumlah;
        jmlDis = total * dis;
        bayar = total - jmlDis;
        System.out.println(" ================================== ");
        System.out.println("Merk buku yang akan dibeli adalah " + merkBuku);
        System.out.println("Diskon yang anda dapatkan adalah " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " + bayar);

    }
}
