import java.util.Scanner;

public class Fibonacci {
    static int fibonacci(int bulan){
        if (bulan == 1 || bulan==2) {
            return 1;
        }
        return fibonacci(bulan-1) + fibonacci(bulan-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bulan ke-n: ");
        int bulan = sc.nextInt();

        int totalPasangan = fibonacci(bulan);
        System.out.println("Jumlah total pasangan marmut pada bulan ke-" + bulan + " adalah: " + totalPasangan);
    }
}
