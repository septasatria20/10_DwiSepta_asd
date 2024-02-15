import java.util.Scanner;

public class Tugas1_10 {
    public static void main(String[] args) {
        char[] KODE = {'a', 'b', 'd', 'e', 'f', 'g', 'h', 'l', 'n', 't'};
        String[] KOTA = {"Banten", "Jakarta", "Bandung", "Cirebon", "Bogor", "Pekalongan", "Semarang", "Surabaya", "Malang", "Tegal"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor (huruf pertama saja): ");
        char kodePlat = scanner.next().charAt(0);

        String namaKota = cariNamaKota(KODE, KOTA, kodePlat);

        if (namaKota != null) {
            System.out.println("Kota yang berpasangan dengan kode plat " + kodePlat + " adalah: " + namaKota);
        } else {
            System.out.println("Kode plat " + kodePlat + " tidak ditemukan.");
        }
    }

    public static String cariNamaKota(char[] kodeArray, String[] kotaArray, char kodePlat) {
        for (int i = 0; i < kodeArray.length; i++) {
            if (kodeArray[i] == kodePlat) {
                return kotaArray[i];
            }
        }
        return null;
    }
}
