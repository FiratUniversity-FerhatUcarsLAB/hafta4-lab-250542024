Ad Soyad: [SARYA SU TOĞYILDIZ]
Ogrenci No: [250542024]
Tarih: [04/11/2025]
Aciklama: [Maas Hesap]
  
  import java.util.Scanner;

public class MaasBordrosu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;

        System.out.print("Çalışanın Adı Soyadı: ");
        String adSoyad = input.nextLine();

        System.out.print("Aylık Brüt Maaş (TL): ");
        double brutMaas = input.nextDouble();

        System.out.print("Haftalık Çalışma Saati: ");
        int haftalikSaat = input.nextInt();

        System.out.print("Mesai Saati Sayısı: ");
        int mesaiSaati = input.nextInt();

        // Gelirler
        double mesaiUcreti = (brutMaas / 160.0) * mesaiSaati * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        // Kesintiler
        double sgk = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgk + gelirVergisi + damgaVergisi;

        // Net maaş ve istatistikler
        double netMaas = toplamGelir - toplamKesinti;
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100.0;
        double saatlikNetKazanc = netMaas / 176.0;
        double gunlukNetKazanc = netMaas / 22.0;

        System.out.println("\n==================== Maaş Bordrosu ====================");
        System.out.printf("%-20s : %s\n", "Ad Soyad", adSoyad);
        System.out.printf("%-20s : %.2f TL\n", "Brüt Maaş", brutMaas);
        System.out.printf("%-20s : %.2f TL\n", "Mesai Ücreti", mesaiUcreti);
        System.out.printf("%-20s : %.2f TL\n", "Toplam Gelir", toplamGelir);
        System.out.println("------------------------------------------------------");
        System.out.printf("%-20s : %.2f TL (%.1f%%)\n", "SGK", sgk, SGK_ORANI * 100.0);
        System.out.printf("%-20s : %.2f TL (%.1f%%)\n", "Gelir Vergisi", gelirVergisi, GELIR_VERGISI_ORANI * 100.0);
        System.out.printf("%-20s : %.2f TL (%.1f%%)\n", "Damga Vergisi", damgaVergisi, DAMGA_VERGISI_ORANI * 100.0);
        System.out.printf("%-20s : %.2f TL\n", "Toplam Kesinti", toplamKesinti);
        System.out.println("------------------------------------------------------");
        System.out.printf("%-20s : %.2f TL\n", "Net Maaş", netMaas);
        System.out.printf("%-20s : %.1f%%\n", "Kesinti Oranı", kesintiOrani);
        System.out.printf("%-20s : %.2f TL\n", "Saatlik Net Kazanç", saatlikNetKazanc);
        System.out.printf("%-20s : %.2f TL\n", "Günlük Net Kazanç", gunlukNetKazanc);
        System.out.println("======================================================");

        input.close();
    }
}

