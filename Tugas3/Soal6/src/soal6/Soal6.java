package soal6;
import java.math.BigInteger;
import java.util.Scanner;

public class Soal6 {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        BigInteger A = obj.nextBigInteger();
        BigInteger B = obj.nextBigInteger();

        System.out.println(A + " + " + B + " = " + A.add(B));
        System.out.println(A + " x " + B + " = " + A.multiply(B));
    }

}