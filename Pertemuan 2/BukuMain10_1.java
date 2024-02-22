public class BukuMain10_1 {

    public static void main(String[] args) {
        Buku bk1 = new Buku();

        bk1.judul = "Today Ends. Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku bk2 = new Buku("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();
    }
}

class Buku {
    String judul;
    String pengarang;
    int halaman;
    int stok;
    double harga;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Halaman: " + halaman);
        System.out.println("Stok: " + stok);
        System.out.println("Harga: " + harga);
    }

    void terjual(int jumlah) {
        if (jumlah <= stok) {
            stok -= jumlah;
            System.out.println(jumlah + " buku telah terjual.");
        } else {
            System.out.println("Stok tidak mencukupi.");
        }
    }

    void gantiHarga(double hargaBaru) {
        harga = hargaBaru;
        System.out.println("Harga: " + hargaBaru);
    }

    public Buku (String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
}
