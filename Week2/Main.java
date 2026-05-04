package Week2;
import Week2.base.Makanan;
import Week2.base.Elektronik;

public class Main {
    public static void main(String[] args) {
        Elektronik laptop = new Elektronik("Laptop", "Lenovo", 10000, 5, 24);
        Elektronik smartphone = new Elektronik("Smartphone", "Samsung", 5000, 10, 12);
        //overriding -satu nama untuk semua
        System.out.println("Informasi Produk Elektronik:");
        laptop.tampilkanInfo();
        smartphone.tampilkanInfo();
        Makanan nasiGoreng = new Makanan("Nasi Goreng", 15000, 20, "23-11-2026", "Makanan Berat");
        Makanan indomie = new Makanan("Indomie", 3000, 50, "28-11-2026", "Makanan Ringan");
        System.out.println("Informasi Produk Makanan:");
        nasiGoreng.tampilkanInfo();
        indomie.tampilkanInfo();

        //overloading hitungPajak()
        System.out.println("RINCIAN HARGA SETELAH PAJAK:");

        //VERSI 1 - pajak otomatis 11%
        double pajakLaptop = laptop.hitungPajak(1);
        double totalLaptop = laptop.hitungHargaSetelahPajak(1);
        System.out.println("Laptop x1 (PPN 11%)");
        System.out.println("subtotal : Rp " + laptop.hitungTotalHarga(1));
        System.out.println("pajak : Rp " + pajakLaptop);
        System.out.println("total : Rp " + totalLaptop);

        //VERSI 2 - pajak dengan persentase custom 5%
        double pajakSmartphone = smartphone.hitungPajak(2, 5);
        System.out.println("Smartphone x2 (PPN 5%)");
        System.out.println("subtotal : Rp " + smartphone.hitungTotalHarga(2));
        System.out.println("pajak : Rp " + pajakSmartphone);
        System.out.println("total : Rp " + smartphone.hitungHargaSetelahPajak(2));

        //overloading hitungDiskon()
        System.out.println("RINCIAN HARGA SETELAH DISKON:");
        double diskonNasiGoreng = nasiGoreng.hitungDiskon(1, 10); // 10% diskon
        System.out.println("Nasi Goreng x1 (Diskon 10%)");
        System.out.println("subtotal : Rp " + nasiGoreng.hitungTotalHarga(1));
        System.out.println("diskon : Rp " + nasiGoreng.hitungDiskon(1, 10));
        System.out.println("total : Rp " + nasiGoreng.hitungHargaSetelahDiskon(1));

        //versi 2
        System.out.println("Indomie x10 (Diskon custom 15%)");
        System.out.println("subtotal : Rp " + indomie.hitungTotalHarga(10));
        System.out.println("diskon : Rp " + indomie.hitungDiskon(10, 15));
        System.out.println("total : Rp " + indomie.hitungHargaSetelahDiskon(10));

        //transaksi
        System.out.println("TRANSAKSI PEMBELIAN:");
        laptop.beli(1);
        smartphone.beli(2);
        nasiGoreng.beli(1);
        indomie.beli(10);     

    }
}