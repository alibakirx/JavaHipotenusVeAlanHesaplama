import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenlerimizi tanımlıyoruz
        int kenar1,kenar2,kenar3;
        double u;


        //Üçgeninin kenarlarını kullanıcıdan tek tek alıyoruz.
        Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin kenarlarını gir: \n");
        kenar1 = input.nextInt();
        kenar2 = input.nextInt();
        kenar3 = input.nextInt();


        //Üçgeninin alanı formülünde bulunan u değişkenini (üçgeninin çevresinin yarısı) tanımlıyoruz.
        u = (kenar1 + kenar2 + kenar3) / 2;

        //Math kütüphanesini kullanarak alan ve hipotenüsü buluyoruz.
        System.out.println("Girilen 3 kenarın oluşturduğu üçgenin alanı: " +Math.sqrt(u * (u - kenar1)*(u - kenar2) * (u - kenar3)));
        System.out.println("Kenar1 Ve Kenar2'nin olduğu üçgenin hipotenüs uzunluğu: " + Math.sqrt(Math.pow(kenar1, 2) + Math.pow(kenar2, 2)));










    }
}