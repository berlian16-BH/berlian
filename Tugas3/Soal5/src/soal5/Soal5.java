package soal5;
import java.util.Scanner;

public class Soal5 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();

        String[] Part = str.split(" ");
        String value = Part[0];

        for (int i = 1; i < Part.length; i++) {
            value += Part[i];
        }
        long result = Long.parseLong(value);

        if ((result - 999999) % 5 != 0) {
            System.out.println("Berhenti");
        } else {
            System.out.println("Jalan");
        }
    }
}