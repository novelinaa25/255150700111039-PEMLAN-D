package Modul7;

public class Main {
    public static void main(String[] args) {
        
        Kue[] kueArray = new Kue[20];

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                kueArray[i] = new KuePesanan("KuePesanan " + i, 10000, i + 1);
            } else {
                kueArray[i] = new KueJadi("KueJadi " + i, 2000, i + 1);

            }
        }

        double totalHarga = 0;
        double totalBerat = 0;
        double totalHargaJadi = 0;
        double totalJumlahJadi = 0;

        Kue kueTermahal = kueArray[0];

        System.out.println("===== DAFTAR KUE =====");
        for (Kue k : kueArray) {
            System.out.println(k);
            System.out.println();

            totalHarga += k.hitungHarga();

            if (k instanceof KuePesanan) {
                totalBerat += ((KuePesanan) k).getBerat();
            }

            if (k instanceof KueJadi) {
                totalHargaJadi += k.hitungHarga();
                totalJumlahJadi += ((KueJadi) k).getJumlah();
            }

            if (k.hitungHarga() > kueTermahal.hitungHarga()) {
                kueTermahal = k;
            }
        }

        System.out.println("===== TOTAL =====");
        System.out.println("Total Harga Semua Kue : " + totalHarga);
        System.out.println("Total Berat KuePesanan : " + totalBerat);
        System.out.println("Total Harga KueJadi : " + totalHargaJadi);
        System.out.println("Total Jumlah KueJadi : " + totalJumlahJadi);

        System.out.println("\n===== KUE TERMAHAL =====");
        System.out.println(kueTermahal);
    }
}
