import java.util.Scanner;

public class DoWhileCuti02 {
    public static void main(String[] args) {
        int jatahCuti = 12;
        int sisaCuti = jatahCuti;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Jumlah sisa cuti: " + sisaCuti + " hari");
            System.out.print("Masukkan jumlah hari cuti yang ingin diambil: ");
            int jumlahCuti = input.nextInt();

            if (jumlahCuti <= sisaCuti) {
                sisaCuti -= jumlahCuti;
                System.out.println("Cuti berhasil diambil. Sisa cuti: " + sisaCuti + " hari");
            } else {
                System.out.println("Jumlah cuti yang diminta melebihi sisa cuti yang tersedia.");
                System.out.println("Silakan masukkan jumlah cuti yang sesuai dengan sisa cuti yang tersedia.");
            }
        } while (sisaCuti > 0);

        System.out.println("Jatah cuti tahunan telah habis.");
    }
}
