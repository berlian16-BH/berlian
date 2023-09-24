package soal1;

public class RestoranMain {

	public static void main(String[] args) {
		Restoran menu = new Restoran();
		menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
		Restoran.nextId();
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		Restoran.nextId();
		menu.tambahMenuMakanan("Tahu", 1_000, 00);
		Restoran.nextId();
		menu.tambahMenuMakanan("Molen", 1_000, 20);
		
		menu.tampilMenuMakanan();
		
		System.out.println("");
		
		menu.pemesanan(4,3);
		menu.pemesanan(2,1);
		menu.tampilMenuMakanan();
	}

}