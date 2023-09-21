import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int n1, n2, select ;
        Scanner imp=new Scanner(System.in);

        System.out.println("İlk sayısı giriniz:");
        n1=imp.nextInt();

        System.out.println("İkinci sayıyı giriniz:");
        n2= imp.nextInt();;

        System.out.println("1-Toplama\n 2-Çıkarma\n 3-Çarpma\n 4-Bölme");
        System.out.println("Seçiminiz:");
        select= imp.nextInt();

        if (select == 1){
            System.out.println("Toplam:" + (n1+n2));
        } else if (select==2) {
            System.out.println("Çıkarma:" + (n1-n2));
        } else if (select==3) {
            System.out.println("Çarpma:" + (n1*n2));
        } else if (select==4) {
            if (n2!=0){
                System.out.println("Bölme:" + (n1/n2));
            }
            else System.out.println("Bir sayı 0'a bölünemez!");
        }else {
            System.out.println("İşlem gerçekleşmedi!");
        }

    }
}
