

import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
       System.out.println("Lütfen hesaplamak istediğiniz tutaru giriniz:");

       Scanner inp = new Scanner(System.in);
       double tutar = inp.nextDouble();
       double kdvliTutar,kdvTutarı;
       if(tutar>=1000){
            kdvTutarı=tutar*0.08;
            kdvliTutar= tutar+kdvTutarı;
        }
       else{
           kdvTutarı= tutar*0.18;
           kdvliTutar= tutar+kdvTutarı;
       }
       System.out.println("KDV'siz Fiyat: " +tutar );
       System.out.println("KDV'li Fiyat: " +kdvliTutar );
       System.out.println("KDV tutarı Fiyat: " +kdvTutarı );

    }

}
