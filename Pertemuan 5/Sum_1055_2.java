import java.util.Scanner;

public class Sum_1055_2 {
    public int numCompanies;
    public int[] numMonths;
    public double[][] profits;

    public Sum_1055_2(int numCompanies) {
        this.numCompanies = numCompanies;
        this.numMonths = new int[numCompanies];
        this.profits = new double[numCompanies][];
    }

    public void inputProfits(Scanner scanner) {
        for (int i = 0; i < numCompanies; i++) {
            System.out.print("Masukkan jumlah bulan untuk Perusahaan " + (i + 1) + ": ");
            numMonths[i] = scanner.nextInt();
            profits[i] = new double[numMonths[i]];

            System.out.println("Masukkan keuntungan untuk Perusahaan " + (i + 1) + " (Satuan Juta. Misal 5.9):");
            for (int j = 0; j < numMonths[i]; j++) {
                System.out.print("  Bulan ke-" + (j + 1) + ": ");
                profits[i][j] = scanner.nextDouble();
            }
        }
    }

    public double totalProfitBF(double[] arr) {
        double total = 0;
        for (double value : arr) {
            total += value;
        }
        return total;
    }

    public double totalProfitDC(double[] arr, int i, int r) {
        if (i == r) {
            return arr[i];
        } else if (i < r) {
            int mid = (i + r) / 2;
            double leftSum = totalProfitDC(arr, i, mid);
            double rightSum = totalProfitDC(arr, mid + 1, r);
            return leftSum + rightSum;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah perusahaan: ");
        int numCompanies = scanner.nextInt();

        Sum_1055_2 mcp = new Sum_1055_2(numCompanies);
        mcp.inputProfits(scanner);

        System.out.println("==============================================================");
        for (int i = 0; i < numCompanies; i++) {
            System.out.println("Perusahaan " + (i + 1) + ":");
            System.out.println("--------------------------------------------------------------");
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + mcp.numMonths[i] + " bulan adalah "
                    + mcp.totalProfitBF(mcp.profits[i]) + " juta");
            System.out.println("==============================================================");
            System.out.println("Algoritma Devide dan Conquer");
            System.out.println("Total keuntungan perusahaan selama " + mcp.numMonths[i] + " bulan adalah "
                    + mcp.totalProfitDC(mcp.profits[i], 0, mcp.numMonths[i] - 1) + " juta");
            System.out.println("==============================================================");
        }
        scanner.close();
    }
}
