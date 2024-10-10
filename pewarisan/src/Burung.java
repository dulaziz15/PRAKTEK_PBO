public class Burung extends EntitasTerbang {

    private float panjangParuh;

    public Burung(String nama, int jumlahSayap, float panjangParuh) {
        super(nama, jumlahSayap);
        this.panjangParuh = panjangParuh;
    }
    public void bersuara() {
        System.out.println("Bersuara");
    }
}
