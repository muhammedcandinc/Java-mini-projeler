import java.util.Scanner;

public class KimlikKarti {

 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

 System.out.println("merhaba ismin nedir? = ");
 String kullaniciadi = input.nextLine();

System.out.println("memnun oldum" +" "+ kullaniciadi + " " +"lütfen yaşınızı giriniz");
 int kullaniciyas = input.nextInt();
         
        input.nextLine(); // burda ki kullanıcı verisini boş bırakmamızın sebebi intten sonra gelen stringi okuyabilmesidir...

 System.out.println("en sevdiğin programlama dili nedir?");
String sevilenprogram = input.nextLine();

System.out.println("merhaba"+ " "+ kullaniciadi + " " + kullaniciyas +" "+ "yaşındasın ve en sevidiğin programlama dili"+ " "+ sevilenprogram);

input.close();
 }

} 

