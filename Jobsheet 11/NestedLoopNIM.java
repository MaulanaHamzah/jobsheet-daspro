import java.util.Scanner;
public class NestedLoopNIM {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double[][] temps = new Double[5][7];
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            double totalSuhu = 0;
            for (int j = 0; j < temps[i].length; j++) {
                System.out.println("Hari ke-" + (j + 1) + ": " + temps[i][j]);
                totalSuhu += temps[i][j];
            }
            double rataRataKota = totalSuhu / temps[i].length;
            System.out.println("Rata-rata suhu kota ke-" + i + ": " + rataRataKota);
            System.out.println();
        }
    }
}