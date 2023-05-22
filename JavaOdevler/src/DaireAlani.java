import java.util.Scanner;

public class DaireAlani {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.println("Daire diliminin yarı çapını giriniz: ");
        double r = inp.nextDouble();
        System.out.println("Merkez açısının ölçüsünü giriniz: ");
        double a = inp.nextDouble();

        double alan = (3.14*(r*r)*a)/360;
        System.out.println("Daire dilminin alanı: "+alan);
    }
}
