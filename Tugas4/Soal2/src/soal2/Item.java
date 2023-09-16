package soal2;

public class Item {
    private String name;

    private Item() {
        name = "Ipin";
    }

    public Item(String name) {
        this(); // Panggil konstruktor default untuk menginisialisasi name dengan "Ipin"
        System.out.println(this.name); // Timpa nilai name dengan nilai yang diberikan
    }

}