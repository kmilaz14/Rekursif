import java.util.Scanner;

public class DeretDescendingRekursif {
    static void descendingRekursif(int n){
        if (n< 0){
            return;
        }
        System.out.print(n + " ");
        descendingRekursif(n-1);
    }

    static void descendingIteratif(int n){
        for (int i=n; i>=0; i--){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        System.out.println("Menggunakan fungsi rekursif: ");
        descendingRekursif(n);
        System.out.println("\nMenggunakan fungsi iteratif: ");
        descendingIteratif(n);
    }
}
