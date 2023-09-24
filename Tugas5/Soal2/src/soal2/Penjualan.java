package soal2;

public class Penjualan {
	private String[] nama_produk;
	private int[] quantity;
	private int[] harga_total;
	private static int id = 0;
	int x;
	
	public Penjualan() {
		this.nama_produk = new String[10];
		this.quantity = new int[10];
		this.harga_total = new int[10];
	}
	
	public void TambahPesanan(String namaProduk, int Qty, int hargaTotal) {
		this.nama_produk[id] = namaProduk;
		this.quantity[id] = Qty;
		this.harga_total[id] += hargaTotal;
		id++;
	}
	
	public void PesananSaya() {
		double totalPesanan = 0;
		for(int i = 0 ; i<id;i++) {
			System.out.println(this.nama_produk[i] + " " + this.quantity[i]);
			totalPesanan += this.harga_total[i];
		}
		System.out.println("Pesanan Anda : " + totalPesanan);
	}
}