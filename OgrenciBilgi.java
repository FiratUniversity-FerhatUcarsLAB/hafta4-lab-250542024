Ad Soyad: [SARYA SU TOĞYILDIZ]
Ogrenci No: [250542024]
Tarih: [04/11/2025]
Aciklama: [Öğrenci Bilgi]

    import java.util.Scanner;

public class OgrenciBilgileri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ad: ");
        String ad = input.next();

        System.out.print("Soyad: ");
        String soyad = input.next();

        System.out.print("Öğrenci Numarası: ");
        int numara = input.nextInt();

        System.out.print("Yaş: ");
        int yas = input.nextInt();

        System.out.print("GPA (0.00 - 4.00): ");
        double gpa = input.nextDouble();

        System.out.println("\n--- Öğrenci Bilgileri ---");
        System.out.println("Ad Soyad: " + ad + " " + soyad);
        System.out.println("Numara  : " + numara);
        System.out.println("Yaş     : " + yas);
        System.out.printf("GPA     : %.2f\n", gpa);

        input.close();
    }
}
