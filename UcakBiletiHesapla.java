import java.util.Scanner;

public class UcakBiletiHesapla {
    public static void main(String[] args) {
        int mesafe, yas;
        double fiyat, indirimliFiyat;

        String yolculukTipi;

        Scanner imp=new Scanner(System.in);

        System.out.println("Mesafe giriniz:");
        mesafe= imp.nextInt();

        System.out.println("Yaşı giriniz:");
        yas=imp.nextInt();

        //temizleme için ekstra nextLine()
        imp.nextLine();

        System.out.println("Yolculuk Tipi tek yön / gidiş-dönüş:");
        yolculukTipi= imp.nextLine();

        fiyat=mesafe * 0.10;

        if (yas<=12){
            if (yolculukTipi.equalsIgnoreCase("gidiş-dönüş")){
                indirimliFiyat=fiyat * (0.50 + 0.20);
                //indirimliFiyat=0.2;
                System.out.println("Bilet fiyatı:" + indirimliFiyat);
            }else
            indirimliFiyat=fiyat * 0.5;
            System.out.println("Bilet fiyatı:" + indirimliFiyat);

        }
        else if (yas<=24 && yas>12){
            if (yolculukTipi.equalsIgnoreCase("gidiş-dönüş")){
                indirimliFiyat=fiyat * (0.10 + 0.20);
                //indirimliFiyat=0.2;
                System.out.println("Bilet fiyatı:" + indirimliFiyat);
            }else
            indirimliFiyat=fiyat * 0.1;
            System.out.println("Bilet fiyatı:" + indirimliFiyat);

        } else if (yas>=65) {
            if (yolculukTipi.equalsIgnoreCase("gidiş-dönüş")){
                indirimliFiyat=fiyat * (0.30 + 0.20);
                //indirimliFiyat=0.2;
                System.out.println("Bilet fiyatı:" + indirimliFiyat);
            }else
            indirimliFiyat=fiyat * 0.3;
            System.out.println("Bilet fiyatı:" + indirimliFiyat);

        } else if (yas>24 && yas<65) {
            if (yolculukTipi.equalsIgnoreCase("gidiş-dönüş")){
                indirimliFiyat=0.2;
                System.out.println("Bilet fiyatı:" + indirimliFiyat);
            }else
            System.out.println("Bilet fiyatı:" + fiyat);


        }

    }
}
