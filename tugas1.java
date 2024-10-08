public class tugas1 {
    
    public static void main(String[] args) {
        
        int bil1 = 20, bil2 = 54, bil3 = 15, billmax = 0;

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                billmax = bil1;
            }
            else {
                billmax = bil3;
            }
        }
        else {
            if (bil2 > bil3) {
                billmax = bil2;
            }
            else{
                billmax = bil3;
            }
        }

        System.out.println("billmax : " + billmax);

    }

}
