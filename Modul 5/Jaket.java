package Modul5.TugasPraktikum;
public class Jaket {

    public static final int HARGA_A = 100000;
    public static final int HARGA_B = 125000;
    public static final int HARGA_C = 175000;

    public static int hitungHargaA(int jumlah) {
        if (jumlah > 100) {
            return 95000 * jumlah;
        } else {
            return HARGA_A * jumlah;
        }
    }

    public static int hitungHargaB(int jumlah) {
        if (jumlah > 100) {
            return 120000 * jumlah;
        } else {
            return HARGA_B * jumlah;
        }
    }

    public static int hitungHargaC(int jumlah) {
        if (jumlah > 100) {
            return 160000 * jumlah;
        } else {
            return HARGA_C * jumlah;
        }
    }
}   