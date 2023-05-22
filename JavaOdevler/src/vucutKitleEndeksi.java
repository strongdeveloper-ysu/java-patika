import java.util.Scanner;

public class vucutKitleEndeksi {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Boyunuzu metere cinsinden giriniz metere: ");
        double boy = inp.nextDouble();
        System.out.println("kilonuzu giriniz: ");
        double kilo = inp.nextDouble();
        double indeks = kilo/(boy*boy);
        System.out.println("vücut kütle indeksiniz: "+ indeks);
    }
}
