package com.kelompok3.warteg;
import java.util.Scanner;

public class Warteg {
    // Inisialisasi scanner
    public static Scanner readTxt = new Scanner(System.in);
    public static Scanner readNum = new Scanner(System.in);

    // Inisialisasi variabel untuk menyimpan pesanan
    public static String[][] daftarPesanan = new String[0][0];
    public static int[] hargaPesanan = new int[0];

    // Inisialisasi variabel untuk daftar menu makanan beserta harganya
    public static String[] daftarMakanan = {"Nasi Satu Porsi", "Nasi Setengah Porsi", "Bakwan Jagung", "Bakwan Sayur", "Tempe Goreng", "Tempe Tepung", "Acar Timun", "Berkedel", "Kentang Balado", "Kerupuk", "Mie Goreng", "Pare", "Sayur Asem", "Sayur Bayam", "Sayur Daun Singkong", "Sayur Kangkung", "Sayur Labu", "Sayur Oyong", "Sayur Sop", "Sayur Tahu", "Sayur Tauge", "Sayur Urap", "Tahu Bacem", "Tahu Goreng", "Tempe Orek Basah", "Tempe Orek Kering", "Terong Balado", "Tumis Jamur", "Tumis Kacang", "Pisang", "Kerang", "Kikil", "Peyek Udang", "Sayur Udang", "Telur Bulat", "Telur Ceplok", "Telur Dadar", "Telur Kecap", "Telur Puyuh", "Teri Balado", "Telur Asin", "Cumi Sambel", "Ikan Goreng", "Ikan Pari", "Ikan Sambel", "Ayam Kecap", "Ayam Opor", "Ayam Sambel", "Ikan Mas Kuning", "Ayam Goreng", "Rendang", "Sayur Nangka", "Kopi", "Kopi Susu", "Susu", "Es Teh Manis", "Extra Joss", "Nutri Sari", "Teh Manis", "Es Jeruk", "Jeruk Anget"};
    public static int[] hargaMakanan = {5000, 4000, 1000, 1000, 1000, 1000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 3000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 5000, 7000, 7000, 7000, 7000, 8000, 8000, 8000, 8000, 12000, 12000, 12000, 3000, 3000, 3000, 4000, 4000, 4000, 4000, 5000, 5000};

    // Inisialisasi variabel untuk memasukkan kode perintah
    public static int kode;
    public static boolean ulangi;
    public static boolean kembali;

