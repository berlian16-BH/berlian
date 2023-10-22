package kasus3;

public class weeklySales {
    public static void main(String[] args) {
        Salesperson[] salesStaff = new Salesperson[4];
        salesStaff[0] = new Salesperson("Benny", "Yoga", 3000);
        salesStaff[1] = new Salesperson("Rizki", "Halohalo", 4000);
        salesStaff[2] = new Salesperson("Nuval", "Ardana", 3000);
        salesStaff[3] = new Salesperson("Upap", "Combo", 2800);

        // Implementasi Insertion Sort secara descending
        for (int i = 1; i < salesStaff.length; i++) {
            Salesperson key = salesStaff[i];
            int j = i - 1;
            while (j >= 0 && salesStaff[j].getTotalSales() < key.getTotalSales()) {
                salesStaff[j + 1] = salesStaff[j];
                j = j - 1;
            }
            salesStaff[j + 1] = key;
        }

        System.out.println("\nRanking of Sales for the week (Descending)\n");
        for (Salesperson s : salesStaff)
            System.out.println(s);
    }
}
