import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        int n1, n2, select;

        Scanner input =new Scanner(System.in);

        System.out.print("ilk sayıyı giriniz :");
        n1 = input.nextInt();

        System.out.print("ikinci sayıyı giriniz :");
        n2 = input.nextInt();

        System.out.println("1.Toplama(+)\n2.Çıkarma(-)\n3.Çarpma(x)\n4.Bölme(/)" );
        System.out.print("Matematiksel işlemi seçiniz: ");
        select = input.nextInt();

        switch (select) {

            case 1:
                System.out.print("Toplama işlemi sonucu :" + (n1+n2));
                break;
            case 2:
                System.out.print("Çıkarma işlemi sonucu :" + (n1-n2));
                break;
            case 3:
                System.out.print("Çarpma işlemi sonucu :" + (n1*n2));
                break;
            case 4:
                if  (n2 != 0 ) {
                    System.out.print("Bölme işlemi sonucu :" + (n1 / n2));
                }else System.out.print("Hata !!!. Bir sayı 0'a bölünemez");

                break;
            default:
                System.out.print("Hatalı giriş.(1-4 sayıları arasında tercih yapınız !!");
        }



    }
}