package UTSASD10;

public class Transaksi {
    public String noRekening;
    public double saldo;
    public double saldoAwal;
    public double saldoAkhir;
    public String tanggalTransaksi;
    public String type;


    public Transaksi(String noRekening, double saldo, double saldoAwal, double saldoAkhir, String tanggalTransaksi, String type) {
        this.noRekening = noRekening;
        this.saldo = saldo;
        this.saldoAwal = saldoAwal;
        this.saldoAkhir = saldoAkhir;
        this.tanggalTransaksi = tanggalTransaksi;
        this.type = type;
    }

    public void cetakInfoTransaksi() {
        System.out.println("No Rekening       : " + noRekening);
        System.out.println("Tanggal Transaksi : " + tanggalTransaksi);
        System.out.println("Type Transaksi    : " + type);
        System.out.println("Saldo             : " + saldo);
        System.out.println("Saldo Awal        : " + saldoAwal);
        System.out.println("Saldo Akhir       : " + saldoAkhir);
    }
}
