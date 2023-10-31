package Cas6;

import java.util.Scanner;

class SLLNode<E>{
    E element; //eleementot vo listata koj se cuva
    SLLNode<E> succ; //referenca kon jazol se dodeka nema new
                     //koga ima new w kon obiekt

    public SLLNode(E element, SLLNode<E> succ) { //moramee da kazeme
        this.element = element;//koj e elementot
        this.succ = succ;//kade pokazuva toj element
    }
}
class SLL<E>{
    SLLNode<E> first;
    SLLNode<E> last;
    public SLL(){//za pocetok prazna lista
    first=null;
    last=null;
    }

    public SLL(SLLNode<E> first, SLLNode<E> last) {
        this.first = first;
        this.last = last;
    }

    public void insertFirst(E el){
        SLLNode<E> nov=new SLLNode<>(el,first);
        first=nov;
    }
    public void insertLast(E el){
        if (first==null){
            SLLNode<E> nov=new SLLNode<>(el,first);
            first=nov;
        }
        else{
            SLLNode<E> nov=new SLLNode<>(el,null);
            SLLNode<E> pok =first;
            while (pok.succ!=null){//da stigni pred null na posledniot ne smej da se izmini psoledniot
                pok=pok.succ;
            }
            pok.succ=nov;
            //for (SLLNode<E> dvizi =first;dvizi!=null;dvizi=dvizi.succ){

            //}
        }
    }
    public String toString(){
        String s=new String();
        SLLNode<E> dvizi=first;
        while(dvizi!=null){
            s=s+ dvizi.element+" ";
            dvizi=dvizi.succ;
        }
        return s;
    }
}

public class MainCas6 {
    public static void main(String[] args) {
        SLL<Integer> lista=new SLL<>();//se kreira
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();//kolku jazli sodrzi listata

        for (int i = 0; i < n; i++) {//se polni
            int element= input.nextInt();
            lista.insertLast(element);
        }
        System.out.println(lista.toString());
    }
}
