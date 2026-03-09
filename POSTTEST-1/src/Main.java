import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    static ArrayList<Produk> daftarProduk = new ArrayList<>();
    static ArrayList<LayananIsiUlang> daftarLayanan = new ArrayList<>();

    public static void main(String[] args) {

        int pilihan;

        do {

            System.out.println("\n==============================");
            System.out.println("      DEPOT BAROKAH");
            System.out.println("==============================");
            System.out.println("1. Kelola Produk");
            System.out.println("2. Kelola Layanan Isi Ulang");
            System.out.println("0. Exit");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    menuProduk();
                    break;

                case 2:
                    menuLayanan();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);
    }

    // ================= MENU PRODUK =================

    static void menuProduk() {

        int pilihan;

        do {

            System.out.println("\n=== MENU PRODUK ===");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Lihat Produk");
            System.out.println("3. Update Produk");
            System.out.println("4. Hapus Produk");
            System.out.println("0. Kembali");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    tambahProduk();
                    break;

                case 2:
                    lihatProduk();
                    break;

                case 3:
                    updateProduk();
                    break;

                case 4:
                    hapusProduk();
                    break;

            }

        } while (pilihan != 0);
    }

    static void tambahProduk() {

        System.out.print("ID Produk   : ");
        String id = input.nextLine();

        System.out.print("Nama Produk : ");
        String nama = input.nextLine();

        System.out.print("Stok        : ");
        int stok = input.nextInt();

        System.out.print("Harga       : ");
        int harga = input.nextInt();
        input.nextLine();

        Produk produkBaru = new Produk(id, nama, stok, harga);

        daftarProduk.add(produkBaru);

        System.out.println("Produk berhasil ditambahkan.");
    }

    static void lihatProduk() {

        if (daftarProduk.isEmpty()) {

            System.out.println("Data produk masih kosong.");

        } else {

            System.out.println("\n=== DATA PRODUK ===");

            for (int i = 0; i < daftarProduk.size(); i++) {

                System.out.println("Data ke-" + (i + 1));

                daftarProduk.get(i).tampilkanData();

                System.out.println("----------------------");
            }
        }
    }

    static void updateProduk() {

        lihatProduk();

        if (!daftarProduk.isEmpty()) {

            System.out.print("Pilih nomor data yang ingin diupdate: ");

            int index = input.nextInt();
            input.nextLine();

            if (index >= 1 && index <= daftarProduk.size()) {

                Produk produk = daftarProduk.get(index - 1);

                System.out.print("Nama Produk baru : ");
                produk.namaProduk = input.nextLine();

                System.out.print("Stok baru        : ");
                produk.stok = input.nextInt();

                System.out.print("Harga baru       : ");
                produk.harga = input.nextInt();
                input.nextLine();

                System.out.println("Data produk berhasil diupdate.");

            } else {

                System.out.println("Nomor data tidak valid.");
            }
        }
    }

    static void hapusProduk() {

        lihatProduk();

        if (!daftarProduk.isEmpty()) {

            System.out.print("Pilih nomor data yang ingin dihapus: ");

            int index = input.nextInt();
            input.nextLine();

            if (index >= 1 && index <= daftarProduk.size()) {

                daftarProduk.remove(index - 1);

                System.out.println("Data produk berhasil dihapus.");

            } else {

                System.out.println("Nomor tidak valid.");
            }
        }
    }

    // ================= MENU LAYANAN =================

    static void menuLayanan() {

        int pilihan;

        do {

            System.out.println("\n=== MENU LAYANAN ===");
            System.out.println("1. Tambah Layanan");
            System.out.println("2. Lihat Layanan");
            System.out.println("3. Update Layanan");
            System.out.println("4. Hapus Layanan");
            System.out.println("0. Kembali");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    tambahLayanan();
                    break;

                case 2:
                    lihatLayanan();
                    break;

                case 3:
                    updateLayanan();
                    break;

                case 4:
                    hapusLayanan();
                    break;
            }

        } while (pilihan != 0);
    }

    static void tambahLayanan() {

        System.out.print("ID Layanan      : ");
        String id = input.nextLine();

        System.out.print("Nama Layanan    : ");
        String nama = input.nextLine();

        System.out.print("Harga per Galon : ");
        int harga = input.nextInt();
        input.nextLine();

        LayananIsiUlang layananBaru = new LayananIsiUlang(id, nama, harga);

        daftarLayanan.add(layananBaru);

        System.out.println("Layanan berhasil ditambahkan.");
    }

    static void lihatLayanan() {

        if (daftarLayanan.isEmpty()) {

            System.out.println("Data layanan masih kosong.");

        } else {

            System.out.println("\n=== DATA LAYANAN ===");

            for (int i = 0; i < daftarLayanan.size(); i++) {

                System.out.println("Data ke-" + (i + 1));

                daftarLayanan.get(i).tampilkanData();

                System.out.println("----------------------");
            }
        }
    }

    static void updateLayanan() {

        lihatLayanan();

        if (!daftarLayanan.isEmpty()) {

            System.out.print("Pilih nomor data yang ingin diupdate: ");

            int index = input.nextInt();
            input.nextLine();

            if (index >= 1 && index <= daftarLayanan.size()) {

                LayananIsiUlang layanan = daftarLayanan.get(index - 1);

                System.out.print("Nama Layanan baru : ");
                layanan.namaLayanan = input.nextLine();

                System.out.print("Harga baru : ");
                layanan.hargaPerGalon = input.nextInt();
                input.nextLine();

                System.out.println("Data layanan berhasil diupdate.");

            } else {

                System.out.println("Nomor data tidak valid.");
            }
        }
    }

    static void hapusLayanan() {

        lihatLayanan();

        if (!daftarLayanan.isEmpty()) {

            System.out.print("Pilih nomor data yang ingin dihapus: ");

            int index = input.nextInt();
            input.nextLine();

            if (index >= 1 && index <= daftarLayanan.size()) {

                daftarLayanan.remove(index - 1);

                System.out.println("Data layanan berhasil dihapus.");

            } else {

                System.out.println("Nomor data tidak valid.");
            }
        }
    }
}