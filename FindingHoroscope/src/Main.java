import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Doğduğunuz Ayı Sayı Olarak Giriniz: ");
        int M = input.nextInt();

        System.out.printf("Doğduğunuz Günü Giriniz: ");
        int D = input.nextInt();
        String burc = "";
        boolean isError = false;

        if (M == 2){
            if ((D <= 29) && (D >=1)){
                if (D < 20){
                    burc = "Kova";
                }else {
                    burc = "Balık";
                }
            }else {
                isError = true;
            }
        }
        if (M == 3){
            if ((D <=31) && (D >=1 )){
                if (D < 21){
                    burc = "Balık";
                }else {
                    burc = "Koç";
                }
            }else {
                isError = true;
            }
        }
        if (M == 4){
            if ((D <=30) && (D >=1 )){
                if (D < 22){
                    burc = "Koç";
                }else {
                    burc = "Boğa";
                }
            }else {
                isError = true;
            }
        }
        if (M == 5){
            if ((D <=31) && (D >=1 )){
                if (D < 22){
                    burc = "Boğa";
                }else {
                    burc = "İkizler";
                }
            }else {
                isError = true;
            }
        }
        if (M == 6){
            if ((D <=30) && (D >=1 )){
                if (D < 23){
                    burc = "İkizler";
                }else {
                    burc = "Yengeç";
                }
            }else {
                isError = true;
            }
        }
        if (M == 7){
            if ((D <=31) && (D >=1 )){
                if (D < 24 ){
                    burc = "Yengeç";
                }else {
                    burc = "Aslan";
                }
            }else {
                isError = true;
            }
        }
        if (M == 8){
            if ((D <=30) && (D >=1 )){
                if (D < 23){
                    burc = "Aslan";
                }else  {
                    burc = "Başak";
                }
            }else {
                isError = true;
            }
        }
        if (M == 9){
            if ((D <=30) && (D >=1 )){
                if (D < 23 ){
                    burc = "Başak";
                }else {
                    burc = "Terazi";
                }
            }else {
                isError = true;
            }
        }
        if (M == 10){
            if ((D <=31) && (D >=1 )){
                if (D < 23){
                    burc = "Terazi";
                }else {
                    burc = "Akrep";
                }
            }else {
                isError = true;
            }
        }
        if (M == 11){
            if ((D <=30) && (D >=1 )){
                if (D < 22){
                    burc = "Akrep";
                }else {
                    burc = "Yay";
                }
            }else {
                isError = true;
            }
        }
        if (M == 12){
            if ((D <=31) && (D >=1 )){
                if (D < 22) {
                    burc = "Yay";
                }else {
                    burc = "Oğlak";
                }
            }else {
                isError = true;
            }
        }
        if (isError) {
            System.out.println("Hatalı Giriş Yaptınız");
        }else {
            System.out.println("Burcunuz : " + burc);
        }
    }
}