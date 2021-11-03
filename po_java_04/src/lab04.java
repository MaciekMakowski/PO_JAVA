import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class lab04 {
    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> tab = new ArrayList<Integer>();
        tab.addAll(a);
        tab.addAll(b);
        return tab;
    }
    public static void print(ArrayList a){
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
    }
    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> tab = new ArrayList<Integer>();
        int i=0;
        while(i==0) {
            boolean x = a.isEmpty();
            if (a.isEmpty() == false) {
                tab.add(a.get(i));
                a.remove(i);
            }
            if (b.isEmpty() == false) {
                tab.add(b.get(i));
                b.remove(i);
            }
            if(a.isEmpty() == true && b.isEmpty() ==true){
                i=1;
            }
        }
        return tab;
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> tab = new ArrayList<Integer>();
        tab = append(a,b);
        Collections.sort(tab);
        return tab;
    }

    public static ArrayList<Integer> reversed(ArrayList<Integer> a){
        ArrayList<Integer> tab = new ArrayList<Integer>();
        int size = a.size();
        for(int i = size-1; i>=0;i--){
            tab.add(a.get(i));
        }
        return tab;
    }
    public static void reverse(ArrayList<Integer> a){
        int size = a.size();
        int x = 0;
        int j = 0;
        for(int i = size; i>size/2;i--){
            x = a.get(i-1);
            a.set(i-1,a.get(j));
            a.set(j,x);
            j++;

        }
    }


    public static void main (String[] args){
        ArrayList<Integer> tab1 = new ArrayList<Integer>();
        tab1.add(1);
        tab1.add(4);
        tab1.add(9);
        tab1.add(16);
        ArrayList<Integer> tab2 = new ArrayList<Integer>();
        tab2.add(9);
        tab2.add(7);
        tab2.add(4);
        tab2.add(9);
        tab2.add(11);
//        append(tab1,tab2);
//        print(tab1);
//        print(merge(tab1,tab2));
//        print(mergeSorted(tab1,tab2));
//        print(reversed(tab2));
//        print(tab2);
//        System.out.println("\n");
//        reverse(tab2);
//        print(tab2);


        

    }
}
