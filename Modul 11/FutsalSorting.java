import java.util.*;

class Player {
    int tinggi;
    int berat;
    String tim;

    public Player(int tinggi, int berat, String tim) {
        this.tinggi = tinggi;
        this.berat  = berat;
        this.tim    = tim;
    }

    public String toString() {
        return tim + " | Tinggi: " + tinggi + " cm, Berat: " + berat + " kg";
    }
}

class SortByTinggiAsc implements Comparator<Player> {
    public int compare(Player a, Player b) { return a.tinggi - b.tinggi; }
}
class SortByTinggiDesc implements Comparator<Player> {
    public int compare(Player a, Player b) { return b.tinggi - a.tinggi; }
}
class SortByBeratAsc implements Comparator<Player> {
    public int compare(Player a, Player b) { return a.berat - b.berat; }
}
class SortByBeratDesc implements Comparator<Player> {
    public int compare(Player a, Player b) { return b.berat - a.berat; }
}

public class FutsalSorting {
    public static void main(String[] args) {
        ArrayList<Player> timA = new ArrayList<>();
        timA.add(new Player(168, 50, "Tim A"));
        timA.add(new Player(170, 60, "Tim A"));
        timA.add(new Player(165, 56, "Tim A"));
        timA.add(new Player(168, 55, "Tim A"));
        timA.add(new Player(172, 60, "Tim A"));
        timA.add(new Player(170, 70, "Tim A"));
        timA.add(new Player(169, 66, "Tim A"));
        timA.add(new Player(165, 56, "Tim A"));
        timA.add(new Player(171, 72, "Tim A"));
        timA.add(new Player(166, 56, "Tim A"));

        ArrayList<Player> timB = new ArrayList<>();
        timB.add(new Player(170, 66, "Tim B"));
        timB.add(new Player(167, 60, "Tim B"));
        timB.add(new Player(165, 59, "Tim B"));
        timB.add(new Player(166, 58, "Tim B"));
        timB.add(new Player(168, 58, "Tim B"));
        timB.add(new Player(175, 71, "Tim B"));
        timB.add(new Player(172, 68, "Tim B"));
        timB.add(new Player(171, 68, "Tim B"));
        timB.add(new Player(168, 65, "Tim B"));
        timB.add(new Player(169, 60, "Tim B"));

        ArrayList<Player> semuaPemain = new ArrayList<>();
        semuaPemain.addAll(timA);
        semuaPemain.addAll(timB);

        // a. Sort Tinggi Badan Ascending
        Collections.sort(semuaPemain, new SortByTinggiAsc());
        System.out.println("=== Sort Tinggi Badan ASCENDING ===");
        for (Player p : semuaPemain) System.out.println(p);

        // Sort Tinggi Badan Descending
        Collections.sort(semuaPemain, new SortByTinggiDesc());
        System.out.println("\n=== Sort Tinggi Badan DESCENDING ===");
        for (Player p : semuaPemain) System.out.println(p);

        // b. Sort Berat Badan Ascending
        Collections.sort(semuaPemain, new SortByBeratAsc());
        System.out.println("\n=== Sort Berat Badan ASCENDING ===");
        for (Player p : semuaPemain) System.out.println(p);

        // Sort Berat Badan Descending
        Collections.sort(semuaPemain, new SortByBeratDesc());
        System.out.println("\n=== Sort Berat Badan DESCENDING ===");
        for (Player p : semuaPemain) System.out.println(p);

        // c. Max & Min per tim
        Player maxTinggiA = Collections.max(timA, new SortByTinggiAsc());
        Player minTinggiA = Collections.min(timA, new SortByTinggiAsc());
        Player maxBeratA  = Collections.max(timA, new SortByBeratAsc());
        Player minBeratA  = Collections.min(timA, new SortByBeratAsc());
        System.out.println("\n=== Tim A - Max & Min ===");
        System.out.println("Tinggi Max: " + maxTinggiA.tinggi + " cm");
        System.out.println("Tinggi Min: " + minTinggiA.tinggi + " cm");
        System.out.println("Berat Max : " + maxBeratA.berat  + " kg");
        System.out.println("Berat Min : " + minBeratA.berat  + " kg");

        Player maxTinggiB = Collections.max(timB, new SortByTinggiAsc());
        Player minTinggiB = Collections.min(timB, new SortByTinggiAsc());
        Player maxBeratB  = Collections.max(timB, new SortByBeratAsc());
        Player minBeratB  = Collections.min(timB, new SortByBeratAsc());
        System.out.println("\n=== Tim B - Max & Min ===");
        System.out.println("Tinggi Max: " + maxTinggiB.tinggi + " cm");
        System.out.println("Tinggi Min: " + minTinggiB.tinggi + " cm");
        System.out.println("Berat Max : " + maxBeratB.berat  + " kg");
        System.out.println("Berat Min : " + minBeratB.berat  + " kg");

        // d. Copy Tim B ke Tim C
        ArrayList<Player> timC = new ArrayList<>(timB.size());
        for (int i = 0; i < timB.size(); i++) timC.add(null);
        Collections.copy(timC, timB);
        System.out.println("\n=== Tim C (Copy dari Tim B) ===");
        for (Player p : timC)
            System.out.println("Tim C | Tinggi: " + p.tinggi + " cm, Berat: " + p.berat + " kg");
    }
}