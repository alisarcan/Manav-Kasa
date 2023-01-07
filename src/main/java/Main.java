import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double armut, elma, domates, muz, patlican;
        double aFiyat = 2.14, eFiyat = 3.67, dFiyat = 1.11, mFiyat = 0.95, pFiyat = 5.00;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo ? : ");
        armut = input.nextDouble();
        aFiyat *= armut;

        System.out.print("Elma kaç kilo ? : ");
        elma = input.nextDouble();
        eFiyat *= elma;

        System.out.print("Domates kaç kilo ? : ");
        domates = input.nextDouble();
        dFiyat *= domates;

        System.out.print("Muz kaç kilo ? : ");
        muz = input.nextDouble();
        mFiyat *= muz;

        System.out.print("Patlıcan kaç kilo ? : ");
        patlican = input.nextDouble();
        pFiyat *= patlican;

        double toplam = aFiyat + eFiyat + dFiyat + mFiyat + pFiyat;

        System.out.print("Toplam Tutar : " + toplam);

    }
}
