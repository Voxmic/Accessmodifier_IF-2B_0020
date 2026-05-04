package Week2.base;

public class Elektronik extends Produk {

    private int masaGaransi;
    private String merek;
    private static final double PPN = 0.11; 

    public Elektronik(String nama, String merek, double harga, int stok, int masaGaransi) {
        super(nama, harga, stok);
        this.masaGaransi = masaGaransi;
        this.merek = merek;
    }

    public void setGaransi(int masaGaransi){
        this.masaGaransi = masaGaransi;
    }

    public int getGaransi() {
        return masaGaransi;
    }

    //overriding
    @Override
    public void tampilkanInfo() {
    super.tampilkanInfo();
    System.out.println("Masa Garansi: " + masaGaransi);
    }

    //overloading, pajak dengan persentase custom
    public double hitungPajak(int jumlahBeli) {
        return hitungTotalHarga(jumlahBeli) * PPN;
    }

    //versi 2
    public double hitungPajak(int jumlahBeli, double persenPajak) {
        return hitungTotalHarga(jumlahBeli) * (persenPajak / 100);
    }

    public double hitungHargaSetelahPajak(int jumlahBeli) {
        return hitungTotalHarga(jumlahBeli) + hitungPajak(jumlahBeli);
    }
}