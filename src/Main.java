import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int hava;

        Scanner input =  new Scanner(System.in);

        System.out.println("Hava Sıcaklığını Giriniz: ");
        hava=input.nextInt();

        if (hava<=5){
            System.out.println("Kayak Yapabilirsiniz !");
        }else if(hava>=5 && hava<=25){
            if (hava<=15){
                System.out.println("Sinemaya Gidebilirsiniz !");
            }
            if(hava>=10){
                System.out.println("Pikniğe Gidebilirsiniz !");
            }
        } else {
          System.out.println("Yüzmeye Gidebilirsiniz !");
       }
    }
}
