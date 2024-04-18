package UTSASD10;

public class Rekening {
    public String noRekening;
    public String nama;
    public String namalbu;
    public String phone;
    public String email;

    public Rekening(String noRekening, String nama, String namalbu, String phone, String email) {
        this.noRekening = noRekening;
        this.nama = nama;
        this.namalbu = namalbu;
        this.phone = phone;
        this.email = email;
    }

    public void cetakInfo() {
        System.out.println("No Rekening : " + noRekening);
        System.out.println("Nama        : " + nama);
        System.out.println("Nama Ibu    : " + namalbu);
        System.out.println("Phone       : " + phone);
        System.out.println("Email       : " + email);
    }
}
