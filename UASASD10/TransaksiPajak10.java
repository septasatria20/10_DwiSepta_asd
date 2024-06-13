package UASASD10;

public class TransaksiPajak10 {
    private static int nextKode = 1;
    private int kode;
    private long nominalBayar;
    private long denda;
    private int bulanBayar;
    private String namaPemilik;
    private Kendaraan10 kendaraan;

    public TransaksiPajak10(String namaPemilik, long nominalBayar, long denda, int bulanBayar, Kendaraan10 kendaraan) {
        this.kode = nextKode++;
        this.namaPemilik = namaPemilik;
        this.nominalBayar = nominalBayar;
        this.denda = denda;
        this.bulanBayar = bulanBayar;
        this.kendaraan = kendaraan;
    }

    public int getKode() {
        return kode;
    }

    public long getNominalBayar() {
        return nominalBayar;
    }

    public long getDenda() {
        return denda;
    }

    public int getBulanBayar() {
        return bulanBayar;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public Kendaraan10 getKendaraan() {
        return kendaraan;
    }

    @Override
    public String toString() {
        return "TransaksiPajak: " +
                "kode=" + kode +
                ", namaPemilik='" + namaPemilik + '\'' +
                ", nominalBayar=" + nominalBayar +
                ", denda=" + denda +
                ", bulanBayar=" + bulanBayar +
                ", kendaraan=" + kendaraan.getNoTNKB();
    }

    public static long hitungNominalPajak(Kendaraan10 kendaraan) {
        int cc = kendaraan.getCc();
        String jenis = kendaraan.getJenis();

        if (jenis.contains("Motor")) {
            if (cc < 100) {
                return 100000;
            } else if (cc >= 100 && cc <= 250) {
                return 250000;
            } else { 
                return 500000;
            }
        } else if (jenis.contains("Mobil")) {
            if (cc < 1000) {
                return 750000;
            } else if (cc >= 1000 && cc <= 2500) {
                return 1000000;
            } else {
                return 1500000;
            }
        } else {
            return 0;
        }
    }

    public static long hitungDenda(int bulanBayar, int bulanHarusBayar) {
        if (bulanBayar <= bulanHarusBayar) {
            return 0;
        } else {
            int selisihBulan = bulanBayar - bulanHarusBayar;
            if (selisihBulan <= 3) {
                return selisihBulan * 50000;
            } else {
                return 3 * 50000 + (selisihBulan - 3) * 50000;
            }
        }
    }
}
