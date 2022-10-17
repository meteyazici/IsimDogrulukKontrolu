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


        for ( int i = 0 ; i < bolunmusIslem.length ; i++){

            char firstChar = bolunmusIslem[i].charAt(0);

            //Baş harfi kontrol amaçlı
            if (firstChar > 96 && firstChar < 123 ){
                System.out.println((i + 1 )+". kelimenin baş harfi hatalı");
            }
            //Format hatası kontrolü
            if ((bolunmusIslem[i].equals(bolunmusIslem[i].toUpperCase()))){
                System.out.println("Format hatası");
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
            String result = "";
            char harf = isim.charAt(a);
            result += "" + harf;
            if (!((harf > 64 && harf < 91) || (harf > 96 && harf < 123) || harf == ' ')){
                System.out.println("Geçersiz ad");
                break;
            }

        }
    }
}
