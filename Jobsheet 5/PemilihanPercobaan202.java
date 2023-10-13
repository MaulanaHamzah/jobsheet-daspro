import java.util.Scanner;
public class PemilihanPercobaan202 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        System.out.print("Nilai uas :");
        float uas = input02.nextFloat();
        System.out.print("Nilai uts :");
        float uts = input02.nextFloat();
        System.out.print("Nilai kuis :");
        float kuis = input02.nextFloat();
        System.out.print("Nilai tugas :");
        float tugas = input02.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String message = total < 65 ? "Remidi" : "Tidak remidi";

        if (total > 80 && total <= 100) {
            System.out.println("Nilai akhir: " + total + " sehingga " + message);
            System.out.println("Kualifikasi = A (Sangat baik)");
        } else if (total > 73) {
            System.out.println("Nilai akhir: " + total + " sehingga " + message);
            System.out.println("Kualifikasi = B+ (Lebih dari baik)");
        } else if (total > 65) {
            System.out.println("Nilai akhir: " + total + " sehingga " + message);
            System.out.println("Kualifikasi = B (Baik)");
        } else if (total > 60) {
            System.out.println("Nilai akhir: " + total + " sehingga " + message);
            System.out.println("Kualifikasi = C+ (Lebih dari cukup)");
        } else if (total > 50) {
            System.out.println("Nilai akhir: " + total + " sehingga " + message);
            System.out.println("Kualifikasi = C (Cukup)");
        } else if (total > 39) {
            System.out.println("Nilai akhir: " + total + " sehingga " + message);
            System.out.println("Kualifikasi = D (Kurang)");
        } else {
            System.out.println("Nilai akhir: " + total + " sehingga " + message);
            System.out.println("Kualifikasi = E (Gagal)");
        }
    } 
}