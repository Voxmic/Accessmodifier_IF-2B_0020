package Week2.base;

public class Makanan extends Produk {

    private String expired;
    private String kategori;

    public Makanan(String nama, double harga, int stok, String expired, String kategori) {
        super(nama, harga, stok);
        this.expired = expired;
        this.kategori = kategori;
    }

    public void setExpired(String expired){
        this.expired = expired;
        System.out.println("Expired: " + expired);
    }

    public String getKategori(){
        return kategori;
    }

    public String getExpired() {
        return expired;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("[MAKANAN]");
        super.tampilkanInfo();
        System.out.println("Expired: " + expired);
        System.out.println("Kategori: " + kategori);
        System.out.println("-------------------------");
    }

    //overloading
    //versi 1 - diskon otomaatis jika beli >= 10
    public double hitungDiskon(int jumlahBeli) {
        if (jumlahBeli >= 10) return hitungTotalHarga(jumlahBeli) * 0.05;
        return 0;
    }

    //versi 2 - diskon dengan persentase custom
    public double hitungDiskon(int jumlahBeli, double persenDiskon) {
        return hitungTotalHarga(jumlahBeli) * (persenDiskon / 100);
    }

    public double hitungHargaSetelahDiskon(int jumlahBeli) {
        return hitungTotalHarga(jumlahBeli) - hitungDiskon(jumlahBeli);
    }
}