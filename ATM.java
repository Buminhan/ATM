import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        String sifre, kullanici_adi;
        double bakiye = 1500, islem, para;
        int hak = 3;
        Scanner inp = new Scanner(System.in);
        while (hak > 0) {
            System.out.println("Kullanıcı adınızı giriniz.");
            kullanici_adi = inp.nextLine();
            System.out.println("Şifrenizi giriniz.");
            sifre = inp.nextLine();
            if (kullanici_adi.equals("patika") && sifre.equals("dev123")) {
                System.out.println("Merhaba, Patika Bankasına hoşgeldiniz.");
                System.out.println("Lütfen yapmak istediğiniz işleme tekabül eden sayıyı tuşlayınız.\n1. Para Yatırma\n2. Para Çekme\n3.Bakiye Sorgulama\n4. Çıkış Yap");
                islem = inp.nextDouble();
                if (islem == 1) {
                    System.out.println("Ne kadar para yatırmak istediğinizi tuşlayınız ve atm ye parayı sokunuz.");
                    para = inp.nextDouble();
                    bakiye += para;
                    System.out.println("Güncel bakiyeniz : " + bakiye);
                } else if (islem == 2) {
                    System.out.println("Ne kadar para çekmek istediğinizi tuşlayınız ve atm den parayı alınız.");
                    para = inp.nextDouble();
                    bakiye -= para;
                    System.out.println("Güncel bakiyeniz : " + bakiye);
                } else if (islem == 3) {
                    System.out.println("Güncel bakiyeniz : " + bakiye);
                } else if (islem == 4) {
                    System.out.println("Görüşmek üzere.");
                } else {
                    System.out.println("İşlem tanımlanamadı, yanlış tuşlama yaptınız.");
                }
                break;
            } else {
                System.out.println("Şifrenizi ya da kullanıcı adınızı hatalı tuşladınız.");
                hak--;
                if(hak>0){
                    System.out.println("Lütfen tekrar deneyiniz. Kalan deneme hakkınız "+hak+".");
                }
                else{
                    System.out.println("Kartınız bloke olmuştur. Lütfen bankamız ile iletişime geçiniz.");
                }
            }
        }
    }
}
