package Week2.base;

public class Makanan extends Produk {
    private int expired;

    public Makanan(String nama, double harga, int stok, int expired) {
        super(nama, harga, stok);
        this.expired = expired;
    }

    public void tampilData() {
        super.tampilkanInfo();
        System.out.println("Masa Expired: " + expired);
    }

    public void setExpired(int expired) {
        this.expired = expired;
    }
}