package Modul8.tugasPraktikum;

public class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int reg, String name, int salary, Invoice[] invoices) {
        this.registrationNumber = reg;
        this.name = name;
        this.salaryPerMonth = salary;
        this.invoices = invoices;
    }

    @Override
    public int getPayableAmount() {
        int totalBelanja = 0;
        for (Invoice inv : invoices) {
            totalBelanja += inv.getPayableAmount();
        }
        return salaryPerMonth - totalBelanja;
    }

    public void display() {
        System.out.println("ID: " + registrationNumber);
        System.out.println("Nama: " + name);
        System.out.println("Gaji Awal: " + salaryPerMonth);

        System.out.println("\n=== Detail Belanja ===");
        for (Invoice inv : invoices) {
            inv.display();
        }

        System.out.println("Gaji Setelah Potongan: " + getPayableAmount());
    }
}