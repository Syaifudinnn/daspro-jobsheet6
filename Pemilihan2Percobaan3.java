import java.util.Scanner;

public class Pemilihan2Percobaan3 {
    
    public static void main(String[] args) {
        
        //deklarasi scanner
        Scanner input = new Scanner(System.in);

        //deklarasi variable
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        //inputan
        System.out.print("Masukkan kategori\t : ");
        kategori = input.nextLine();

        System.out.print("Masukkan penghasilan\t : ");
        penghasilan = input.nextInt();

        //logic
        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;
            }
            else if (penghasilan <= 3000000) {
                pajak = 0.15;
            }
            else {
                pajak = 0.2;
            }

            //hitung gaji bersih
            gajiBersih = (int) (penghasilan - (penghasilan * pajak));

            //output
            System.out.println("Penghasilan bersih\t : " + gajiBersih);
        }

        else if (kategori.equalsIgnoreCase("pebisnis")) {
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            }
            else if (penghasilan <= 3500000) {
                pajak = 0.2;
            }
            else {
                pajak = 0.25;
            }

            //hitung gaji bersih
            gajiBersih = (int) (penghasilan - (penghasilan * pajak));

            //output
            System.out.println("Penghasilan bersih\t : " + gajiBersih);
        }

        else {
            System.out.println("Kategori anda salah");
        }

    }

}