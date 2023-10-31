package Cas2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Pocetok {
    public static void main(String[] args) {
        //cutame od tastatura
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        //nova niza
        int[] arr = {10, 20, 30};
        for (int numbers : arr) {
            System.out.println(numbers);//se pecati number ako arr se pecati lokacijata
        }
        //nov obiekt
        String a = new String("abs");
        System.out.println(a + number);
        //Lista
        ArrayList<String> mylist = new ArrayList<String>();
        mylist.add("Dimitar");
        System.out.println(mylist.get(0));//mozes spored me
        //niza so integare
        Integer niza[] = new Integer[]{0, 1, 2};
        for (int niza1:niza)
          System.out.println(niza1);

       //niza od tastatura
        Scanner in = new Scanner(System.in);
        int number2= in.nextInt();
        int[] niza2  =new int[number2];
        int i=0;
        for (int broj:niza){
            niza[i++]=in.nextInt();
        }
        for (int j=0;j<number;j++){
            System.out.println(niza[j]);
        }

//BYTE
    Scanner in2 = new Scanner(System.in);
    byte age= in2.nextByte();
        System.out.println(age);
    }
}
