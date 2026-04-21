package Modul8.analisis.analisis1;

// Interface Colorable
interface Colorable {
    void howToColor();
}

// Interface Comparable (versi sederhana)
interface Comparable {
    void compareTo(Object obj);
}

// Class Rectangle
class Rectangle implements Colorable, Comparable {
    private String warna;
    private int kategori;

    // Constructor kosong
    public Rectangle() {
    }

    // Constructor dengan parameter
    public Rectangle(String warna) {
        this.warna = warna;
    }

    // Implementasi method dari Colorable
    public void howToColor() {
        if (this.warna == null) {
            System.out.println("Tidak ada warna, bangun kotak masih polos");
        } else {
            System.out.println("Bangun kotak sudah diwarnai dengan warna " + this.warna);
        }
    }

    // Implementasi method dari Comparable
    public void compareTo(Object obj) {
        this.kategori = (int) obj;

        if (this.kategori == 0) {
            System.out.println("Ukuran cat untuk kategori " + this.kategori + " yaitu 2.5L");
        } else {
            System.out.println("Ukuran cat untuk kategori " + this.kategori + " yaitu 6.5L");
        }
    }
}

// Class Main
public class Main {
    public static void main(String[] args) {
        Rectangle kotak1 = new Rectangle("merah");
        Rectangle kotak2 = new Rectangle();
        Rectangle kotak3 = new Rectangle();

        kotak1.howToColor();
        kotak2.howToColor();
        kotak3.compareTo(4);
    }
}