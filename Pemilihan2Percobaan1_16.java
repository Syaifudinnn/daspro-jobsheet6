import java.util.Scanner;

public class Pemilihan2Percobaan1_16 {

    public static void main(String[] args) {
        
        //deklarasi scanner
        Scanner input = new Scanner(System.in);

        //inputan
        System.out.print("Masukkan tahun\t : ");
        int tahun = input.nextInt();

        //logic
        if (tahun % 4 == 0) {
            if (tahun % 100 != 0 && tahun % 400 == 0) {
                System.out.println(tahun + " termasuk tahun kabisat");
            }
            else {
                System.out.println(tahun + " bukan tahun kabisat");
            }
        }
        else {
            System.out.println(tahun + " bukan tahun kabisat");
        }

    }

}
