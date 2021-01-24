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

    public static void pesanMakanan(int[][] daftarPesanan) {

        Scanner read = new Scanner(System.in);
        int kode;
        boolean ulangi;

        System.out.println("Daftar pesanan");
        for (int i = 0; i < daftarPesanan.length; i++) {
            System.out.println(i+1 +" ");
            for (int j = 0; j < daftarPesanan[i].length; j++) {
                System.out.println(daftarPesanan[i][j]);
                if (j < daftarPesanan[i].length - 1)
                    System.out.println(" ");
            }
            System.out.println("1. Ubah pesanan");
            System.out.println("2. Hapus pesanan");
            System.out.println("3. Urutkan Pesanan");
            System.out.println("4. Bayar pesanan");
            System.out.println("0. Kembali");

            do {
                ulangi=true;

                System.out.println("> ");
                kode = read.nextInt();

                switch (kode){
                    case 1:
                        //C. Ubah pesanan
                    break;
                    case 2:
                        //D. Hapus pesanan
                    break;
                    case 3:
                        //E. Urutkan pesanan
                        urut();
                    break;
                    case 4:
                        //F. Bayar pesanan
                        //bayar();
                    break;
                    case 0:
                        //0. Kembali
                        ulangi = false;
                        break;
                    default:
                        System.out.println("\n[EROR] Maaf, kode tidak dikenali!");
                        break;


                }
            }while (ulangi);
        }
    }

    public static void lihatPesanan() {

    }

    public static void main(String[] args) {
        // Inisialisasi scanner
        Scanner read = new Scanner(System.in);

        // Inisialisasi variabel untuk menyimpan pesanan
        String[][] daftarPesanan;
        int[] hargaPesanan;

        // Inisialisasi variabel untuk daftar menu makanan beserta harganya
        String[] daftarMakanan = {"Nasi Satu Porsi", "Nasi Setengah Porsi", "Bakwan Jagung", "Bakwan Sayur", "Tempe Goreng", "Tempe Tepung", "Acar Timun", "Berkedel", "Kentang Balado", "Kerupuk", "Mie Goreng", "Pare", "Sayur Asem", "Sayur Bayam", "Sayur Daun Singkong", "Sayur Kangkung", "Sayur Labu", "Sayur Oyong", "Sayur Sop", "Sayur Tahu", "Sayur Tauge", "Sayur Urap", "Tahu Bacem", "Tahu Goreng", "Tempe Orek Basah", "Tempe Orek Kering", "Terong Balado", "Tumis Jamur", "Tumis Kacang", "Pisang", "Kerang", "Kikil", "Peyek Udang", "Sayur Udang", "Telur Bulat", "Telur Ceplok", "Telur Dadar", "Telur Kecap", "Telur Puyuh", "Teri Balado", "Telur Asin", "Cumi Sambel", "Ikan Goreng", "Ikan Pari", "Ikan Sambel", "Ayam Kecap", "Ayam Opor", "Ayam Sambel", "Ikan Mas Kuning", "Ayam Goreng", "Rendang", "Sayur Nangka", "Kopi", "Kopi Susu", "Susu", "Es Teh Manis", "Extra Joss", "Nutri Sari", "Teh Manis", "Es Jeruk", "Jeruk Anget"};
        int[] hargaMakanan = {5000, 4000, 1000, 1000, 1000, 1000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 2000, 3000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 4000, 5000, 7000, 7000, 7000, 7000, 8000, 8000, 8000, 8000, 12000, 12000, 12000, 3000, 3000, 3000, 4000, 4000, 4000, 4000, 5000, 5000};

        // Inisialisasi variabel untuk memasukkan kode perintah
        int kode;
        boolean ulangi;
        boolean kembali;

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
                        // pesanMakanan(daftarPesanan, hargaPesanan);
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
