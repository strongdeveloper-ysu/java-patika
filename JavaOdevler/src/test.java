import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int mat, fizik, kimya, turkce, tarih, muzik ;

        System.out.println("Matematik dersinin notunu giriniz");
        mat = inp.nextInt();

        System.out.println(" Fizik dersinin notunu giriniz");
        fizik= inp.nextInt();

        System.out.println("kimya dersinin notunu giriniz");
        kimya= inp.nextInt();

        System.out.println("türkçe dersinin notunu giriniz");
        turkce = inp.nextInt();

        System.out.println("tarih dersinin notunu giriniz");
        tarih = inp.nextInt();

        System.out.println("müzik dersinin notunu giriniz");
        muzik = inp.nextInt();

        double ort= mat + fizik + kimya + turkce + tarih + muzik ;

        ort = ort/6.0;

        System.out.println("ortalamanız  78" + ort);

        String durum = (ort>=60) ? "Geçtiniz" : "Kaldınız " ;

        System.out.println(" " +durum );
    }

}
