import java.util.Arrays;
import java.util.Scanner;

public class twoString {

    public static void main(String[] args) {

        /*
            Given two string by using scanner class and add each other
            if first word last letter is same with second word first letter then remove one of them.

            Example: "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"
        */


        /*


        Eger ilk kelimenin son harfi ikinci kelimenin ilk harfi ile aynı ise aynı olan harflerin birisini
        kaldırıp kelimeleri birleştiren code create ediniz

       Örnek:      "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"


         */
        Scanner dp = new Scanner(System.in);
        System.out.println("iki isim giriniz ");

        String  allElements = dp.nextLine();

        String[] elements = allElements.split(" ");
        System.out.println(Arrays.toString(elements));


        String s1 = elements[0];
        System.out.println(s1);
        String s2 = elements[1];
        System.out.println(s2);
        String s3=" ";


                if (s1.charAt(s1.length()-1)==s2.charAt(0)){
                    s2=s2.substring(1);



                }
                s3=s1+s2;
        System.out.println(s3);


    }





        // code start here use s1 and s2 as words
        // kodu burdan başlatın ve s1 ve s2 kelime olarak kullanın




        

    }

