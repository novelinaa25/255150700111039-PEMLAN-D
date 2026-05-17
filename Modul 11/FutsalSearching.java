import java.util.*;

public class FutsalSearching {
    public static void main(String[] args) {
        // a. ArrayList terpisah untuk Tim A dan Tim B
        ArrayList<Integer> timA_tinggi = new ArrayList<>(
            Arrays.asList(168,170,165,168,172,170,169,165,171,166));
        ArrayList<Integer> timA_berat  = new ArrayList<>(
            Arrays.asList(50,60,56,55,60,70,66,56,72,56));
        ArrayList<Integer> timB_tinggi = new ArrayList<>(
            Arrays.asList(170,167,165,166,168,175,172,171,168,169));
        ArrayList<Integer> timB_berat  = new ArrayList<>(
            Arrays.asList(66,60,59,58,58,71,68,68,65,60));

        // b. Frekuensi tinggi badan di Tim B
        System.out.println("=== Tim B - Frekuensi Tinggi Badan ===");
        System.out.println("Jumlah pemain dengan tinggi 168 cm: "
            + Collections.frequency(timB_tinggi, 168));
        System.out.println("Jumlah pemain dengan tinggi 160 cm: "
            + Collections.frequency(timB_tinggi, 160));

        // c. Frekuensi berat badan di Tim A
        System.out.println("\n=== Tim A - Frekuensi Berat Badan ===");
        System.out.println("Jumlah pemain dengan berat 56 kg: "
            + Collections.frequency(timA_berat, 56));
        System.out.println("Jumlah pemain dengan berat 53 kg: "
            + Collections.frequency(timA_berat, 53));

        // d. Apakah ada nilai tinggi/berat yang sama antara Tim A dan Tim B?
        boolean disjointTinggi = Collections.disjoint(timA_tinggi, timB_tinggi);
        boolean disjointBerat  = Collections.disjoint(timA_berat,  timB_berat);
        System.out.println("\n=== Perbandingan Tim A dan Tim B ===");
        System.out.println("Tinggi badan: Tim A dan Tim B "
            + (disjointTinggi ? "TIDAK memiliki" : "MEMILIKI") + " nilai yang sama");
        System.out.println("Berat badan : Tim A dan Tim B "
            + (disjointBerat  ? "TIDAK memiliki" : "MEMILIKI") + " nilai yang sama");

        // Binary Search - cari tinggi 168 di Tim B (harus sorted dulu)
        Collections.sort(timB_tinggi);
        System.out.println("\n=== Binary Search: Tinggi 168 di Tim B ===");
        System.out.println("Tim B tinggi (sorted): " + timB_tinggi);
        int idx = Collections.binarySearch(timB_tinggi, 168);
        if (idx >= 0)
            System.out.println("168 cm ditemukan di index: " + idx);
        else
            System.out.println("168 cm tidak ditemukan");
    }
}