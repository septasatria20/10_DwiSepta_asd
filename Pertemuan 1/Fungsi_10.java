public class Fungsi_10 {
    public static void main(String[] args) {
        String[] cabang = {"Royal Garden1", "Royal Garden2", "Royal Garden3", "Royal Garden4"};
        int[][] stok = {{10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5}, {5, 7, 12, 9}};
        double[] harga = {75000, 50000, 60000, 10000};

        System.out.println("==========================PENDAPATAN==========================");
        for (int i = 0; i < cabang.length; i++) {
            double pendapatan = Pendapatan(stok[i], harga);
            System.out.println("Pendapatan dari " + cabang[i] + ": Rp. " + pendapatan);
            System.out.println(" ");
        }

        System.out.println("==========================STOK BUNGA==========================");
        for (int i = 0; i < cabang.length; i++) {
            System.out.println("Jumlah stok bunga pada " + cabang[i] + ":");
            TampilkanStok(stok[i]);
            System.out.println(" ");
        }

        PenguranganStok(stok[3], "Aglonema", 1);
        PenguranganStok(stok[3], "Keladi", 2);
        PenguranganStok(stok[3], "Alocasia", 0);
        PenguranganStok(stok[3], "Mawar", 5);

    }

    public static double Pendapatan(int[] stok, double[] harga) {
        double total = 0;
        for (int i = 0; i < stok.length; i++) {
            total += stok[i] * harga[i];
        }
        return total;
    }

    public static void TampilkanStok(int[] stok) {
        for (int i = 0; i < stok.length; i++) {
            System.out.println("Jenis Bunga " + (i + 1) + ": " + stok[i]);
        }
    }

    public static void PenguranganStok(int[] stok, String jenisBunga, int jumlah) {
        int index = -1;
        switch (jenisBunga) {
            case "Aglonema":
                index = 0;
                break;
            case "Keladi":
                index = 1;
                break;
            case "Alocasia":
                index = 2;
                break;
            case "Mawar":
                index = 3;
                break;
            default:
                System.out.println("Jenis bunga tidak valid.");
                return;
        }

        if (index >= 0 && index < stok.length) {
            stok[index] -= jumlah;
            if (stok[index] < 0) {
                stok[index] = 0; 
            }
            System.out.println("Pengurangan stok " + jenisBunga + " sebanyak " + jumlah + " di Royal Garden4");
            System.out.println("Jumlah stok " + jenisBunga + " : " + stok[index]);
        }
    }
}
