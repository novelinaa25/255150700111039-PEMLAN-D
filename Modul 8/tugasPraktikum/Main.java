package Modul8.tugasPraktikum;

public class Main {
    public static void main(String[] args) {

        // data invoice
        Invoice i1 = new Invoice("Beras", 2, 50000);
        Invoice i2 = new Invoice("Minyak", 1, 20000);

        Invoice[] daftarBelanja = {i1, i2};

        // data karyawan
        Employee emp = new Employee(123, "novelina", 1000000, daftarBelanja);

        // tampilkan
        emp.display();
    }
}
