import java.text.NumberFormat;
import java.util.Locale;

public class LayananIsiUlang {

    String idLayanan;
    String namaLayanan;
    int hargaPerGalon;

    public LayananIsiUlang(String idLayanan, String namaLayanan, int hargaPerGalon) {
        this.idLayanan = idLayanan;
        this.namaLayanan = namaLayanan;
        this.hargaPerGalon = hargaPerGalon;
    }

    public void tampilkanData() {

        NumberFormat rupiah = NumberFormat.getInstance(new Locale("id", "ID"));

        System.out.println("ID Layanan      : " + idLayanan);
        System.out.println("Nama Layanan    : " + namaLayanan);
        System.out.println("Harga per Galon : Rp " + rupiah.format(hargaPerGalon));
    }
}