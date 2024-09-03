public class Mobil {
    private String merk;
    private int tahunKeluaran;
    private String bahanBakar;

    public void mobilNyala(){
        System.out.println("kreeekkk!!!");
    }

    public void mobilBerangkat(){
        System.out.println("mobil merk " + merk + "berbahan bakar " + bahanBakar + " Melaju kencang");
    }

    public Mobil(String merk, int tahunKeluaran, String bahanBakar) {
        this.merk = merk;
        this.tahunKeluaran = tahunKeluaran;
        this.bahanBakar = bahanBakar;
    }
}
