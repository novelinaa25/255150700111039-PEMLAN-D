package Modul5.TugasPraktikum;
import java.util.Scanner;

public class MainJaket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("         CV. LABKOMDAS JAKET          ");
        System.out.println("======================================");
        System.out.println("Daftar Harga Jaket:");
        System.out.println("- Jaket A : Rp100.000");
        System.out.println("- Jaket B : Rp125.000");
        System.out.println("- Jaket C : Rp175.000");
        System.out.println("======================================");
        System.out.println("Diskon pembelian > 100 buah:");
        System.out.println("- Jaket A : Rp95.000");
        System.out.println("- Jaket B : Rp120.000");
        System.out.println("- Jaket C : Rp160.000");
        System.out.println("======================================");

        System.out.print("Masukkan jumlah Jaket A : ");
        int jumlahA = input.nextInt();

        System.out.print("Masukkan jumlah Jaket B : ");
        int jumlahB = input.nextInt();

        System.out.print("Masukkan jumlah Jaket C : ");
        int jumlahC = input.nextInt();

        int totalA = Jaket.hitungHargaA(jumlahA);
        int totalB = Jaket.hitungHargaB(jumlahB);
        int totalC = Jaket.hitungHargaC(jumlahC);

        int totalBayar = totalA + totalB + totalC;

        System.out.println("\n======================================");
        System.out.println("         RINCIAN PEMBELIAN            ");
        System.out.println("======================================");
        System.out.println("Total harga Jaket A : Rp" + totalA);
        System.out.println("Total harga Jaket B : Rp" + totalB);
        System.out.println("Total harga Jaket C : Rp" + totalC);
        System.out.println("--------------------------------------");
        System.out.println("Total yang harus dibayar : Rp" + totalBayar);
        System.out.println("======================================");

        input.close();
    }
}