import java.util.Random;
import java.util.Scanner;

public class RandomNum {


    /*
    Given a positive integer num name is max ,

    create a random number between 0 to max

    output should be int

     */



 /*

  Girilen sayı ile 0 arasında random bir sayi elde eden code create ediniz.

  */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("sayi giriniz");

        int max = Integer.parseInt(scanner.nextLine());
       // replace with your desired max value
      Random rdn=new Random();
      int random=rdn.nextInt(max+1);
        System.out.println(random);
    }


        //  code Start here don't change before this line
        // bu satırdan önceki kodları değiştirmeyiniz


}