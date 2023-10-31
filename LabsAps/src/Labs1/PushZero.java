package Labs1;
import java.util.Scanner;

public class PushZero {
    static void pushZerosToBeginning(int arr[], int n)
    {

            int zero=n-1;
            for(int i=n-1;i>=0;i--){
                if(arr[i]!=0){
                    arr[zero--]=arr[i];//na posledjnite mesta zadrzuvvas brojki
                }
            }
        for (int i=zero;i>=0;i--){
                arr[i]=0;// na prvite mesta samo vmetni 0 i ez
         }
        System.out.println("Transformiranata niza e:");
            for (int i=0;i<n;i++){
                System.out.print(arr[i] + " ");
            }

    }
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int[] Arrey = new int[number];

        for (int i = 0; i < Arrey.length; i++){
            Arrey[i] = input.nextInt();
    }
        pushZerosToBeginning(Arrey,number);
    }
}
