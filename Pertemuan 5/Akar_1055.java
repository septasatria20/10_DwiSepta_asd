import java.util.Scanner;

public class Akar_1055 {
    public static int akarBF(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int i = 1, result = 1;
        while (result <= n) {
            i++;
            result = i * i;
        }
        return i - 1;
    }

    public static int akarDC(int n) {
        return akarDC(n, 1, n);
    }

    private static int akarDC(int n, int start, int end) {
        if (start <= end) {
            int mid = (start + end) / 2;
            int midSquare = mid * mid;
            if (midSquare == n) {
                return mid;
            }
            if (midSquare < n) {
                return akarDC(n, mid + 1, end);
            }
            return akarDC(n, start, mid - 1);
        }
        return end;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int number = scanner.nextInt();

        int sqrtBF = akarBF(number);
        System.out.println("Akar kuadrat (Brute Force): " + sqrtBF);

        int sqrtDC = akarDC(number);
        System.out.println("Akar kuadrat (Divide and Conquer): " + sqrtDC);

        if (sqrtBF * sqrtBF != number) {
            System.out.println("Nilai akar dibulatkan ke bawah: " + sqrtBF);
        }
        
        if (sqrtDC * sqrtDC != number) {
            System.out.println("Nilai akar dibulatkan ke bawah: " + sqrtDC);
        }

        scanner.close();
    }
}
