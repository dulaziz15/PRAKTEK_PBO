public class Main {
    public static void main(String[] args) {

        // variable dan tipe data
        int x = 0;
        int y = 1;
        float a = 1.f;
        double b = 2.f;

        // TIPE DATA ----> Primitif
        //               |----> Tipe data bawaan java yang diawali huruf kecil
        //               |----> example: int, float, double, char

        //           ----> NonPrimitif
        //               |----> Bisa disebut tipe data object yang diawali huruf besar
        //               |----> example: String, Int

        // contoh tipe data NonPrimitif
        String nama = "abdul aziz";
        String nama2 = new String("abdul aziz");
        tambah();
        System.out.println("hasil Function tambah2 " + tambah2(4, 5));
        System.out.println("Method penjumlahan angka banyak ");
        System.out.println("hasilnya adalah " + AngkaBanyak(3,4,5));
        // input dari args
        int[] inputAngka = new int[10];
        for(int i=1; i < args.length; i++ ){
            String input = args[i];
            int inputAngkaInt = Integer.parseInt(input);
            inputAngka[(i - 1)] = inputAngkaInt;
        }
        System.out.println("Angka banyak " + AngkaBanyak(inputAngka));

        System.out.println("apakah " + y + " ganjil? " + isGanjil(y));
        String namaPembuat = args[0];
        System.out.println("program ini dibuat oleh " + namaPembuat);
        System.out.println(args[0]);

        // contoh pemanggilan class menjadi object
        SepedaMotor spdA = new SepedaMotor("Honda Vario", 2017);
        SepedaMotor spdB = new SepedaMotor("Honda Beat", 2022);

        spdA.nyalakan();
        spdB.nyalakan();

        spdA.jalan();
        spdB.jalan();

        // Pemanggilan class Mobil di main
        Mobil mobil1 = new Mobil("Honda Brio" , 2021, "solar");
        Mobil mobil2 = new Mobil("Honda Civic" , 2021, "bensin");

        mobil1.mobilNyala();
        mobil2.mobilNyala();

        mobil1.mobilBerangkat();
        mobil2.mobilBerangkat();
    }

    public static void tambah() {
        int angka1 = 4;
        int angka2 = 6;
        int jumlah = angka1 + angka2;
        System.out.println("hasil method jumlah tanpa parameter ");
        System.out.println("hasil dari " + angka1 + " + " + angka2 + " = " + jumlah);
    }

    public static int tambah2(int bil1, int bil2){
        return bil1 + bil2;
    }

    public static int AngkaBanyak(int ...angka){
        int jumlahBanyak = 0;
        for(int i=0; i < angka.length; i++){
            jumlahBanyak += angka[i];
        }
        return jumlahBanyak;
    }

    public static boolean isGanjil(int angka){
        if(angka  % 2 == 0){
            return false;
        }else {
            return true;
        }
    }
}