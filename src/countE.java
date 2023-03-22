import java.util.Scanner;

public class countE {

/*    Determine and print the number of times
      the character ‘b’ appears in the input entered by the user.

     input: Test output
            b: 0
        output should be 0


     input: bucket
            b:1
        output should be 1
        */


    //hint: .charAt, length(), for, index, counter,



    /* girilen inputda kac tane 'b' karakteri olduğunu  print eden code create ediniz.

     input: Test
            b: 0
        output 0


     input: bucket
            b:1
        output 1
        */


    //hint: .charAt, length(), for, index, counter,


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("kelime giriniz");

        String text = input.nextLine();
        int count=0;
        for (int i = 0; i <text.length() ; i++) {
            if(text.toLowerCase().charAt(i)=='b'){
                count++;
            }

        }
        System.out.println("verilen "+text+" b harfi "+count+" kadar vardir ");

        // code start here
        //  bu satırdan önceki kodlari değiştirmeyiniz
    }

}
