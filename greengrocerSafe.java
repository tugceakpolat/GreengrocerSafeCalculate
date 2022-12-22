import java.util.Scanner;
public class greengrocerSafe {
    public static void main(String[] args) {

        double armuttl=2.14, elmatl=3.67, domatestl=1.11, muztl=0.95, patlicantl=5.00;

        Scanner input= new Scanner(System.in);
        System.out.print("Lütfen Armut'un Kilogramını Giriniz :");
        double armut = input.nextDouble();
        System.out.print("Lütfen Elma'nın Kilogramını Giriniz :");
        double elma= input.nextDouble();
        System.out.print("Lütfen Domates'in Kilogramını Giriniz :");
        double domates= input.nextDouble();
        System.out.print("Lütfen Muz'un Kilogramını Giriniz :");
        double muz= input.nextDouble();
        System.out.print("Lütfen Patlıcan'ın Kilogramını Giriniz :");
        double patlican= input.nextDouble();

        double toplam= (armuttl*armut)+(elmatl*elma)+(domatestl*domates)+(muztl*muz)+(patlicantl*patlican);

        System.out.println("Toplam Ödenecek Tutar :" + toplam + "TL");




    }
}
