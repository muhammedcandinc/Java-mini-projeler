import java.util.Scanner;

public class Javaöğreniyorum {
    public static double NOT(int VİZE) {
        return VİZE*0.4;
    }
    public static double NOT2(int FİNAL){
        return FİNAL*0.6;
    }

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.println("VİZE NOTUNUZU GİRİNİZ : ");
         int VİZE = input.nextInt();

         System.out.println("FİNAL NOTUNUZU GİRİNİZ : ");
         int FİNAL = input.nextInt();

        
        System.out.println("VİZE/FİNAL NOT HESAPLAMA MAKİNESİNE HOŞ GELDİN");

        System.out.println(" VİZE NOTUNUZ = " + " " + VİZE);
        System.out.println("FİNAL NOTUNUZ = " + " " + FİNAL);

        System.out.println("GENEL ORTALAMANIZ : " + " " + (NOT(VİZE)+NOT2(FİNAL)));

        if((NOT(VİZE)+NOT2(FİNAL))>=50 && FİNAL>=50){
            System.out.println("GEÇTİNİZ");
         }else{
            System.out.println("KALDINIZ");
        }
     input.close(); //İŞİMİZ BİTTİĞİNDE SCANNER KANALINI KAPATIR!!!
    } 

}
