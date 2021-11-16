import java.util.*;
public class IntegerSet {
    private ArrayList<Integer> list;

    public IntegerSet(ArrayList<Integer> list){
        this.list=list;
    }

    static ArrayList<Integer> union (ArrayList<Integer> tab1, ArrayList<Integer> tab2){
        ArrayList<Integer> tab3 = new ArrayList<Integer>();
        tab3.addAll(tab1);
        tab3.addAll(tab2);
        return tab3;
    }

    static ArrayList<Integer> intersection(ArrayList<Integer> tab1, ArrayList<Integer> tab2){
        ArrayList<Integer> tab3 = new ArrayList<Integer>();
        for(Integer x: tab1){
            if(tab2.contains(x)){
                tab3.add(x);
            }
        }
        return tab3;
    }

    void insertElement(Integer x){
        this.list.add(x);
    }

    void deleteElement(Integer x){
        for(int i = 0; i<this.list.size(); i++){
            if(this.list.get(i).equals(x)){
                this.list.remove(i);
            }
        }
    }

    public String toString() {
        StringBuilder temp = new StringBuilder();
        for (Integer integer : list) {
            temp.append(integer).append(" ");
        }
        return temp.toString();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        IntegerSet integers = (IntegerSet) o;
        return Objects.equals(list, integers.list);
    }

}

class TestIntegerSet {
    public static void main(String[] args) {

        //union test
        ArrayList<Integer> list1 = new ArrayList<>(5);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        System.out.println("LIST1 : ");
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        System.out.println("\nLIST2 : ");
        System.out.println(list2);

        ArrayList<Integer> list3;
        list3 = IntegerSet.union(list1, list2);
        System.out.println("\nUNION(1/2) : ");
        System.out.println(list3);

        ArrayList<Integer> list4 = new ArrayList<>(5);
        list4.add(58);
        list4.add(40);
        list4.add(20);
        list4.add(23);
        list4.add(11);
        System.out.println("\nLIST4 : ");
        System.out.println(list4);

        ArrayList<Integer> list5 = new ArrayList<>(5);
        list5.add(23);
        list5.add(40);
        list5.add(13);
        list5.add(94);
        list5.add(58);
        System.out.println("\nLIST5 : ");
        System.out.println(list5);

        ArrayList<Integer> list6;
        list6 = IntegerSet.intersection(list4, list5);
        System.out.println("\nINTERSECTION(4/5) : ");
        System.out.println(list6);

        IntegerSet list7 = new IntegerSet(new ArrayList<>());
        System.out.println("\nLIST7 : ");
        list7.insertElement(24);
        list7.insertElement(48);
        list7.insertElement(30);
        list7.insertElement(15);
        list7.insertElement(65);
        System.out.println("\nINSERT : ");
        System.out.println(list7);
        System.out.println("\nDELETE : ");
        list7.deleteElement(30);
        System.out.println(list7);

        IntegerSet list8 = new IntegerSet(new ArrayList<>());
        System.out.println("\nLIST8 : ");
        list8.insertElement(11);
        list8.insertElement(23);
        list8.insertElement(30);
        System.out.println("\nEQUAL(7/8)? : ");
        System.out.println(list7.equals(list8));

    }
}
