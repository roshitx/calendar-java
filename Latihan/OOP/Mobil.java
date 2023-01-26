
import java.util.Scanner;

class Mobil {


    // Properti mobil
    String nama, method;
    int speed;


    // Method dari kelas mobil
    void maju() {
        System.out.println( nama + " melaju kencang!.");
        System.out.println("Kecepatan nya " + speed + " Km/h");
    }

    void mundur() {
        System.out.println( nama + " berjalan mundur!");
        System.out.println("Kecepatan nya " + speed + " Km/h");
    }

    void belok() {
        System.out.println( nama + " berbelok arah!");
        System.out.println("Kecepatan nya " + speed + " Km/h");
    }


}

class MobilSport {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        // Instance mobil sport dari kelas mobil
        Mobil mobilSport = new Mobil();


        // Mengisi properti mobil sport
        System.out.print("Nama mobil sport : ");
        mobilSport.nama = keyboard.nextLine();

        System.out.print("Berapa kecepatan mobil : ");
        mobilSport.speed = keyboard.nextInt();




        // Menjalankan method
        Scanner gerak = new Scanner(System.in);

        System.out.println("Mobil bergerak kemana? ( maju / mundur / belok )");
        mobilSport.method = gerak.nextLine();
        switch (mobilSport.method) {
            case "maju"  -> mobilSport.maju();
            case "mundur" -> mobilSport.mundur();
            case "belok" -> mobilSport.belok();
            default -> System.out.print("Mobil anda meledak! \n Masukan method yang valid.");
        }
    }
}

