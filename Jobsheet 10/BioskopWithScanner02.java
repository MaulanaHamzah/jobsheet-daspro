import java.util.Scanner;
public class BioskopWithScanner02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];
        boolean exit = false;
        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int menuChoice = input.nextInt();
            input.nextLine(); // Consume the newline character
            switch (menuChoice) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = input.nextLine();
                    boolean seatOccupied;
                    do {
                        System.out.print("Masukkan baris: ");
                        baris = input.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = input.nextInt();
                        input.nextLine();
                        seatOccupied = false;
                        if (baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length) {
                            if (penonton[baris - 1][kolom - 1] == null) {
                                penonton[baris - 1][kolom - 1] = nama;
                            } else {
                                System.out.println("Kursi ini sudah terisi. Silakan pilih kursi yang lain.");
                                seatOccupied = true;
                            }
                        } else {
                            System.out.println("Baris atau kolom tidak valid. Silakan pilih kursi yang tersedia.");
                            seatOccupied = true;
                        }
                    } while (seatOccupied);
                    break;
                case 2:
                System.out.println("Daftar penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[0].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");
                        } else {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                        }
                    }
                }
                break;
                case 3:
                    exit = true;
                    System.out.println("Terima kasih! Keluar dari program.");
                    break;
                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu yang sesuai.");
                    break;
            }
        }
    }
}
