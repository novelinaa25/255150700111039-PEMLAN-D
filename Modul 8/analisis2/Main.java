package Modul8.analisis.analisis2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input manusia
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        Manusia novelina = new Manusia(nama, umur);

        System.out.println("\n=== OUTPUT MANUSIA ===");
        novelina.tampilkanNama();
        novelina.tampilkanUmur();

        // objek lain (Hewan)
        Hewan kucing = new Hewan();

        System.out.println("\n=== OUTPUT HEWAN ===");
        kucing.makan();
        kucing.berjalan();
        kucing.bersuara();

        input.close();
    }
}