    // Pesan Makanan
    // Jika ubahNomor 0, maka pesan dan menyimpan pesanan baru
    // Jika ubahNomor selain 0, maka pesan dan merubah sesuai nomor pesanan
    public static void pesanMakanan(int ubahNomor) {
        // Inisialisasi variabel untuk menampung pesanan dan harga sementara
        String[] pesanan = new String[5];
        int harga = 0;

        // Pesan Nasi
        System.out.println("\nPESAN MAKANAN");
        System.out.println("Nasi");
        System.out.println("1. Satu porsi");
        System.out.println("2. Setengah porsi");

        // Input kode
        do {
            ulangi = true;

            System.out.print("> ");
            kode = readNum.nextInt();

            switch (kode) {
                case 1:
                    pesanan[0] = daftarMakanan[0];
                    harga += hargaMakanan[0];

                    ulangi = false;
                    break;
                case 2:
                    pesanan[0] = daftarMakanan[1];
                    harga += hargaMakanan[1];

                    ulangi = false;
                    break;
                default:
                    System.out.println("\n[EROR] Maaf, kode tidak dikenali!");
            }
        } while (ulangi);

        // Cari 3 lauk
        for (int n = 1; n <= 3; n++) {
            // Perulangan untuk kembali cari ulang
            do {
                kembali = true;

                // Inisialisasi variabel untuk menampung hasil carian
                String[] daftarLauk = new String[0];
                int[] hargaLauk = new int[0];
                int kodeLauk = 0;
                String cari;

                System.out.println("\nLauk " + n);
                // Perulangan untuk mengulangi cari lauk jika nama lauk tidak ditemukan
                do {
                    ulangi = true;

                    System.out.print("Cari lauk : ");
                    cari = readTxt.nextLine();

                    // Pencarian lauk menggunakan sequential search
                    for (int i = 2; i <= 51; i++) {
                        if (daftarMakanan[i].toLowerCase().contains(cari.toLowerCase())) {
                            // Menyimpan hasil carian
                            // Inisialisasi array sementara untuk menampung daftarLauk dan hargaLauk yang lama
                            String[] tempString = daftarLauk;
                            int[] tempInt = hargaLauk;

                            // Inisialisasi daftarLauk dan hargaLauk dengan indeks masing-masing ditambah 1
                            daftarLauk = new String[daftarLauk.length + 1];
                            hargaLauk = new int[hargaLauk.length + 1];

                            // Menyimpan kembali array sementara ke daftarLauk dan hargaLauk yang baru
                            for (int j = 0; j < tempString.length; j++) {
                                daftarLauk[j] = tempString[j];
                                hargaLauk[j] = tempInt[j];
                            }

                            // Menyimpan hasil carian ke indeks terakhir daftarLauk dan hargaLauk yang baru
                            daftarLauk[daftarLauk.length - 1] = daftarMakanan[i];
                            hargaLauk[hargaLauk.length - 1] = hargaMakanan[i];

                            // Kode lauk ditambahkan 1
                            kodeLauk += 1;

                            // Tampilkan hasi carian
                            System.out.println(kodeLauk + ". (Rp " + hargaMakanan[i] + ") " + daftarMakanan[i]);
                        }
                    }

                    // Mengecek lauk ditemukan atau tidak
                    if (kodeLauk > 0) {
                        ulangi = false;
                    } else {
                        System.out.println("\n[EROR] Nama lauk tidak ditemukan!");
                    }
                } while (ulangi);

                System.out.println("0. Cari Ulang");

                // Input kode
                do {
                    ulangi = true;

                    System.out.print("> ");
                    kode = readNum.nextInt();

                    if (kode > 0 && kode <= kodeLauk) {
                        pesanan[n] = daftarLauk[kode - 1];
                        harga += hargaLauk[kode - 1];

                        ulangi = false;
                        kembali = false;
                    } else if (kode == 0) {
                        ulangi = false;
                    } else {
                        System.out.println("\n[EROR] Kode tidak dikenali!");
                    }
                } while (ulangi);
            } while (kembali);
        }

        // Cari minuman
        do {
            kembali = true;

            String[] daftarMinuman = new String[0];
            int[] hargaMinuman = new int[0];
            int kodeMinuman = 0;
            String cari;

            System.out.println("\nMinuman");
            do {
                ulangi = true;

                System.out.print("Cari minuman : ");
                cari = readTxt.nextLine();

                for (int i = 52; i <= 60; i++) {
                    if (daftarMakanan[i].toLowerCase().contains(cari.toLowerCase())) {
                        String[] tempString = daftarMinuman;
                        int[] tempInt = hargaMinuman;

                        daftarMinuman = new String[daftarMinuman.length + 1];
                        hargaMinuman = new int[hargaMinuman.length + 1];

                        for (int j = 0; j < tempString.length; j++) {
                            daftarMinuman[j] = tempString[j];
                            hargaMinuman[j] = tempInt[j];
                        }

                        daftarMinuman[daftarMinuman.length - 1] = daftarMakanan[i];
                        hargaMinuman[hargaMinuman.length - 1] = hargaMakanan[i];

                        kodeMinuman += 1;
                        System.out.println(kodeMinuman + ". (Rp " + hargaMakanan[i] + ") " + daftarMakanan[i]);
                    }
                }

                if (kodeMinuman > 0) {
                    ulangi = false;
                } else {
                    System.out.println("\n[EROR] Nama minuman tidak ditemukan!");
                }
            } while (ulangi);

            System.out.println("0. Cari Ulang");

            // Input kode
            do {
                ulangi = true;

                System.out.print("> ");
                kode = readNum.nextInt();

                if (kode > 0 && kode <= kodeMinuman) {
                    pesanan[4] = daftarMinuman[kode - 1];
                    harga += hargaMinuman[kode - 1];

                    ulangi = false;
                    kembali = false;
                } else if (kode == 0) {
                    ulangi = false;
                } else {
                    System.out.println("\n[EROR] Kode tidak dikenali!");
                }
            } while (ulangi);
        } while (kembali);

        // Mengecek apakah pesan baru atau ubah pesanan
        if (ubahNomor == 0) {
            // Menyimpan pesanan baru
            String[][] tempString = daftarPesanan;
            int[] tempInt = hargaPesanan;
            daftarPesanan = new String[daftarPesanan.length + 1][5];
            hargaPesanan = new int[hargaPesanan.length + 1];

            for (int i = 0; i < tempString.length; i++) {
                System.arraycopy(tempString[i], 0, daftarPesanan[i], 0, tempString[i].length);

                hargaPesanan[i] = tempInt[i];
            }

            System.arraycopy(pesanan, 0, daftarPesanan[daftarPesanan.length - 1], 0, pesanan.length);

            hargaPesanan[hargaPesanan.length - 1] = harga;
        } else {
            // Mengubah pesanan
            System.arraycopy(pesanan, 0, daftarPesanan[ubahNomor - 1], 0, pesanan.length);

            hargaPesanan[ubahNomor - 1] = harga;
        }
    }

