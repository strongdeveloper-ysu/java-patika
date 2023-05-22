import java.util.Scanner;

public class ManavKasaProgramı {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("armut kilogramını giriniz: ");
        double a = inp.nextDouble();
        System.out.println("elma kilogramını giriniz: ");
        double e = inp.nextDouble();
        System.out.println("domates  kilogramını giriniz: ");
        double d = inp.nextDouble();
        System.out.println("muz kilogramını giriniz: ");
        double m = inp.nextDouble();
        System.out.println("patlıcan kilogramını giriniz: ");
        double p = inp.nextDouble();

        a *= 2.14;
        e *= 3.67;
        d *= 1.11;
        m *= 0.95;
        p *= 5.00;
        System.out.println("toplam tutar "+(a+e+d+m+p));

    }
}
