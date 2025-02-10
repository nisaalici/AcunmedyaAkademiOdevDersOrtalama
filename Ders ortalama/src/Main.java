
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç dersin notunu gireceksiniz? ");
        int dersSayisi = scanner.nextInt();

        int toplam = 0;
        int enYuksek = Integer.MIN_VALUE;
        int enDusuk = Integer.MAX_VALUE;

        for (int i = 1; i <= dersSayisi; i++) {
            System.out.print(i + ". dersin notunu giriniz: ");
            int not = scanner.nextInt();

            toplam += not;

            if (not > enYuksek) {
                enYuksek = not;
            }

            if (not < enDusuk) {
                enDusuk = not;
            }
        }

        float ortalama = (float) toplam / dersSayisi;

        System.out.println("---------------------------------");
        System.out.println("Ortalama Notunuz : " + ortalama);
        System.out.println("En Yüksek Notunuz : " + enYuksek);
        System.out.println("En Düşük Notunuz : " + enDusuk);

        System.out.println("---------------------------------- ");

        if (ortalama >= 50) {
            System.out.println("GECTİNİZ");
        } else {
            System.out.println("KALDİNİZ");
        }

        scanner.close();
    }
}

