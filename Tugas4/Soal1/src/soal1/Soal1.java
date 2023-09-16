package soal1;
public class Soal1 {

    Barang[] barangs;

    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }

    void showBarang() {
        System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")");
        System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
    }

    void pengadaan() {
        initBarang();
        barangs[0].setStok(20);
        barangs[0].setStok(-10);
        barangs[0].setStok(40);
    }

    public static void main(String[] args) {
        Soal1 beli = new Soal1();
        beli.pengadaan();
        beli.showBarang();
    }

    public class Barang {
        String kode_barang;
        String nama_barang;
        private int stok;

        public int getStok() {
            return stok;
        }

        public void setStok(int stok) {
            if (stok >= 0) {
                addStok(stok);
            } else {
                System.out.println("Penambahan stok harus positif.");
            }
        }
        

        public Barang(String kode, String nama, int stk) {
            kode_barang = kode;
            nama_barang = nama;
            stok = stk;
        }

        public void addStok(int value) {
            this.stok += value;
        }
    }
}
