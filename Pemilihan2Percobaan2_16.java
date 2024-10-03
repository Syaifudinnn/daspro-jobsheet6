import java.util.Scanner;

public class Pemilihan2Percobaan2_16 {
    
    public static void main(String[] args) {
        
        // deklarasi scanner
        Scanner input = new Scanner(System.in);

        // deklarasi nilai tetap
        String member;
        String pembayaran;
        double harga = 0;
        double diskon, total_harga, total_bayar;

        // judul
        System.out.println("========================================");
        System.out.println("=============== KAFE JTI ===============");
        System.out.println("========================================");

        // daftar menu
        System.out.println("Daftar menu : ");
        System.out.println("1. Kopi");
        System.out.println("2. Teh");
        System.out.println("3. Roti");

        System.out.println("========================================");

        // input pesanan
        System.out.print("Masukkan angka menu yg akan dipesan\t : ");
        int pilihan_menu = input.nextInt();
        input.nextLine();

        // input jumlah pesanan
        System.out.print("Masukkan jumlah menu yg dipesan\t\t : ");
        int jumlah = input.nextInt();
        input.nextLine();

        // verifikasi member
        System.out.print("Apakah memiliki member (y/n)\t\t : ");
        member = input.nextLine();

        // input jenis pembayaran
        System.out.print("Metode pembayaran (QRIS/Cash)\t\t : ");
        pembayaran = input.nextLine();

        System.out.println("========================================");

        // deklarasi harga menu
        switch (pilihan_menu) {
            case 1:
                harga = 12000;
                break;
            case 2:
                harga = 7000;
                break;
            case 3:
                harga = 20000;
                break;
            default:
                System.out.println("menu yang dipilih tidak valid");
                return;
        }

        // hitung total harga
        total_harga = harga * jumlah;

        // logic jika member
        if (member.equals("y")) {
            diskon = 0.10; // diskon 10%
            System.out.println("Besar diskon 10%");

            // hitung total bayar setelah diskon
            total_bayar = total_harga - (total_harga * diskon);
        } 
        else if (member.equals("n")) { 
            // logic jika bukan member
            total_bayar = total_harga;
        } 
        else {
            System.out.println("Input member tidak valid");
            return;
        }

        // potongan qris
        if (pembayaran.equals("QRIS")) { 
            total_bayar -= 1000;
        }

        // Output total harga
        System.out.println("Harga normal : " + total_harga);
        System.out.println("Total bayar : " + total_bayar);

    }

}
