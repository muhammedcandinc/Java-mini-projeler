import java.util.Scanner;

public class Merhaba {
    public static boolean filmuygunluk (int yas){
        if (yas>=18)
            return true;
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("LÜTFEN YAŞINIZI GİRİNİZ = ");
        int kullanıcıyası = input.nextInt();

        boolean sonuc = filmuygunluk(kullanıcıyası);

        if (sonuc==true)
            System.out.println("FİLMİ İZLEYEBİLİRSİNİZ İYİ SEYİRLER");
        else{
            System.out.println("ÜZGÜNÜZ FİLMİ İZLEYEBİLMEK İÇİN 18 YAŞINDAN BÜYÜK OLMALISINIZ");
        }


    }
}
