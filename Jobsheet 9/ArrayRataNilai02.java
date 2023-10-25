import java.util.Scanner;
public class ArrayRataNilai02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah mahasiswa = ");
        int jumlahMhs = input.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        double rataLulus;
        double rataTidakLulus;
        int lulus = 0;
        int tidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = input.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++){
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                lulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                tidakLulus++;
            }
        }

        rataLulus = (lulus > 0) ? totalLulus / lulus : 0;
        rataTidakLulus = (tidakLulus > 0) ? totalTidakLulus / tidakLulus : 0;

        System.out.println("Rata-rata nilai lulus = "+rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = "+rataTidakLulus);
    }
}
