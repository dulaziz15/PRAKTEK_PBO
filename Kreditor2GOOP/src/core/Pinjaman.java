package core;

public class Pinjaman
{
    // Atribut
    private double hutang;
    private float bunga;
    private int jumlahCicilan;

    // Atribut daftar (list) angsuran yang nantinya akan
    // dihitung dari hutang, bunga, dan jumlahCicilan
    private Angsuran[] daftarAngsuran;

    public Pinjaman(double hutang, float bunga, int jumlahCicilan)
    {
        // Isikan nilai parameter ke atribut
        this.hutang = hutang;
        this.bunga = bunga;
        this.jumlahCicilan = jumlahCicilan;

        // Memberi nilai awalan (inisialisasi) pada array daftarAngsuran
        // Banyaknya daftar angsuran sebanding dengan jumlah cicilan
        this.daftarAngsuran = new Angsuran[(this.jumlahCicilan)];
    }

    // Method untuk menghitung daftarAngsuran
    public void hitung()
    {
        // Lewati dulu..
    }

    // Getter untuk mengakses nilai dari daftarAngsuran
    public Angsuran[] getDaftarAngsuran()
    {
        return this.daftarAngsuran;
    }
}
