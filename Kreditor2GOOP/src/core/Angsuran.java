package core;
// Class untuk menyimpan data angsuran
public class Angsuran
{
    // Properti class (attributes)
    // Ingat! attribute sebaiknya private
    private int angsuranKe;
    private double jumlahBayar;
    private double sisaPinjaman;

    // Constructor
    public Angsuran(int angsuranKe, double jumlahBayar, double sisaPinjaman)
    {
        // Pindahkan nilai parameter ke atribut
        this.angsuranKe = angsuranKe;
        this.jumlahBayar = jumlahBayar;
        this.sisaPinjaman = sisaPinjaman;
    }

    public String getStrAngsuranKe()
    {
        return String.valueOf(this.angsuranKe);
    }

    public String getStrJumlahBayar()
    {
        return String.valueOf(this.jumlahBayar);
    }

    public String getStrSisaPinjaman()
    {
        return String.valueOf(this.sisaPinjaman);
    }
}
