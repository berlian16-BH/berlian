import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        char temp = 'n';
        while (temp != 'y' && temp != 'Y') {
            Scanner myObj = new Scanner(System.in);
            System.out.print("Enter number: ");
            String user = myObj.nextLine();
            try {
                long inp = Long.parseLong(user);
                if (inp >= Byte.MIN_VALUE && inp <= Byte.MAX_VALUE) {
                    System.out.println(inp + " can be fitted in:");
                    System.out.println(" * short\n * int\n * long");
                } else if (inp >= Short.MIN_VALUE && inp <= Short.MAX_VALUE) {
                    System.out.println(inp + " can be fitted in:");
                    System.out.println(" * int\n * long");
                } else if (inp >= Integer.MIN_VALUE && inp <= Integer.MAX_VALUE) {
                    System.out.println(inp + " can be fitted in:");
                    System.out.println(" * int\n * long");
                } else if (inp >= Long.MIN_VALUE && inp <= Long.MAX_VALUE) {
                    System.out.println(inp + " can be fitted in:");
                    System.out.println(" * long");
                }
            } catch (NumberFormatException e) {
                System.out.println("can't be fitted anywhere");
            }
            System.out.println();
            System.out.print("Exit?");
            temp = myObj.nextLine().charAt(0);
        }
    }
}