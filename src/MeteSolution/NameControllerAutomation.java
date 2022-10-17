package MeteSolution;


import java.util.Scanner;

public class NameControllerAutomation {

    public static void main(String[] args) {

        String isim ;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz : ");
        isim = scanner.nextLine();

        //Tam ismi ayırmak amaçlı
        String [] bolunmusIslem = isim.split(" ");

        //Baş harfi kontrol amaçlı
        for ( int i = 0 ; i < bolunmusIslem.length ; i++){
            char firstChar = bolunmusIslem[i].charAt(0);

            if (firstChar > 96 && firstChar < 123 ){
                System.out.println((i + 1 )+". kelimenin baş harfi hatalı");

            }
            //Ad veya Soyad kontrolü
            for (int j = 0; j < bolunmusIslem[i].length() ; j++) {
               if (bolunmusIslem.length < 2){
                   System.out.println("Ad veya soyadı eksik");
                   break;
               }
            }
        }
        //boşluk bırakılırsa
        if (isim.isBlank()){
            System.out.println("İsim girilmedi");
        }

        for (int a = 0; a < isim.length() ; a++) {
            char harf = isim.charAt(a);
            if (!((harf > 64 && harf < 91) || (harf > 96 && harf < 123) || harf == ' ')){
                System.out.println("Geçersiz ad");
                break;
            }
        }
    }
}
