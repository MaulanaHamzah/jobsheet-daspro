import java.util.Scanner;
public class TugasArrayJ902 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilTertinggi, nilTerendah, i;
        double jumlah=0, rerata;

        System.out.print("Masukkan berapa nilai yang akan dimasukkan: ");
        i = input.nextInt();
        int nilai[] = new int [i];

        for (i=0; i < nilai.length; i++){
            System.out.print("Masukkan nilai ke-"+(i+1)+" : ");
            nilai[i]=input.nextInt();
        }

        nilTertinggi=nilai[0];
        for (i=1; i < nilai.length; i++){
        if (nilai[i] > nilTertinggi) {
            nilTertinggi = nilai[i];
        }
        }
        nilTerendah=nilai[0];
        for (i=1; i < nilai.length; i++){
            if (nilai[i] < nilTerendah) {
            nilTerendah = nilai[i];
        }        
        }
        for (i=0; i < nilai.length; i++){
            jumlah+=nilai[i];
        }
        rerata=jumlah/nilai.length;
    
        System.out.println("----- HASIL -----");
        System.out.println("Nilai tertinggi adalah: "+nilTertinggi);
        System.out.println("Nilai terendah adalah : "+nilTerendah);
        System.out.println("Rata-ratanya adalah : "+rerata);

    }
}