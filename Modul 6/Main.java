package Modul6;

public class Main {
    public static void main(String[] args) {

        // 1. Manusia
        System.out.println("===== MANUSIA =====");
        Manusia m1 = new Manusia("A", "111", true, true);
        Manusia m2 = new Manusia("B", "222", false, true);
        Manusia m3 = new Manusia("C", "333", true, false);

        System.out.println(m1);
        System.out.println();
        System.out.println(m2);
        System.out.println();
        System.out.println(m3);

        // 2. MahasiswaFILKOM
        System.out.println("\n===== MAHASISWA FILKOM =====");
        MahasiswaFILKOM mf1 = new MahasiswaFILKOM("225150400111001", 2.8, "D", "444", true, false);
        MahasiswaFILKOM mf2 = new MahasiswaFILKOM("225150400111002", 3.2, "E", "555", false, false);
        MahasiswaFILKOM mf3 = new MahasiswaFILKOM("225150400111003", 3.8, "F", "666", true, false);

        System.out.println(mf1);
        System.out.println();
        System.out.println(mf2);
        System.out.println();
        System.out.println(mf3);

        // 3. Pekerja
        System.out.println("\n===== PEKERJA =====");
        Pekerja p1 = new Pekerja(1000, 2023, 3, 2, 2, "G", "777", true, true);
        Pekerja p2 = new Pekerja(1000, 2016, 3, 2, 0, "H", "888", false, true);
        Pekerja p3 = new Pekerja(1000, 2005, 3, 2, 10, "I", "999", true, true);

        System.out.println(p1);
        System.out.println();
        System.out.println(p2);
        System.out.println();
        System.out.println(p3);

        // 4. Manager
        System.out.println("\n===== MANAGER =====");
        Manager mg = new Manager("HRD", 7500, 2010, 1, 1, 2, "J", "1010", true, true);

        System.out.println(mg);
    }
}
