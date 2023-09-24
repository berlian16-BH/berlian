package soal1;

public class Restoran {
	private Makanan[] food;
	private static byte id=0;
	
	public static byte getId() {
		return id;
	}

	public static void setId(byte id) {
		Restoran.id = id;
	}
	
	public Restoran() {
		food = new Makanan[10];
 	}
			
	public void tambahMenuMakanan(String nama, double harga, int stok) {
		this.food[id] = new Makanan(nama,harga,stok);
	}
	
	public void tampilMenuMakanan() {
		for(int i = 0; i <= id; i++) {
			if(!isOutOfStock(i)) {
				System.out.print(i+1 + " "); 
				this.food[i].TampilMakanan();
				System.out.println("");
			}
		}
	}
	
	public void pemesanan(int idMakanan, int jumlah) {
		for(int i =0;i<=id;i++) {
			if(i == idMakanan-1) {
				this.food[i].kurangStok(jumlah);
			}
		}
	}
	
	public boolean isOutOfStock(int id) {
		if(food[id].getStok() == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void nextId() {
		id++;
		setId(id);
	}
}