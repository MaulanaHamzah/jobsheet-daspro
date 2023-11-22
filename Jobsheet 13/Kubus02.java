import java.util.*;
public class Kubus02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sisi kubus: ");
        int sisi = input.nextInt();
        System.out.println("Menghitung volume kubus !!");
        volKubus(sisi);
        System.out.println("Menghitung luas permukaan kubus !!");
        lpkubus(sisi);
    }
    static int volKubus(int sisi) {
        int volume = sisi*sisi*sisi;
        System.out.println("Volume kubus adalah " + volume);
        return volume;
    }

    static int lpkubus(int sisi) {
        int luas = 6*(sisi*sisi);
        System.out.println("Luas permukaan kubus adalah " + luas);
        return luas;
    }
}