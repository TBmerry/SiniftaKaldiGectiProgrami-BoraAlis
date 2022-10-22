import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fzk,kmy,trk;
        int toplam = 0, dersSayisi = 0;
        float ort;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz :");
        mat = input.nextInt();
        if(mat<0 || mat>100){
            System.out.println("Not ortalamaya dahil edilmedi");
        }else{
            System.out.println("Matematik notunuz : " + mat);
            toplam +=mat;
            dersSayisi += 1;
        }

        System.out.println("Fizik notunuzu giriniz :");
        fzk = input.nextInt();
        if(fzk < 0 || fzk > 100){
            System.out.println("Not ortalamaya dahil edilmedi");

        }else{
            System.out.println("Fizik notunuz : " + fzk);
            toplam += fzk;
            dersSayisi += 1;
        }

        System.out.println("Kimya notunuzu giriniz : ");
        kmy = input.nextInt();
        if(kmy<0 || kmy > 100){
            System.out.println("Not ortalamaya dahil edilmedi");
        }else{
            System.out.println("Kimya notunuz : " + kmy);
            toplam += kmy;
            dersSayisi += 1;
        }

        System.out.println("Türkçe notunuzu giriniz : ");
        trk = input.nextInt();
        if(trk < 0 || trk > 100){
            System.out.println("Not ortalamaya dahil edilmedi");
        }else{
            System.out.println("Türkçe notunuz : " + trk);
            toplam += trk;
            dersSayisi += 1;
        }

        ort = toplam / dersSayisi;
        System.out.println("Ortalamanız : " + ort);

        if(ort<50){
            System.out.println("Sınıfta kaldın Geçmiş olsun ! ");
        }else{
            System.out.println("Sınıfı geçtin Helal olsun ! ");
        }
    }
}