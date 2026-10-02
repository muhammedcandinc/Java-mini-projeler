import java.util.Scanner;

public class KutuphaneSistemi {

    public static boolean süresiniri(int süre){
        if(süre<=30){
            return true;
        }else{
            return false;
        }

    }




    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("MAMİ KÜTÜPHANESİNE HOŞ GELDİNİZ");
    System.out.println("LÜTFEN AD SOYAD GİRİNİZ = ");
    String kullaniciadi = input.nextLine();
    System.out.println("MERHABA"+ " "+ kullaniciadi);
    System.out.println("LÜTFEN KİTABIN GERİ GETİRİLME SÜRESİNİ GİRİNİZ = ");
    int gerigetirme = input.nextInt();

    boolean sonuc = süresiniri(gerigetirme);

    if(sonuc == true){
        System.out.println("YENİ KİTAP ALABİLİRSİNİZ");
    }else{
        System.out.println("YENİ BİR KİTAP ALAMAZSINIZ");
    }

    input.close();
    }
}
