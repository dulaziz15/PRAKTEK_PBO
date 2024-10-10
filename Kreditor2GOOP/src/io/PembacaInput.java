package io;

import core.Pinjaman;

public class PembacaInput
{
    // Atribut
    private String[] args;

    // Atribut yang dihasilkan dari pengolahan args
    private Pinjaman pinjaman;

    public PembacaInput(String[] args)
    {
        this.args = args;
    }

    // Mengolah args menjadi sebuah objek Pinjaman
    public void baca()
    {
        double hutang = Double.parseDouble(this.args[0]);
        float bunga = Float.parseFloat(this.args[1]);
        int jumlahCicilan = Integer.parseInt(this.args[2]);

        this.pinjaman = new Pinjaman(hutang, bunga, jumlahCicilan);
    }

    // Getter untuk pinjaman
    public Pinjaman getPinjaman()
    {
        return this.pinjaman;
    }
}
