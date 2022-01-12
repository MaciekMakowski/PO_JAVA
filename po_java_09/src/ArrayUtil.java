import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtil{

    public static <T extends Comparable<T>> boolean isSorted(T[] tablica){
        for(int i = 0; i < tablica.length-1; i++){
            int desc = tablica[i].compareTo(tablica[i+1]);
            if (desc > 0) {return false;}
        }
        return true;
    }

    public static <T extends Comparable<T>> int binSearch(T[] tablica, T szukanyObiekt){
        return Arrays.binarySearch(tablica, szukanyObiekt);
    }

    public static <T extends Comparable<T>> void selectionSort(T[] tablica){
        int index;
        T temp;
        for(int i = 0; i < tablica.length-1; i++){
            index = i;
            for(int j = i+1; j < tablica.length; j++){
                if(tablica[j].compareTo(tablica[i]) < 0){
                    index = j;
                }
            }
            temp = tablica[i];
            tablica[i] = tablica[index];
            tablica[index] = temp;
        }
    }

    public static  <T extends Comparable<? super T>> void mergeSort(ArrayList<T> tablica){

        if(tablica == null) {
            return ;
        }

        if(tablica.size() > 1)
        {
            int middle = tablica.size() / 2;

            ArrayList<T> left = new ArrayList<>(tablica.size() / 2);

            for(int i = 0; i < middle; i++) {
                left.add(i, tablica.get(i));
            }

            ArrayList<T> right = new ArrayList<>(tablica.size() - middle);
            for(int i = middle; i < tablica.size(); i++) {
                right.add(i - middle, tablica.get(i));
            }

            mergeSort(left);
            mergeSort(right);

            int i = 0;
            int j = 0;
            int k = 0;

            while(i < left.size() && j < right.size())
            {
                if(left.get(i).compareTo(right.get(j)) < 0) {
                    tablica.set(k, left.get(i));
                    i++;
                }
                else {
                    tablica.set(k, right.get(j));
                    j++;
                }
                k++;
            }

            while(i < left.size()) {
                tablica.set(k, left.get(i));
                i++;
                k++;
            }

            while(j < right.size()) {
                tablica.set(k, right.get(j));
                j++;
                k++;
            }
        }
    }

    public static void main(String... args){
        Integer[] tablica = {1,6,3,4,9,11,25,16,0};
        System.out.println(Arrays.toString(tablica));
        System.out.println(isSorted(tablica));
        ArrayUtil.selectionSort(tablica);
        System.out.println(Arrays.toString(tablica));
        System.out.println(isSorted(tablica));
        System.out.println("binary search 11: " + binSearch(tablica, 11));
        LocalDate date1 = LocalDate.of(2001, 11, 10);
        LocalDate date2 = LocalDate.of(1991, 7, 16);
        LocalDate date3 = LocalDate.of(1811, 9, 20);
        LocalDate date4 = LocalDate.of(1400, 1, 4);
        LocalDate[] dates = {date1, date3, date3, date4};
        System.out.println(Arrays.toString(dates));
        System.out.println(isSorted(dates));
        ArrayUtil.selectionSort(dates);
        System.out.println(Arrays.toString(dates));
        System.out.println(isSorted(dates));
        System.out.println("binary search date3: " + binSearch(dates, date3));
        ArrayList<Integer> tablica2 = new ArrayList<>(9);
        tablica2.add(1);
        tablica2.add(6);
        tablica2.add(3);
        tablica2.add(4);
        tablica2.add(9);
        tablica2.add(11);
        tablica2.add(25);
        tablica2.add(16);
        tablica2.add(0);
        ArrayList<LocalDate> datess = new ArrayList<>(4);
        datess.add(LocalDate.of(2001,11,10));
        datess.add(LocalDate.of(1991,7,16));
        datess.add(LocalDate.of(1811,9,20));
        datess.add(LocalDate.of(1400,1,4));
        System.out.println(tablica2);
        System.out.println(datess);
        mergeSort(tablica2);
        mergeSort(datess);
        System.out.println(tablica2);
        System.out.println(datess);


    }
}