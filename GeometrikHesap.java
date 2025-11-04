Ad Soyad: [SARYA SU TOĞYILDIZ]
Ogrenci No: [250542024]
Tarih: [04/11/2025]
Aciklama: [Geometrik Hesap]

import java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14159;

        System.out.print("Yarıçapı girin: ");
        double r = input.nextDouble();

        double daireAlani = PI * r * r;
        double daireCevresi = 2 * PI * r;
        double daireCapi = 2 * r;
        double kureHacmi = (4.0 / 3.0) * PI * Math.pow(r, 3);
        double kureYuzeyAlani = 4 * PI * r * r;

        System.out.println("\n--- Hesaplama Sonuçları ---");
        System.out.printf("Daire Alanı      : %.2f\n", daireAlani);
        System.out.printf("Daire Çevresi    : %.2f\n", daireCevresi);
        System.out.printf("Daire Çapı       : %.2f\n", daireCapi);
        System.out.printf("Küre Hacmi       : %.2f\n", kureHacmi);
        System.out.printf("Küre Yüzey Alanı : %.2f\n", kureYuzeyAlani);

        input.close();
    }
}
