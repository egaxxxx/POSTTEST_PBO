import java.text.NumberFormat;
import java.util.Locale;

public class LayananIsiUlang {

    private String idLayanan;
    private String namaLayanan;
    private int hargaPerGalon;

    public LayananIsiUlang(String idLayanan, String namaLayanan, int hargaPerGalon) {
        this.idLayanan = idLayanan;
        this.namaLayanan = namaLayanan;
        this.hargaPerGalon = hargaPerGalon;
    }

    public String getIdLayanan() {
        return idLayanan;
    }

    public void setIdLayanan(String idLayanan) {
        this.idLayanan = idLayanan;
    }

    public String getNamaLayanan() {
        return namaLayanan;
    }

    public void setNamaLayanan(String namaLayanan) {
        this.namaLayanan = namaLayanan;
    }

    public int getHargaPerGalon() {
        return hargaPerGalon;
    }

    public void setHargaPerGalon(int hargaPerGalon) {
        this.hargaPerGalon = hargaPerGalon;
    }

    public void tampilkanData() {

        NumberFormat rupiah = NumberFormat.getInstance(new Locale("id", "ID"));

        System.out.println("ID Layanan      : " + idLayanan);
        System.out.println("Nama Layanan    : " + namaLayanan);
        System.out.println("Harga per Galon : Rp " + rupiah.format(hargaPerGalon));
    }
}