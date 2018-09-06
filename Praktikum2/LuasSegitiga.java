//import java.util.Scanner;
public class LuasSegitiga {
    public static void main(String[] args) {
       int alas = 5;
       int tinggi = 5;
       float luas;
    
       /*Scanner scan = new Scanner(System.in);
       System.out.print("Masukan Alas: ");
       alas = scan.nextInt();
       System.out.print("Masukan Tinggi: ");
       tinggi = scan.nextInt();
      ************************************/
       luas = ((alas * tinggi)/2f);
       System.out.println("Luas Segitiga = " +luas);
        }
    }