package UTSASD10;
import java.util.Scanner;

public class MainTransaksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //========================================Data Rekening================================================
        Rekening[] rekenings = {
            new Rekening("16030927 3084", "Wallace", "Chase Castro", "1-458-264-3263", "ligula.Nullam@tacitisociosqu.edu"),
            new Rekening("16100617 0573", "Darius", "Julian Daniel", "1-357-843-0547", "nec@lectusjusto.org"),
            new Rekening("16240401 2243", "Fuller", "Finn Dunlap", "571-7062", "convallis@Vestibulumanteipsum.org"),
            new Rekening("16270525 0112", "Malcolm", "Keane Floyd", "623-0234", "porttitor.tellus.non@Curabitur.ca"),
            new Rekening("16971204 2416", "Geoffrey", "Stephen Pratt", "1-683-416-8323", "ut.pellentesque@luctusutpellentesque.com"),
            new Rekening("16100727 8862", "Rudyard", "Charles Morales", "650-5379", "Proin.eget@velitegestaslacinia.ca"),
            new Rekening("16460329 4259", "Troy", "Damon Guerra", "897-7608", "pede.Suspendisse.dui@a.ca"),
            new Rekening("16320421 3437", "Alec", "Cooper Lee", "792-4447", "non@mus.com"),
            new Rekening("16180729 7229", "Walter", "Seth Drake", "863-8209", "Pellentesque.ut.ipsum@neque.ca"),
            new Rekening("16950313 6823", "Simon", "Burton Gates", "592-6919", "tellus.justo.sit@commodoauctor.net"),
            new Rekening("16850708 3528", "Kamal", "Odysseus Salas", "1-115-339-7678", "dictum@nec.edu"),
            new Rekening("16080205 9329", "Xenos", "Colin Curry", "1-891-703-2664", "vel@ullamcorpermagna.co.uk"),
            new Rekening("16080628 2695", "Merritt", "Clarke Roman", "1-978-632-5110", "Aliquam.gravida@vestibulumMauris.net"),
            new Rekening("16130909 2979", "Ryder", "Joel Cunningham", "817-1766", "interdum.Curabitur.dictum@rutrumurna.edu"),
            new Rekening("16890212 8688", "Preston", "Brock Schroeder", "1-675-400-4501", "et.ultrices@a.co.uk"),
            new Rekening("16141008 9963", "Alec", "Baker Barton", "527-9085", "ut@aultriciesadipiscing.ca"),
            new Rekening("16511222 7763", "Price", "Ashton Burke", "1-564-419-4285", "Proin.velit@Duisac.net"),
            new Rekening("16720623 0943", "Devin", "Slade Flores", "977-6690", "ac@nibhAliquamornare.com"),
            new Rekening("16771126 7372", "Ignatius", "Lionel Kane", "353-5137", "cubilia.Curae.Phasellus@Duis.com")
        };

        //========================================Data Transaksi=================================================
        Transaksi[] transaksis = {
            new Transaksi("16720623 0943", 898214, 494048, 3587, "2021-03-09 07:54:42", "Debit"),
            new Transaksi("16511222 7763", 205420, 200162, 775880, "2021-06-25 10:23:00", "Kredit"),
            new Transaksi("16141008 9963", 838632, 350929, 328316, "2021-09-18 23:00:04", "Kredit"),
            new Transaksi("16971204 2416", 230659, 204434, 690503, "2022-02-02 19:10:34", "Kredit"),
            new Transaksi("16720623 0943", 770592, 334245, 444267, "2020-08-11 13:36:56", "Debit"),
            new Transaksi("16180729 7229", 685302, 451002, 376442, "2020-05-23 07:34:53", "Debit"),
            new Transaksi("16180729 7229", 816129, 851403, 597842, "2021-07-18 19:41:20", "Kredit"),
            new Transaksi("16890212 8688", 989609, 802752, 333823, "2022-02-01 01:13:11", "Kredit"),
            new Transaksi("16320421 3437", 297103, 396116, 779589, "2021-07-03 01:09:49", "Kredit"),
            new Transaksi("16950313 6823", 66190, 619774, 259150, "2021-09-09 03:57:30", "Debit"),
            new Transaksi("16130909 2979", 234301, 547922, 278309, "2021-08-24 13:18:39", "Debit"),
            new Transaksi("16850708 3528", 243306, 50283, 869468, "2021-03-12 03:40:16", "Debit"),
            new Transaksi("16460329 4259", 371045, 602034, 991242, "2021-08-06 11:48:59", "Kredit"),
            new Transaksi("16141008 9963", 395170, 472273, 97058, "2021-05-02 10:53:31", "Debit"),
            new Transaksi("16130909 2979", 862731, 109431, 561908, "2021-07-31 08:11:00", "Debit"),
            new Transaksi("16130909 2979", 556798, 725426, 31387, "2021-03-27 06:18:20", "Debit"),
            new Transaksi("16180729 7229", 873982, 846142, 896213, "2021-07-18 04:06:30", "Kredit"),
            new Transaksi("16771126 7372",774247, 775848, 739406, "2020-10-24 01:39:00", "Kredit"),
            new Transaksi("16511222 7763", 66987, 868772, 823014, "2020-12-21 05:57:59", "Kredit")
        };


        for (Transaksi transaksi : transaksis) {
            if (transaksi.noRekening != null) {
                for (Rekening rekening : rekenings) {
                    if (transaksi.noRekening.equals(rekening.noRekening)) {
                        transaksi.saldo += transaksi.saldo;
                        break;
                    }
                }
            }
        }

        int pilihan;
        do {
            System.out.println("\n==========UTS==========");
            System.out.println("1. Tampil data rekening");
            System.out.println("2. Tampil data transaksi");
            System.out.println("3. Mencari saldo > 500000");
            System.out.println("4. Sorting by name");
            System.out.println("5. Keluar");
            System.out.print("\nPilih (1-5) : ");

            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\nData Rekening:");
                    for (Rekening rekening : rekenings) {
                        rekening.cetakInfo();
                        System.out.println("-------------");
                    }
                    break;

                case 2:
                    System.out.println("\nData Transaksi:");
                    for (Transaksi transaksi : transaksis) {
                        transaksi.cetakInfoTransaksi();
                        System.out.println("-------------");
                    }
                    break;

                case 3:
                    System.out.println("\nRekening dengan saldo > 500000:");
                    for (Transaksi transaksi: transaksis) {
                        if (transaksi.saldo > 500000) {
                            transaksi.cetakInfoTransaksi();
                            System.out.println("-------------");
                        }
                    }
                    break;

                case 4:
                    for (int i = 0; i < rekenings.length - 1; i++) {
                        for (int j = i + 1; j < rekenings.length; j++) {
                            if (rekenings[i].nama.compareToIgnoreCase(rekenings[j].nama) > 0) {
                                Rekening temp = rekenings[i];
                                rekenings[i] = rekenings[j];
                                rekenings[j] = temp;
                            }
                        }
                    }
                    System.out.println("\nData Rekening setelah diurutkan berdasarkan nama:");
                    for (Rekening rekening : rekenings) {
                        rekening.cetakInfo();
                        System.out.println("-------------");
                    }
                    break;

                case 5:
                    System.out.println("TEERIMAAA KAAASIIIHHHHHHHH.:))                            -Dwi Septa Satria Agung");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }

        } while (pilihan != 5);

        scanner.close();
    }
}
