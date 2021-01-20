package com.kelompok3.warteg;
import java.util.Scanner;

public class Warteg {
    public static void pesanMakanan() {

    }

    public static void lihatPesanan() {

    }

    public static void main(String[] args) {
        // Inisialisasi scanner
        Scanner read = new Scanner(System.in);

        // Inisialisasi variabel
        String[][] daftarMakanan;
        String[][] daftarPesanan;
        int[] daftarHarga;
        int[] totalPesanan;
        int kode;
        boolean ulangi;
        boolean kembali;

        // Inisialisasi daftar menu dan daftar harga makanan
        // daftarMakanan = {{}};
        // daftarHarga = {};

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
                kode = read.nextInt();

                switch (kode) {
                    case 1:
                        // pesan;
                        ulangi = false;
                        break;
                    case 2:
                        // keranjang;
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
