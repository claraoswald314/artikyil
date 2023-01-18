import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int yil;
        Scanner scanner= new Scanner(System.in);
        System.out.println("yıl giriniz : ");
        yil=scanner.nextInt();
        if(0<yil && yil%400==0){
            System.out.println("girdiğiniz yıl, artık yıldır.");
        }else{
            System.out.println("girdiğiniz değer artık yıl değildir.");
        }

    }

}
