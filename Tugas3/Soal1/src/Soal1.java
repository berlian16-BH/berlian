import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Soal1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String word;

        do {
            word = obj.nextLine();
            if (word.length() < 1) {
                System.out.println("Kata tidak boleh kosong");
                continue;
            }
            Pattern pattern = Pattern.compile("[a-zA-Z]+");
            Matcher matcher = pattern.matcher(word);

            int count = 0;
            ArrayList<String> tokens = new ArrayList<>();

            while (matcher.find()) {
                String token = matcher.group();
                tokens.add(token);
                count++;
            }

            System.out.println("" + count);

            for (String token : tokens) {
                System.out.println(token);
            }

        } while (word.length() > 1);
    }
}