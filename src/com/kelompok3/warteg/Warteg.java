package com.kelompok3.warteg;
import java.util.Scanner;

public class Warteg {
    // Inisialisasi scanner
    public static Scanner readTxt = new Scanner(System.in);
    public static Scanner readNum = new Scanner(System.in);

    // Inisialisasi variabel untuk menyimpan pesanan
    public static String[][] daftarPesanan = new String[1][4];
    public static int[] hargaPesanan = new int[1];

    // Inisialisasi variabel untuk daftar menu makanan beserta harganya
    public static String[] daftarMakanan = {"Nasi Satu Porsi", "Nasi Setengah Porsi", "Bakwan Jagung", "Bakwan Sayur", "Tempe Goreng", "Tempe Tepung", "Acar Timun", "Berkedel", "Kentang Balado", "Kerupuk", "Mie Goreng", "Pare", "Sayur Asem", "Sayur Bayam", "Sayur Daun Singkong", "Sayur Kangkung", "Sayur Labu", "Sayur Oyong", "Sayur Sop", "Sayur Tahu", "Sayur Tauge", "Sayur Urap", "Tahu Bacem", "Tahu Goreng", "Tempe Orek Basah", "Tempe Orek Kering", "Terong Balado", "Tumis Jamur", "Tumis Kacang", "Pisang", "Kerang", "Kikil", "Peyek Udang", "Sayur Udang", "Telur Bulat", "Telur Ceplok", "Telur Dadar", "Telur Kecap", "Telur Puyuh", "Teri Balado", "Telur Asin", "Cumi Sambel", "Ikan Goreng", "Ikan Pari", "Ikan Sambel", "Ayam Kecap", "Ayam Opor", "Ayam Sambel", "Ikan Mas Kuning", "Ayam Goreng", "Rendang", "Sayur Nangka", "Kopi", "Kopi Susu", "Susu", "Es Teh Manis", "Extra Joss", "Nutri Sari", "Teh Manis", "Es Jeruk", "Jeruk Anget"};
    public static int[] hargaMakanan = {5000, 4000, 1000, 1000, 1000, 1000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 3000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 5000, 7000, 7000, 7000, 7000, 8000, 8000, 8000, 8000, 12000, 12000, 12000, 3000, 3000, 3000, 4000, 4000, 4000, 4000, 5000, 5000};

    // Inisialisasi variabel untuk memasukkan kode perintah
    public static int kode;
    public static boolean ulangi;
    public static boolean kembali;

