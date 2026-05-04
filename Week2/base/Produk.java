package Week2.base;

public class Produk {
    // atribut
    private String nama;
    private double harga;
    private int stok;
    
//constructor
public Produk(String nama, double harga, int stok) {
    this.nama = nama;
    this.harga = harga;
    this.stok = stok;
}

public Double getHarga() {
    return harga;
}

public int getStok() {
    return stok;
}

public String getNama() {
    return nama;
}

public void setHarga(double harga) {
    this.harga = harga;
}

public void setStok(int stok) {
    this.stok = stok;
}

public void kurangiStok(int jumlah) {
    if(jumlah > stok) {
        System.out.println("Melebihi stok");
    } else {
        stok = stok - jumlah;
    }
}

public double hitungTotalHarga(int jumlah) {
    return harga * jumlah;
}

public void beli(int jumlahBeli) {
    if (jumlahBeli <= 0) {
        System.out.println("Jumlah beli harus lebih dari 0!");
    }
    if (jumlahBeli > stok) {
        System.out.println("stok" + nama + "tidak cukup! tersisa: " + stok);
    }
    stok -= jumlahBeli;
}
public void tampilkanInfo(){
    System.out.println("Produk: " + nama);
    System.out.println("Harga: " + harga);
    System.out.println("Stok: " + stok);
    System.out.println("-------------------------");
}

}