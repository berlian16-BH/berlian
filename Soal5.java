package soal5;
import java.util.*;

public class Soal5 {
    public static String AIsLarger(String A, String B) {
        return A.compareTo(B) > 0 ? "Yes" : "No";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan String 1: ");
        String A = sc.next();
        System.out.print("Masukkan String 2: ");
        String B = sc.next();

        System.out.println((A.length() + B.length()));
        System.out.println(AIsLarger(A, B));

        // Menggabungkan string A dan B dengan huruf pertama diubah menjadi huruf besar
        String result = A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(result);
    }
}