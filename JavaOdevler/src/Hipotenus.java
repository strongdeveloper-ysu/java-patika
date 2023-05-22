import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("1.kenarı giriniz: ");

        int a = inp.nextInt();
        System.out.println("2.kenarı giriniz: ");
        int b = inp.nextInt();
        System.out.println("3.kenarı giriniz: ");
        int c = inp.nextInt();
        double u= (a+b+c)/2;
        double alan = u*(u-a)*(u-b)*(u-c);
        alan = Math.sqrt(alan);
        System.out.println("Üçgenin alanı: "+alan);
    }
}