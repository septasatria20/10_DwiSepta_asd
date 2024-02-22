public class BukuMain10_2 {

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
        
        double hargaTotal = hitungHargaTotal();
        double diskon = hitungDiskon();
        double hargaBayar = hitungHargaBayar();
        
        System.out.println("Harga total: " + hargaTotal);
        
        // Menambahkan informasi diskon
        if (diskon > 0) {
            System.out.println("Diskon: " + diskon);
        } else {
            System.out.println("Tidak ada diskon.");
        }

        System.out.println("Harga bayar: " + hargaBayar);
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

    int hitungHargaTotal() {
        return (int) (stok * harga);
    }

    double hitungDiskon() {
        double hargaTotal = hitungHargaTotal();

        if (hargaTotal > 150000) {
            return 0.12 * hargaTotal; 
        } else if (hargaTotal >= 75000) {
            return 0.05 * hargaTotal; 
        } else {
            return 0;
        }
    }

    double hitungHargaBayar() {
        double hargaTotal = hitungHargaTotal();
        double diskon = hitungDiskon();
        return hargaTotal - diskon;
    }
}
