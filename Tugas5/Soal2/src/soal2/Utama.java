package soal2;
import java.util.Scanner;


public class Utama {
	
	public static Produk[] generateProduk() {
		Produk[] listProduk = new Produk[10];
		String[] namaProduk = {
				"Combro", "Bala-bala", " Gehu", "Kacang",  "Bacang", "Nasi Kuning",
				"Nasi Uduk", "Kopikap", "Aqua", "Ale-ale"
		};
		
		int[] hargaProduk = {
				1000, 1000, 1500, 1000, 1000, 6000, 6000, 1000, 3000, 1000
		};
		
		int[] stokProduk= {
			3, 3, 15, 10, 10, 5, 10, 15, 10, 20
		};
		
		for(int i=0; i < 10; i++) {
			listProduk[i] = new Produk(namaProduk[i], hargaProduk[i], stokProduk[i]);
		}
		
		return listProduk;
	}

	public static void main(String[] args) {
		Produk[] listProduk = generateProduk();
		Penjualan listPenjualan = new Penjualan();
		
		System.out.println("Daftar Menu Makanan");
		System.out.println("====================================");
		for(int i=0; i<10; i++) {
			listProduk[i].print();
		}
		System.out.println("\n");
		Scanner scan = new Scanner(System.in);
		char pilihan = 'y';
		byte jumlahPembelian = 1;
		
		while((pilihan == 'y' || pilihan == 'Y') && (jumlahPembelian <=10)){
			System.out.print("Masukkan Id Pilihan Makanan = ");
			int id = scan.nextInt();
			System.out.print("Masukkan Jumlah Pembelian = ");
			int jumlah = scan.nextInt();
			String nama = listProduk[id-1].getNamaProduk();
			int harga = listProduk[id-1].getHarga();
			listPenjualan.TambahPesanan(nama, jumlah, harga*jumlah);
			System.out.print("\nApakah akan memesan kembali = ");
			pilihan = scan.next().charAt(0);
			jumlahPembelian++;
		}
		listPenjualan.PesananSaya();
	}

}