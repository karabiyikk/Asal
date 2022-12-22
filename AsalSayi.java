package Metotlar;
// 3,5,7,11,13

import java.util.Scanner;

public class AsalSayi {

    static void asal() {
        int i, sayi, sayac = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        sayi = input.nextInt();
        if (sayi >= 2) {
            for (i = 1; i <= sayi; i++) {
                if (sayi % i == 0) {
                    sayac++;
                }
            }
            if (sayac <= 2) {
                System.out.print("Girdiğiniz Sayı Asaldır");
            } else {
                System.out.print("Girdiğiniz Sayı Asal Değildir");
            }
        } else {
            System.out.print("1 Asal Sayı Değildir");
        }
    }

    public static void main(String[] args) {
        asal();
    }
}
