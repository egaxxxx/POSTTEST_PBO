import java.text.NumberFormat;
import java.util.Locale;

public class Produk {

    String idProduk;
    String namaProduk;
    int stok;
    int harga;

    public Produk(String idProduk, String namaProduk, int stok, int harga) {
        this.idProduk = idProduk;
        this.namaProduk = namaProduk;
        this.stok = stok;
        this.harga = harga;
    }

    public void tampilkanData() {

        NumberFormat rupiah = NumberFormat.getInstance(new Locale("id", "ID"));

        System.out.println("ID Produk   : " + idProduk);
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Stok        : " + stok);
        System.out.println("Harga       : Rp " + rupiah.format(harga));
    }
}