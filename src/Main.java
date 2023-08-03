import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nsayi,result=0;
        System.out.print("Sayi Giriniz :");
        Scanner scanner=new Scanner(System.in);
        nsayi=scanner.nextInt();
        for (int i=1;nsayi>i;i++){
            if (nsayi%i==0){
               result=result+i;
            }

        }
        if (nsayi==result){
            System.out.println(nsayi+ " Mukemmel sayidir.");
        }else {
            System.out.println(nsayi + " Mukemmel sayi Degildir.");
        }
    }
}