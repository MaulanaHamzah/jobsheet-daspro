import java.util.*;
public class Tugas1Percobaan11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = scanner.nextInt();
        if (N < 3) {
            System.out.println("Nilai N harus minimal 3.");
        } else {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N - i; j++) {
                    System.out.print(" ");
                }
                for (int j = N - i + 1; j <= N; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}