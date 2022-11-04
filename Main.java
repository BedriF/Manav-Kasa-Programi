import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,e,d,m,p;
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Armut Kaç Kg ? : ");
        a = sc.nextInt();

        System.out.print("Elma Kaç Kg ? : ");
        e = sc.nextInt();

        System.out.print("Domates Kaç Kg ? :");
        d = sc.nextInt();

        System.out.print("Muz Kaç Kg ? :");
        m = sc.nextInt();

        System.out.print("Patlıcan Kaç Kg ? :");
        p = sc.nextInt();
        double toplam= a*armut+e*elma+d*domates+m*muz+p*patlican;
        System.out.print("Toplam tutar : " +toplam+" TL");
    }
    }
