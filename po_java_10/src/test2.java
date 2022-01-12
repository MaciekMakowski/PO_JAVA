import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class test2 {
    public static <T extends Comparable<T>> void redukuj(LinkedList<T> pracownicy, int n){
        LinkedList<T> tmp = new LinkedList<T>();
        for(int i=0; i < pracownicy.size();i++){
            if((i+1)%n!=0){
                tmp.add(pracownicy.get(i));
            }
        }
        pracownicy.clear();
        pracownicy.addAll(tmp);
    }
    public static <T extends Comparable<T>> void odwroc(LinkedList<T> lista){
        int j = lista.size()-1;
        int i = 0;
        while(i<j){
            T tmp = lista.get(j);
            lista.set(j,lista.get(i));
            lista.set(i,tmp);
            i=i+1;
            j=j-1;
        }
    }


    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<String>();
        lista.add("Kowalski");
        lista.add("Grzyb");
        lista.add("Maka");
        lista.add("Ibisz");
        lista.add("Trebacz");
        redukuj(lista,3);
        for(int i =0;i< lista.size();i++){
            System.out.println(lista.get(i));
        }
        odwroc(lista);
        for(int i =0;i< lista.size();i++){
            System.out.println(lista.get(i));
        }
        String text = "Ala ma kota. Jej kot lubi myszy.";
        Stack<String> fifo = new Stack<String>();
        String[] x ;
        x = text.split("\\.");

        System.out.println(x[0]);
        for(int i = 0; i<x.length;i++){
        }






    }
}
