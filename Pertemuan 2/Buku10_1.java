public class Buku10_1 {

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
        System.out.println("Harga buku telah diubah menjadi " + hargaBaru);
    }

    static void tampilkanDaftarBuku() {
    }

    static void urutkanDaftarBukuBerdasarkanJudul() {
    }
}
