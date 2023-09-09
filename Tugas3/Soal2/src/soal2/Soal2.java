package soal2;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str[] = new String[255];
        String Part[];
        int i;

        for (i = 0; ; i++) {
            str[i] = obj.nextLine();
            if (str[i].equals("")) {
                break;
            }
        }

        System.out.println("=====================");

        for (int j = 0; j < i; j++) {
            Part = str[j].split(" ");
            if (str[j].equals("")) {
                break;
            }
            int value = Integer.valueOf(Part[1]);
            System.out.println(String.format("%-15s", Part[0]) + String.format("%03d", value));
        }

        System.out.println("======================");
    }
}