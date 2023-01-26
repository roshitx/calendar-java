import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class operasiBilangan {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }

    private static void mainMenu() {

        // Pilihan menu
        System.out.println("=================================");
        System.out.println("Hitung luas segitiga & Trapesium");
        System.out.println("=================================");
        System.out.println("1. Segitiga");
        System.out.println("2. Trapesium");
        System.out.println("3. Keluar");

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(isr);

        try {
            System.out.print("Masukan Pilihan Menu : ");
            String input = bufferedReader.readLine();

            if (input.isEmpty()) {
                System.out.println("\nAnda tidak memasukkan inputan, silahkan coba lagi.\n");
                mainMenu();
            } else {
                int numberOfString = Integer.parseInt(input);

                if (numberOfString == 1) {
                    segitiga();
                } else if (numberOfString == 2) {
                     trapesium();
                } else if (numberOfString == 3) {
                    System.out.println("\nTerimakasih telah menggunakan program ini.\n");
                } else {
                    System.out.println("\nTidak ada pilihan, silahkan coba lagi.\n");
                    mainMenu();
                }
            }

        } catch (NumberFormatException | IOException e) {
            System.out.println("\nTidak ada pilihan, silahkan coba lagi.\n");
            mainMenu();
        }
    }

    private static void segitiga() {

        double a, t;
        char coba;

        do {
            System.out.print("\nMasukan alas segitiga : ");
            a = scanner.nextDouble();
            System.out.print("Masukan tinggi segitiga : ");
            t = scanner.nextDouble();

            double luas = (a*t)*0.5;

            System.out.println("Luas segitiga adalah: " + luas);

            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');

        System.out.print("\n");
        mainMenu();

    }

    private static void trapesium() {

        double s1, s2, t;
        char coba;

        do {
            System.out.print("\nMasukan sisi sejajar 1 : ");
            s1 = scanner.nextDouble();
            System.out.print("Masukan sisi sejajar 2 : ");
            s2 = scanner.nextDouble();
            System.out.print("Masukan tinggi trapesium : ");
            t = scanner.nextDouble();

            double luas = 0.5*(s1+s2)*t;

            System.out.println("Luas trapesium adalah: " + luas);

            System.out.print("\nIngin mencoba lagi? (y/t) : ");
            coba = scanner.next().charAt(0);
            System.out.print("\n");
        } while (coba == 'Y' || coba == 'y');

        System.out.print("\n");
        mainMenu();

    }

}