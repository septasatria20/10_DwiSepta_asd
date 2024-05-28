import java.util.Scanner;

public class Tugas1033_2 {
    private String[] namaPenumpang;
    private String[] nomorNik;
    private String[] nomorTelp;
    private String[] kelasKereta;
    private String[] bangku;

    public Tugas1033_2(int jumlahPenumpang) {
        namaPenumpang = new String[jumlahPenumpang];
        nomorNik = new String[jumlahPenumpang];
        nomorTelp = new String[jumlahPenumpang];
        kelasKereta = new String[jumlahPenumpang];
        bangku = new String[jumlahPenumpang];
    }

    public void tampilInformasiKereta() {
        System.out.println("===== Informasi Kereta =====");
    }

    public void pesanTiket(int index) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Pemesanan Tiket =====");
        System.out.print("Nama Penumpang: ");
        namaPenumpang[index] = sc.nextLine();
        System.out.print("Nomor NIK: ");
        nomorNik[index] = sc.nextLine();
        System.out.print("Nomor Telepon: ");
        nomorTelp[index] = sc.nextLine();
        System.out.print("Kelas Kereta (Eksekutif/Bisnis/Ekonomi): ");
        kelasKereta[index] = sc.nextLine();
        pilihBangku(index);
    }

    public void pilihBangku(int index) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pilih Bangku: ");
        bangku[index] = sc.nextLine();
    }

    public void tampilkanStruk(int index) {
        System.out.println("===== Struk Pembayaran =====");
        System.out.println("Nama Penumpang: " + namaPenumpang[index]);
        System.out.println("Nomor NIK: " + nomorNik[index]);
        System.out.println("Nomor Telepon: " + nomorTelp[index]);
        System.out.println("Kelas Kereta: " + kelasKereta[index]);
        System.out.println("Nomor Bangku: " + bangku[index]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah penumpang: ");
        int jumlahPenumpang = sc.nextInt();

        Tugas1033_2 kaiPolinema = new Tugas1033_2(jumlahPenumpang);

        for (int i = 0; i < jumlahPenumpang; i++) {
            kaiPolinema.pesanTiket(i);
        }

        kaiPolinema.tampilInformasiKereta();
        
        for (int i = 0; i < jumlahPenumpang; i++) {
            kaiPolinema.tampilkanStruk(i);
        }
    }
}
