import java.text.NumberFormat;
import java.util.Locale;

public class Produk {

    private String idProduk;
    private String namaProduk;
    private int stok;
    private int harga;

    public Produk(String idProduk, String namaProduk, int stok, int harga) {
        this.idProduk = idProduk;
        this.namaProduk = namaProduk;
        this.stok = stok;
        this.harga = harga;
    }

    public String getIdProduk() {
        return idProduk;
    }

    public void setIdProduk(String idProduk) {
        this.idProduk = idProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
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