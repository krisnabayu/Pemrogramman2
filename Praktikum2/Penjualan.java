public class Penjualan {
    public static void main(String [] args) {

        int A = 1500;
        int B = 3000;
        int C = 1500;
        int D = 2500;
        int E = 4500;
        int hasil = A+B+C+D+E;
        int bayar = 100000;
        long kembali = hasil-bayar;
        float h = (float) hasil;
        int k = (int) kembali;
        
        System.out.println("Total Pembayaran = " + h);
        System.out.println("Total Kembalian = "+ k);
    }
}