public class SepedaMotor {
    // Deskriptor
    // properti
    // berupa kata benda
    // sesuatu yang dimiliki
    private String merk;
    private int tahunPembuatan;

    // deskriptor 2
    // Method
    // berupa kata kerja
    // seuatu yang bisa dilakukan oleh class
    public void nyalakan(){
        System.out.println("Grengg!!!");
    }

    public void jalan(){
        System.out.println("Bremmm! Sepeda motor " + this.merk + " berjalan di jalan raya");
    }

    // Konstruktor
    public SepedaMotor(String merk, int tahunPembuatan) {
        this.merk = merk;
        this.tahunPembuatan = tahunPembuatan;
    }
}
