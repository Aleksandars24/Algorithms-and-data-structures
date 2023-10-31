package AB1;

public class Main {
    public int a=10;
    @Override
    public String toString() {
        return "AB1.Main{}"+10;
    }

    public static void main(String[] args) {
    //Za da se cita od tastatura.
    //        Scanner input = new Scanner(System.in);
    //        System.out.print("Enter an integer: "); int number = input.nextInt();
    //        System.out.println("You entered " + number);// closing the scanner object
    //        input.close();
    
            // struktura for-each
    //        int [] numbers={3,9,5,-5};
    //        for (int number : numbers){
    //            System.out.println(number);
    //        }
    
    //        //Листа
    //        ArrayList<String> myList= new ArrayList<String>();
    //        myList.add("Apple");
    //        myList.add("Banana");
    //        myList.add("Chary");
    //        myList.add("Date");
    //        for (int i=0;i<myList.size();i++)
    //            System.out.println(myList.get(i));
    //AB1.Main a=new AB1.Main();
    //        System.out.println(a.toString());

            //Generici
Box<Integer> intBox =new Box<Integer>();//se mesti deka ovaj box ke ima samo integer vrednosti
    intBox.setT(12);
        System.out.println(intBox.toString());
        intBox.toString();
    }
}
class Box<T>{//genericka klasa eden tip na podatok T
private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    @Override
    public String toString() {
        return "AB1.Box sodrzi:" + t;
    }
}
