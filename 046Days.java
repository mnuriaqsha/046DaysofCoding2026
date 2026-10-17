import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner hai = new Scanner(System.in);

        System.out.println("===Daftar Menu===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Bakso");
        System.out.println("4. Sate");
        System.out.println("5. Es Teh");

        System.out.println("\nMasukkan pilihan: ");
        int p = hai.nextInt();

        switch (p) {
            case 1:
                System.out.println("Nama menu: Nasi goreng \nHarga: Rp15.000");
                break;

            case 2:
                System.out.println("Nama menu: Mie Ayam \nHarga: Rp18.000");
                break;

            case 3:
                System.out.println("Nama menu: Bakso \nHarga: Rp12.000");
                break;

            case 4:
                System.out.println("Nama menu: Sate \nHarga: Rp16.000");
                break;

            case 5:
                System.out.println("Nama menu: Ayam Geprek \nHarga: Rp10.000");
                break;

            default:
                System.out.println("Menu tidak tersedia");
        }

        hai.close();
    }
}
