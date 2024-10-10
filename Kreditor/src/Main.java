public class Main {
    public static void main(String[] args) {

        // Membaca input dari parameter
        double hutang = Double.parseDouble(args[0]);
        float bunga = Float.parseFloat(args[1]);
        int jumlahCicilan = Integer.parseInt(args[2]);

        // Tampilkan data input
        System.out.println("Hutang          : " + hutang);
        System.out.println("Bunga           : " + bunga);
        System.out.println("Jumlah Cicilan  : " + jumlahCicilan);

        System.out.println("---------------------------------------------");

        // Menghitung total yang haris dibayar
        double TotalBayar = hutang + (hutang * bunga / 100);
        System.out.println("Total Bayar     : " + TotalBayar);

        // Jumlah yang dibayar setiap cicilan
        double angsuran = TotalBayar / jumlahCicilan;
        System.out.println("Angsuran        : " + angsuran);

        // Tampilkan header table
        double SisaAngsuran = TotalBayar;
        System.out.println("+--------------+--------------+---------------+");
        System.out.printf("| %-10s | %-10s | %-10s | \n", "Angsuran Ke-", "Jumlah Bayar", "Sisa Pinjaman");
        for (int i = 1; i <= jumlahCicilan; i++) {
            SisaAngsuran = SisaAngsuran - angsuran;
            System.out.println("+--------------+--------------+---------------+");
            // cara lain untuk mengetahui sisa pinjaman
            // System.out.printf("| %12s | %12s | %13s | \n", i, angsuran, (TotalBayar - angsuran * i));
            System.out.printf("| %12s | %12s | %13s | \n", i, angsuran, SisaAngsuran);
        }
        System.out.println("+--------------+--------------+---------------+");

        // Cara ke dua membuat table dinamis
        System.out.println("Cara ke dua");
        System.out.println("+--------------+--------------+---------------+");
        System.out.printf("| %-10s | %-10s | %-10s | \n", "Angsuran Ke-", "Jumlah Bayar", "Sisa Pinjaman");
        System.out.println("+--------------+--------------+---------------+");
        for (int i = 1; i <= jumlahCicilan; i++) {
            int AngsuranKe = i;
            double sisaPinjaman = (TotalBayar - angsuran) * AngsuranKe;
            double jumlahBayar = angsuran;

            // Ubah jadi string agar bisa dihitung panjang karakternya
            String strAngsuranKe = String.valueOf(AngsuranKe);
            String strJumlahBayar = String.valueOf(angsuran);
            String strSisaPinjaman = String.valueOf(sisaPinjaman);

            // Menghitung spasi yang dibutuhkan
            int jmlAngsuranKe = 14 - strAngsuranKe.length(); // 14 dari jumlah sepasi dalam satu kolom
            int jmlJumlahBayar = 14 - strJumlahBayar.length();
            int jmlSisaPinjaman = 15 - strSisaPinjaman.length();

            // Menentukan jumlah spasi yang dibutuhkan
            // Sesuai dengan panjang karakternya
            for (int j = 0; j < jmlAngsuranKe; j++) {
                strAngsuranKe = (" " + strAngsuranKe);
            }
            for (int j1 = 0; j1 < jmlJumlahBayar; j1++) {
                strJumlahBayar = " " + strJumlahBayar;
            }
            for (int j2 = 0; j2 < jmlSisaPinjaman; j2++) {
                strSisaPinjaman = " " + strSisaPinjaman;
            }

            System.out.println(
                    "|" + strAngsuranKe + "|" + strJumlahBayar + "|" + strSisaPinjaman + "|"
            );
            System.out.println("+--------------+--------------+---------------+");
        }
    }
}