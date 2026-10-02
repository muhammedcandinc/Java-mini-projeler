import java.util.Scanner;

public class EhliyetKontrolSistemi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("EHLİYET VE YAŞ SINIRI MEKANİZMASINA HOŞ GELDİNİZ!!!");

        System.out.println("Lütfen adınızı giriniz= ");
        String kullaniciadi = input.nextLine();

        System.out.println("Merhaba"+ " "+ kullaniciadi + " "+ "lütfen yaşınızı giriniz = ");
        int kullaniciyasi = input.nextInt();

        if (kullaniciyasi>=18){
            System.out.println("Ehliyet almaya uygunsunuz");
        }else{
            System.out.println("Ehliyet almaya uygun değilsiniz ehliyet alabilmek için hala"+ " "+ (18-kullaniciyasi)+" "+ "Yılınız var" );

        }

        input.close();
    }
}
