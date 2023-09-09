package soal4;
import java.util.Scanner;

public class Soal4 {
   
    public static void main(String[] args) {
        
        Scanner myobj = new Scanner(System.in);
        float primeSalary = 500000;
        
        System.out.print("Input jumlah penjualan: ");
        int totalSale = myobj.nextInt();
        float itemPrice = 50000;
        float bonusPerSale = totalSale * (itemPrice * 10 /  100 );
        float achievement = 0;
        if (totalSale > 80) {
            achievement = totalSale * (itemPrice * 10 / 100);  
        } else if (totalSale >= 40 && totalSale < 80) {
            achievement = totalSale * (itemPrice * 25 / 100);
        } else if (totalSale < 15) {
            achievement = (totalSale - 15) * (itemPrice * 15 / 100);
            bonusPerSale = 10;
        }
        float totalSalary = primeSalary + bonusPerSale + achievement;
        System.out.println("Gaji pokok : " + primeSalary
               + "\nBonus Penjualan : " + bonusPerSale
               + "\nBonus / Denda : " + achievement);
        System.out.println("Total Gaji : " + totalSalary);       
    }
}