    public static void urut(){
        Scanner read = new Scanner(System.in);
        String[][] daftarPesananTerurutkan;
        String[] totalPesananTerurutkan;
        String[] arrayTemp;
        int temp;
        boolean ulangi, kembali;
        int kode;

        do {
            kembali = true;

            System.out.println("Urut");
            System.out.println("1. Urutkan menaik ");
            System.out.println("2. Urutkan menurun ");
            System.out.println("0. Kembali");

            do {
                ulangi = true;

                System.out.print("> ");
                kode = read.nextInt();

                switch (kode){
                    case 1: // mengurutkan menaik
                /*      daftarPesananTerurutkan = daftarPesanan;
                        totalPesananTerurutkan = totalPesanan;

                        //berdasarkan harga
                        System.out.println("Daftar pesanan diurutkan menaik berdasarkan harga");
                        for (int i = 0; i < totalPesananTerurutkan.length - 1; i++) {
                            for (int j = 0; j < totalPesananTerurutkan.length -i -1; j++) {
                                if (totalPesananTerurutkan[j] > totalPesananTerurutkan[j + 1])
                                    arrayTemp = totalPesananTerurutkan[j];
                                    totalPesananTerurutkan[j] = totalPesananTerurutkan[j+1];
                                    totalPesananTerurutkan[j+1] = arrayTemp;
                            }
                        }
                        for (int i = 0; i < daftarPesananTerurutkan.length; i++) {
                            System.out.println(i+1 +" ");
                            for (int j = 0; j < daftarPesananTerurutkan.length; j++) {
                                System.out.println(daftarPesananTerurutkan[i][j]);
                                if (j < daftarPesananTerurutkan.length - 1)
                                    System.out.println(",");
                            }
                            System.out.println("\t: Rp"+ totalPesanan[i] +"\n");
                        }
                */
                        ulangi = false;
                        break;
                    case 2: // mengurutkan menurun
                    /*    daftarPesananTerurutkan = daftarPesanan;
                        totalPesananTerurutkan = totalPesanan;

                        //berdasarkan harga
                        System.out.println("Daftar pesanan diurutkan menaik berdasarkan harga");
                        for (int i = 0; i < totalPesananTerurutkan.length - 1; i++) {
                            for (int j = 0; j < totalPesananTerurutkan.length -i -1; j++) {
                                if (totalPesananTerurutkan[j] < totalPesananTerurutkan[j + 1])
                                    arrayTemp = totalPesananTerurutkan[j];
                                totalPesananTerurutkan[j] = totalPesananTerurutkan[j+1];
                                totalPesananTerurutkan[j+1] = arrayTemp;
                            }
                        }
                        for (int i = 0; i < daftarPesananTerurutkan.length; i++) {
                            System.out.println(i+1 +" ");
                            for (int j = 0; j < daftarPesananTerurutkan.length; j++) {
                                System.out.println(daftarPesananTerurutkan[i][j]);
                                if (j < daftarPesananTerurutkan.length - 1)
                                    System.out.println(",");
                            }
                            System.out.println("\t: Rp"+ totalPesanan[i] +"\n");
                        }
                    */
                        ulangi = false;
                        break;
                    case 0: //pengulangan / kembali
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

    public static void bayar(boolean ulangi, int total, int kode ){
        Scanner read = new Scanner(System.in);

    /*    total = 0;

        System.out.println("Total pesanan\t: ");
        for (int harga : total) {
            total += harga;
        }
        System.out.println(total +"\n ");
        System.out.println("1. Bayar ");
        System.out.println("0. Kembali ");

        do {
            ulangi = true;
            System.out.println("> ");
            kode = read.nextInt();

            switch (kode){
                case 1:
                    //daftarPesanan[][] = new String;
                    break;
                case 0:
                    ulangi = false;
                    break;
            }
        } while (ulangi);
    */
    }

    public static void pesanMakanan() {
        // Inisialisasi variabel untuk menampung pesanan dan harga sementara
        String[] pesanan = new String[4];
        int harga = 0;

        // Pesan Nasi
        System.out.println("PESAN MAKANAN");
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
            String[] daftarLauk = new String[0];
            int[] hargaLauk = new int[0];
            int kodeLauk = 0;
            String cari;

            System.out.println("Lauk");
            do {
                ulangi = true;

                System.out.print("Cari lauk : ");
                cari = readTxt.nextLine();

                for (int i = 1; i < 51; i++) {
                    if (daftarMakanan[i].toLowerCase().contains(cari.toLowerCase())) {
                        String[] tempString = daftarLauk;
                        int[] tempInt = hargaLauk;

                        daftarLauk = new String[daftarLauk.length + 1];
                        hargaLauk = new int[hargaLauk.length + 1];

                        for (int j = 0; j < tempString.length; j++) {
                            daftarLauk[j] = tempString[j];
                            hargaLauk[j] = tempInt[j];
                        }

                        kodeLauk += 1;
                        System.out.println(kodeLauk + "(Rp " + hargaMakanan[i] + ") " + daftarMakanan[i]);
                    }
                }

                if (kodeLauk > 0) {
                    ulangi = false;
                } else {
                    System.out.println("\n[EROR] Nama lauk tidak ditemukan!");
                }
            } while (ulangi);

            // Input kode
            do {
                System.out.print("> ");
                kode = readNum.nextInt();

                if (kode > 0 && kode <= kodeLauk) {
                    pesanan[1] = daftarLauk[kode - 1];
                    harga += hargaLauk[kode - 1];

                    ulangi = false;
                }
            } while (ulangi);
        }

        // Cari minuman
        String[] daftarMinuman = new String[0];
        int[] hargaMinuman = new int[0];
        int kodeMinuman = 0;
        String cari;

        System.out.println("Minuman");
        do {
            ulangi = true;

            System.out.print("Cari minuman : ");
            cari = readTxt.nextLine();

            for (int i = 52; i < 60; i++) {
                if (daftarMakanan[i].toLowerCase().contains(cari.toLowerCase())) {
                    String[] tempString = daftarMinuman;
                    int[] tempInt = hargaMinuman;

                    daftarMinuman = new String[daftarMinuman.length + 1];
                    hargaMinuman = new int[hargaMinuman.length + 1];

                    for (int j = 0; j < tempString.length; j++) {
                        daftarMinuman[j] = tempString[j];
                        hargaMinuman[j] = tempInt[j];
                    }

                    kodeMinuman += 1;
                    System.out.println(kodeMinuman + "(Rp " + hargaMakanan[i] + ") " + daftarMakanan[i]);
                }
            }

            if (kodeMinuman > 0) {
                ulangi = false;
            } else {
                System.out.println("\n[EROR] Nama lauk tidak ditemukan!");
            }
        } while (ulangi);

        // Input kode
        do {
            System.out.print("> ");
            kode = readNum.nextInt();

            if (kode > 0 && kode <= kodeMinuman) {
                pesanan[1] = daftarMinuman[kode - 1];
                harga += hargaMinuman[kode - 1];

                ulangi = false;
            }
        } while (ulangi);

        // Menambahkan indeks baru ke daftarPesanan untuk menampung pesanan baru
        String[][] tempString = daftarPesanan;
        int[] tempInt = hargaPesanan;
        daftarPesanan = new String[daftarPesanan.length + 1][4];
        hargaPesanan = new int[hargaPesanan.length + 1];

        for (int i = 0; i < tempString.length; i++) {
            for (int j = 0; j < tempString[i].length; j++) {
                daftarPesanan[i][j] = tempString[i][j];
            }

            hargaPesanan[i] = tempInt[i];
        }

        for (int i = 0; i < pesanan.length; i++) {
            daftarPesanan[daftarPesanan.length - 1][i] = pesanan[i];
        }

        hargaPesanan[hargaPesanan.length - 1] = harga;
    }

    public static void lihatPesanan() {

    }

    public static void main(String[] args) {
        do {
            kembali = true;

            // Tampilkan Beranda
            System.out.println("WARTEG ONLINE");
            System.out.println("1. Pesan Makanan");
            System.out.println("2. Lihat Pesanan");
            System.out.println("0. Tutup Aplikasi");

            // Masukkan kode
            do {
                ulangi = true;

                System.out.print("> ");
                kode = readNum.nextInt();

                switch (kode) {
                    case 1:
                        pesanMakanan();
                        ulangi = false;
                        break;
                    case 2:
                        // lihatPesanan(daftarPesanan, hargaPesanan);
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
        } while (kembali);
    }
}