    // Lihat Pesanan
    public static void lihatPesanan() {
        do {
            kembali = true;

            // Tampilkan seluruh pesanan
            System.out.println("\nLIHAT PESANAN");
            for (int i = 0; i < daftarPesanan.length; i++) {
                System.out.print((i + 1) + ". " + "Rp " + hargaPesanan[i] + "\t: ");
                for (int j = 0; j < daftarPesanan[i].length; j++) {
                    System.out.print(daftarPesanan[i][j]);
                    if (j < daftarPesanan[i].length - 1) {
                        System.out.print(", ");
                    }
                }

                System.out.println();
            }

            System.out.println("\n1. Ubah Pesanan");
            System.out.println("2. Hapus Pesanan");
            System.out.println("3. Urut Pesanan");
            System.out.println("4. Bayar Pesanan");
            System.out.println("0. Kembali");

            do {
                ulangi = true;

                System.out.print("> ");
                kode = readNum.nextInt();

                switch (kode) {
                    case 1:
                        ubahPesanan();

                        ulangi = false;
                        kembali = true;
                        break;
                    case 2:
                        hapusPesanan();

                        ulangi = false;
                        kembali = true;
                        break;
                    case 3:
                        urutPesanan();

                        ulangi = false;
                        kembali = true;
                        break;
                    case 4:
                        bayarPesanan();

                        ulangi = false;
                        kembali = false;
                        break;
                    case 0:
                        ulangi = false;
                        kembali = false;
                        break;
                }
            } while (ulangi);
        } while (kembali);
    }

    // Ubah Pesanan
    public static void ubahPesanan() {
        System.out.println("\nUBAH PESANAN");

        do {
            ulangi = true;

            System.out.print("Pilih nomor pesanan (ketik 0 untuk kembali) : ");
            kode = readNum.nextInt();
            System.out.println(daftarPesanan.length);

            if (kode > 0 && kode <= daftarPesanan.length) {
                pesanMakanan(kode);

                ulangi = false;
            } else if (kode == 0) {
                ulangi = false;
            } else {
                System.out.println("\n[EROR] Nomor pesanan tidak ditemukan!");
            }
        } while (ulangi);
    }

    // Hapus Pesanan
    public static void hapusPesanan() {
        System.out.println("\nHAPUS PESANAN");

        do {
            ulangi = true;

            // Pilih nomor pesanan
            System.out.print("Pilih nomor pesanan (ketik 0 untuk kembali) : ");
            kode = readNum.nextInt();
            System.out.println(daftarPesanan.length);

            if (kode > 0 && kode <= daftarPesanan.length) {
                String[][] tempString = daftarPesanan;
                int[] tempInt = hargaPesanan;
                daftarPesanan = new String[daftarPesanan.length - 1][5];
                hargaPesanan = new int[hargaPesanan.length - 1];

                for (int i = 0; i < daftarPesanan.length; i++) {
                    if (i < kode) {
                        System.arraycopy(tempString[i], 0, daftarPesanan[i], 0, daftarPesanan[i].length);

                        hargaPesanan[i] = tempInt[i];
                    } else {
                        System.arraycopy(tempString[i + 1], 0, daftarPesanan[i], 0, daftarPesanan[i].length);

                        hargaPesanan[i] = tempInt[i + 1];
                    }
                }

                ulangi = false;
            } else if (kode == 0) {
                ulangi = false;
            } else {
                System.out.println("\n[EROR] Nomor pesanan tidak ditemukan!");
            }
        } while (ulangi);
    }

