import java.lang.Math;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
         System.out.println("co chesz liczyc:");
    int pkt = scan.nextInt();

    
    switch(pkt)
    {
      case 1:
        {
          System.out.println("Podaj bok a:");
          int a = scan.nextInt();
          System.out.println("Podaj bok b:");
          int b = scan.nextInt();
          System.out.println(a*b);
        }

      case 2:
        {
          System.out.println("Podaj promien 1:");
          int a = scan.nextInt();
          System.out.println("Podaj promien 2:");
          int b = scan.nextInt();
          System.out.println(Math.PI*a*a+Math.PI*b*b);
        }
      case 3:
        {
          System.out.println("Podaj podstawe:");
          int a = scan.nextInt();
          System.out.println("Podaj wysokość:");
          int h = scan.nextInt();
          System.out.println(a*h/2);
        }
      case 4:
        System.out.println("Podaj licznik:");
        int a = scan.nextInt();
        System.out.println("Podaj mianownik:");
        int b = scan.nextInt();
        if(b!=0)
        {
          System.out.println(a/b);
        }else
          System.out.println("Nie można dzilić przez 0");
    }
  }
}
