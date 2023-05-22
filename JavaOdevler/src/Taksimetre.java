import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        System.out.println("mesafeyi giriniz: ");
        Scanner inp = new Scanner(System.in);
        double mesafe =inp.nextDouble();
        double ucret;
        if(mesafe>=9.1) {
            ucret = (mesafe * 2.20) + 10;
        }
        else {
            ucret=20;
        }
        System.out.println("tutar: "+ucret);
    }
}
