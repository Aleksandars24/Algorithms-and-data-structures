package Labs1;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseWord {

    public static void printReversed(String word) {

//        for (int i=word.length();i>0;i--){
//            System.out.printf("%c",word.charAt(i));
//        }
//        System.out.println("\n");\
        int i;
        for (i = word.length() - 1; i>=0;i--){
            System.out.printf("%c", word.charAt(i));
        }
        //System.out.println("\n"); nov red na sekoe
        System.out.printf("\n");
    }

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        int number =  Integer.parseInt(input.nextLine()); // ??????
        ArrayList<String> mylist = new ArrayList<String>();
        for (int i=0;i<number;i++) {
            printReversed(input.nextLine());
        }
    }
}
