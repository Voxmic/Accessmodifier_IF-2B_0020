package Week2;

import Week2.base.Produk;

public class Main {
    public static void main(String[] args) {
        Week2.base.Produk p = new Produk("Indomie Goreng",3500,100, "Makanan");

        // System.out.println(p.nama);
        // System.out.println(p.harga);
        // System.out.println(p.stok);
        // System.out.println(p.kategori);
        
        p.tampilkanInfo();
    }
    
}
