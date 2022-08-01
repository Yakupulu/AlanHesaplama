import  java.util.Scanner;

public class Alan {
    public static void main(String[] args) {

        int a,b,c,u;
        Double alan;
        Scanner giris=new Scanner(System.in);

        System.out.print("1. kenari giriniz:");
        a=giris.nextInt();
        System.out.print("2. kenari giriniz:");
        b= giris.nextInt();
        System.out.print("3.kenari giriniz:");
        c= giris.nextInt();

        u=(a+b+c)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));

        //System.out.println("Ucgenin Alani:"+alan);
        System.out.println(alan<=0?"Girilen degerler ucgen olusturmaz":"Ucgenin Alani:"+alan);







    }
}
