import java.util.Scanner;
public class nilaiTugasMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int barisMahasiswa = scanner.nextInt();
        System.out.print("Masukkan jumlah tugas: ");
        int kolomMinggu = scanner.nextInt();
        String[] namaMahasiswa = new String[barisMahasiswa];
        double[][] nilaiMahasiswa = new double[barisMahasiswa][kolomMinggu];
        inputNamaDanNilai(namaMahasiswa, nilaiMahasiswa);
        tampilkanNamaDanNilai(namaMahasiswa, nilaiMahasiswa);
        tampilkanMahasiswaTertinggi(namaMahasiswa, nilaiMahasiswa);
    }
    // Fungsi untuk mencari dan menampilkan mahasiswa dengan nilai tertinggi
    static void tampilkanMahasiswaTertinggi(String[] namaMahasiswa, double[][] nilaiMahasiswa) {
        int mingguTertinggi = 0;
        double nilaiTertinggi = nilaiMahasiswa[0][0];
        for (int j = 1; j < nilaiMahasiswa[0].length; j++) {
            if (nilaiMahasiswa[0][j] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[0][j];
                mingguTertinggi = j;
            }
        }
        System.out.println("\nMahasiswa dengan nilai tertinggi pada Minggu-" + (mingguTertinggi + 1) + ":");
        System.out.println("Nama: " + namaMahasiswa[0]);
        System.out.println("Nilai: " + nilaiTertinggi);
    }
    // Fungsi untuk mengisi nama dan nilai tugas mahasiswa
    static void inputNamaDanNilai(String[] namaMahasiswa, double[][] nilaiMahasiswa) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.print("Masukkan nama Mahasiswa-" + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.next();
            System.out.println("Masukkan nilai tugas untuk " + namaMahasiswa[i] + ":");
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                System.out.print("Nilai tugas Minggu-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = scanner.nextDouble();
            }
        }
    }
    // Fungsi untuk menampilkan nama dan nilai tugas mahasiswa
    static void tampilkanNamaDanNilai(String[] namaMahasiswa, double[][] nilaiMahasiswa) {
        System.out.println("\nNilai tugas mahasiswa:");
        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.print("Mahasiswa-" + (i + 1) + " (" + namaMahasiswa[i] + "): ");
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                System.out.print(nilaiMahasiswa[i][j] + " ");
            }
            System.out.println();
        }
    }
}