public class BukuMain10 {

    public static void main(String[] args) {
        Buku bk = new Buku();

        bk.judul = "Today Ends. Tomorrow Comes";
        bk.pengarang = "Denanda Pratiwi";
        bk.halaman = 198;
        bk.stok = 13;
        bk.harga = 71000;

        bk.tampilInformasi();
        bk.terjual(5);
        bk.gantiHarga(60000);
        bk.tampilInformasi();
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
}
