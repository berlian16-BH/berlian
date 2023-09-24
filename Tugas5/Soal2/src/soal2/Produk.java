package soal2;

public class Produk {
  private String namaProduk;
  private int harga;
  private int stok;
  private int id;
  private static int nextid =0;
  {
   this.id =nextid;
   nextid++;
  }
  public String getNamaProduk(){
      return namaProduk;
}
  public void setNamaProduk(String namaProduk){
      this.namaProduk =namaProduk;
  }
  public int getHarga(){
      return harga;
  }
  public void setHarga(int harga){
      this.harga =harga;
  }
  public int getStok(){
      return stok;
  }
  public void setStok( int stok){
      this.stok =stok;
  }
  public int getId(){
      return id;
  }
  public Produk(String nama,int harga,int stok){
      this.namaProduk=nama;
      this.stok =stok;
      this.harga =harga;
  }
  public void print(){
      System.out.println((this.id)+" "+ this.namaProduk + " = Rp."+this.harga+ "("+this.stok+")");
}
}