    // Urut Pesanan
    public static void urutPesanan(){
        String[][] daftarPesananTerurutkan;
        int[] hargaPesananTerurutkan;

        do {
            kembali = true;

            System.out.println("\nURUT PESANAN");
            System.out.println("1. Urutkan menaik ");
            System.out.println("2. Urutkan menurun ");
            System.out.println("0. Kembali");

            do {
                ulangi = true;

                System.out.print("> ");
                kode = readNum.nextInt();

                switch (kode){
                    case 1:
                        daftarPesananTerurutkan = daftarPesanan;
                        hargaPesananTerurutkan = hargaPesanan;

                        System.out.println("\nDAFTAR PESANAN MENAIK");
                        for (int i = 0; i < hargaPesananTerurutkan.length - 1; i++) {
                            for (int j = 0; j < hargaPesananTerurutkan.length - i - 1; j++) {
                                if (hargaPesananTerurutkan[j] > hargaPesananTerurutkan[j + 1]) {
                                    String[] tempString = daftarPesananTerurutkan[j];
                                    daftarPesananTerurutkan[j] = daftarPesananTerurutkan[j + 1];
                                    daftarPesananTerurutkan[j + 1] = tempString;

                                    int tempInt = hargaPesananTerurutkan[j];
                                    hargaPesananTerurutkan[j] = hargaPesananTerurutkan[j + 1];
                                    hargaPesananTerurutkan[j + 1] = tempInt;
                                }
                            }
                        }

                        for (int i = 0; i < daftarPesananTerurutkan.length; i++) {
                            System.out.print((i + 1) + ". " + "Rp " + hargaPesananTerurutkan[i] + "\t: ");
                            for (int j = 0; j < daftarPesananTerurutkan[i].length; j++) {
                                System.out.print(daftarPesananTerurutkan[i][j]);
                                if (j < daftarPesananTerurutkan[i].length - 1) {
                                    System.out.print(", ");
                                }
                            }

                            System.out.println();
                        }

                        ulangi = false;
                        break;
                    case 2:
                        daftarPesananTerurutkan = daftarPesanan;
                        hargaPesananTerurutkan = hargaPesanan;

                        System.out.println("\nDAFTAR PESANAN MENURUN");
                        for (int i = 0; i < hargaPesananTerurutkan.length - 1; i++) {
                            for (int j = 0; j < hargaPesananTerurutkan.length - i - 1; j++) {
                                if (hargaPesananTerurutkan[j] < hargaPesananTerurutkan[j + 1]) {
                                    String[] tempString = daftarPesananTerurutkan[j];
                                    daftarPesananTerurutkan[j] = daftarPesananTerurutkan[j + 1];
                                    daftarPesananTerurutkan[j + 1] = tempString;

                                    int tempInt = hargaPesananTerurutkan[j];
                                    hargaPesananTerurutkan[j] = hargaPesananTerurutkan[j + 1];
                                    hargaPesananTerurutkan[j + 1] = tempInt;
                                }
                            }
                        }


                        for (int i = 0; i < daftarPesananTerurutkan.length; i++) {
                            System.out.print((i + 1) + ". " + "Rp " + hargaPesananTerurutkan[i] + "\t: ");
                            for (int j = 0; j < daftarPesananTerurutkan[i].length; j++) {
                                System.out.print(daftarPesananTerurutkan[i][j]);
                                if (j < daftarPesananTerurutkan[i].length - 1) {
                                    System.out.print(", ");
                                }
                            }

                            System.out.println();
                        }

                        ulangi = false;
                        break;
                    case 0:
                        ulangi = false;
                        kembali = false;
                        break;
                    default:
                        System.out.println("\n[EROR] Maaf, kode tidak dikenali!");
                        break;
                }
            } while (ulangi);
        }while (kembali);

    }

    // Bayar Pesanan
    public static void bayarPesanan(){
        int totalPesanan = 0;

        System.out.println("\nBAYAR PESANAN");
        System.out.print("Total Pesanan\t: Rp ");
        for (int harga : hargaPesanan) {
            totalPesanan += harga;
        }
        System.out.println(totalPesanan);

        System.out.println("1. Bayar ");
        System.out.println("0. Kembali ");

        do {
            ulangi = true;

            System.out.println("> ");
            kode = readNum.nextInt();

            switch (kode){
                case 1:
                    daftarPesanan = new String[0][0];
                    hargaPesanan = new int[0];

                    ulangi = false;
                    break;
                case 0:
                    ulangi = false;
                    break;
            }
        } while (ulangi);
    }

    // Program Utama
    public static void main(String[] args) {
        // Perulangan untuk kembali ke beranda
        do {
            kembali = true;

            // Tampilkan Beranda
            System.out.println("\nWARTEG ONLINE");
            System.out.println("1. Pesan Makanan");
            System.out.println("2. Lihat Pesanan");
            System.out.println("0. Tutup Aplikasi");

            // Masukkan kode
            // Perulangan untuk mengulangi masukkan kode jika kode salah
            do {
                ulangi = true;

                System.out.print("> ");
                kode = readNum.nextInt();

                // Mengecek kode
                switch (kode) {
                    case 1:
                        pesanMakanan(0);

                        ulangi = false;
                        kembali = true;
                        break;
                    case 2:
                        lihatPesanan();

                        ulangi = false;
                        kembali = true;
                        break;
                    case 0:
                        ulangi = false;
                        kembali = false;
                        break;
                    default:
                        System.out.println("\n[EROR] Maaf, kode tidak dikenali!");
                        break;
                }
            } while (ulangi);
        } while (kembali);
    }
}