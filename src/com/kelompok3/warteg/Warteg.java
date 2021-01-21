package com.kelompok3.warteg;
import java.util.Scanner;

public class Warteg {
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
