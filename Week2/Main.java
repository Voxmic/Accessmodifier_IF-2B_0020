package Week2;

import Week2.base.Makanan;
import Week2.base.Elektronik;
import Week2.base.Produk;

public class Main {
    public static void main(String[] args) {
        Elektronik e = new Elektronik("Mesin Cuci", 1000000, 1, 1);
        e.setGaransi(12);
        e.tampilData();
        Makanan m = new Makanan("Indomie Goreng", 5000, 100, 365);
        m.setExpired(365);
        m.tampilData();
    }
}