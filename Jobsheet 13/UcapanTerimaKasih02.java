import java.util.*;
public class UcapanTerimaKasih02 {
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void UcapanTerimaKasih(){
        String nama = PenerimaUcapan();
        System.out.print("Thank you " + nama + " for being the best teacher in the world.\n" +
        "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }
    public static void UcapanTambahan(String ucapan){
        System.out.println("\nThank you so much " + ucapan);
    }
    public static void main(String[] args) {
        UcapanTerimaKasih();
        UcapanTambahan("for your dedication and hard work!");
    }
}