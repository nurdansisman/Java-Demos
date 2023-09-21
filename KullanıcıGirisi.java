import java.util.Scanner;

public class KullanıcıGirisi {
    public static void main(String[] args) {
        String userName,password;
        Scanner imp=new Scanner(System.in);
        String sıfırlama=null;

        System.out.println("Kullanıcı adınız:");
        userName=imp.nextLine();

        System.out.println("Şifrenizi giriniz:");
        password=imp.nextLine();

        if (userName.equalsIgnoreCase("patika")&& password.equals("java123")){
            System.out.println("Giriş yaptınız");
        }else {
            System.out.println("Bilgileriniz yanlış");
            System.out.println("Şifrenizi sıfırlamak ister misiniz? (evet/hayır)");
            String sifirlama=imp.nextLine();

            if (sifirlama.equalsIgnoreCase("evet")){

                System.out.println("Eski şifreniz:");
                String eskiSifre = imp.nextLine();

                System.out.println("Yeni şifrenizi giriniz:");
                String yeniSifre = imp.nextLine();

                System.out.println("Yeni şifrenizi tekrar giriniz:");
                String yeniSifreTekrar = imp.nextLine();
           } else {
                System.out.println("Şifre oluşturulamadı lütfen başka şifre giriniz!");
            }
        }
    }
}
