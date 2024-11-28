import java.util.Scanner;

public class Tugas2 {
    static int hitungPenjumlahan(int f){
        if (f==0){
            return 0;
        }
        return f + hitungPenjumlahan(f-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai f: ");
        int f = sc.nextInt();

        for (int i=1; i<=f; i++){
            System.out.print(i + (i<f? "+" : " = "));
        }

        System.out.println(hitungPenjumlahan(f));
    }
}
