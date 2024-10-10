package core;

public class Angsuran {
    private int angsuranKe;
    private double jumlahbayar;
    private double sisaPinjaman;

    public String getStrAngsuranKe() {
        return String.valueOf(this.angsuranKe);
    }

    public String getStrJumlahBayar() {
        return String.valueOf(this.jumlahbayar);
    }

    public String getStrSisaPinjaman() {
        return  String.valueOf(this.sisaPinjaman);
    }

    public Angsuran(int angsuranKe, double jumlahbayar, double sisaPinjaman) {
        this.angsuranKe = angsuranKe;
        this.jumlahbayar = jumlahbayar;
        this.sisaPinjaman = sisaPinjaman;
    }


}
