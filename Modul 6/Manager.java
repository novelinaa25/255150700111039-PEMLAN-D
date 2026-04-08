package Modul6;

public class Manager extends Pekerja {
    private String departemen;

    public Manager(String departemen, double gaji, int tahun, int bulan, int tanggal, int jumlahAnak,
                   String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(gaji, tahun, bulan, tanggal, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    @Override
    public double getTunjangan() {
        return super.getTunjangan() + (0.10 * getGaji());
    }

    @Override
    public double getPendapatan() {
        return getTunjangan() + getGaji() + getBonus() + (getJumlahAnak() * 20);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "departemen    : " + departemen;
    }
}
