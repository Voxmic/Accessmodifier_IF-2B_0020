package Week2;

import Week2.base.Produk;

public class Main {
    public static void main(String[] args) {
        Produk p = new Produk("Indomie Goreng",5000,100);

        System.out.println(p.getNama());
        System.out.println(p.getHarga());;
        p.setHarga(10000);
        System.out.println(p.getStok());
        p.setStok(50);
        System.out.println(p.getNama());
        System.out.println(p.getHarga());
        System.out.println(p.getStok());
    }
}
