package odev;

import java.util.Scanner;

public class Odev2_For {
    public static void main(String[] args) {

   /*     sayacı ritmik ilerleyen ve adım sayısı belli ise FOR kullanılır.
        DEĞİLSE While kullanılır, Eğer döngüye bir kez mutlaka girilecekse DO_WHILE kullanılır.

                TASK :
        100'den 0'a kadar 13'e tam bölünebilen sayıları ve toplamlarını ekrana yazdırınız (büyükten küçüğe).

        Ekran Çıktısı
        91
        78
        65
        52
        39
        26
        13       */

        int toplam = 0;
        for (int i = 100; i > 1; i--) {
            if (i % 13 == 0) {
                System.out.println(i);
               toplam += i;
            }
        }
       System.out.println("toplam = " + toplam);
        //---------------------------------------------------------------------------------
        // 0-255 e kadar olan harflerin , sayı ve harf değerini konsola yazdırınız.
        for (int i = 0; i <= 255; i++) {
            // i değeri ASCII kodu, (char) i ise karakter karşılığıdır
            System.out.println("ASCII: " + i + " -> Character: " + (char) i);
        }

        //--------------------------------------------------------------------------------
        /* TASK :
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın

        Bugün hava oldukca güzel.-> 2
         str.CharAt(0)

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir metin giriniz: ");
        String metin = input.nextLine();

        int sayac = 0;
        for (int i = 0; i < metin.length(); i++) {

            if (metin.charAt(i) == 'a') {
                sayac = sayac + 1;
                continue;
            }

            if (metin.charAt(i) == 'c') {
                break;
            }
        }
        System.out.println(sayac);


        //--------------------------------------------------------------------------------
        /* TASK :
 Kullanıcıdan 5 adet sayı isteyiniz
 Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
 */


        int sum1 = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Sayı giriniz: ");
            int sayi1 = input.nextInt();
            if (sayi1 > 5 && sayi1 < 10) {
                System.out.println("işlem yapma");
            } else {
                sum1 += sayi1;
            }

        }
        System.out.println("İşlem sonucu: " + sum1);
        //--------------------------------------------------------------------------------
         /* TASK :
        Aşağıdaki şekilde çıktı veren programı print içerisinde
        sadece bir tane # kullanarak yazıdırınız

           #####
           #####
           #####
           #####
           #####

         */
        for (int i = 0; i < 5; i++) {
         for (int j = 0; j < 5; j++) {
                System.out.print("#");
           }
          System.out.println();
        }
    }
}
