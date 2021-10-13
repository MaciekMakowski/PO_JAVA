package pl.Makowskim.po.lab00;
import java.lang.Math.*;
import java.util.Scanner;

public class Start {

    public static int[] wczytaj(int n){
        int[] tab = new int[n];
        for(int i = 0; i<n;i++){
            Scanner myObj = new Scanner(System.in);
            System.out.println("Podaj liczbe: ");
            String input = myObj.nextLine();
            tab[i]=Integer.parseInt(input);
        }
        return tab;
    }
    public static int silnia(int n){
        int suma = 1;
        if(n==2)
            return 2;
        for(int i=1;i<=n;i++) {
            suma = suma * i;
        }
        return suma;
    }
/// Zadania część 1
    public static void zad1(int[] tab,int n){
        int suma = 0;
    for(int i=0;i<n;i++){
        suma = suma + tab[i];
    }
    System.out.println(suma);
    }
    public static void zad2(int[] tab,int n){
        int suma = 1;
        for(int i=0;i<n;i++){
            suma = suma * tab[i];
        }
        System.out.println(suma);
    }
    public static void zad3(int[] tab,int n){
        int suma = 0;
        for(int i=0;i<n;i++){
            suma = suma + Math.abs(tab[i]);
        }
        System.out.println(suma);
    }
    public static void zad4(int[] tab,int n){
        double suma = 0;
        for(int i=0;i<n;i++){
            suma = suma + Math.sqrt(Math.abs(tab[i]));
        }
        System.out.println(suma);
    }
    public static void zad5(int[] tab,int n){
        int suma = 1;
        for(int i=0;i<n;i++){
            suma = suma * Math.abs(tab[i]);
        }
        System.out.println(suma);
    }
    public static void zad6(int[] tab,int n){
        double suma = 0;
        for(int i=0;i<n;i++){
            suma = suma + Math.pow(tab[i],2);
        }
        System.out.println(suma);
    }
    public static void zad7(int[] tab,int n){
        int suma = 0;
        int iloczyn = 1;
        for(int i=0;i<n;i++){
            suma = suma + tab[i];
            iloczyn = iloczyn * tab[i];
        }
        System.out.println(suma+" "+iloczyn);
    }
    public static void zad8(int[] tab,int n){
        double suma = 0;
        for(int i=0;i<n;i++){
            if( i % 2 == 0) {
                suma = suma + tab[i];
            }else{
                suma = suma - tab[i];
            }

        }
        System.out.println(suma);
    }
    public static void zad9(int[] tab,int n){
        double suma = 0;
        for(int i=0;i<n;i++){
            if( i % 2 == 1) {
                suma = suma + (tab[i]/silnia(i));
            }else{
                suma = suma - (tab[i]/silnia(i));
            }
        }
        System.out.println(suma);
    }
    public static void zad10(int[] tab,int n){
        int last = tab[0];
        for(int i=0;i<n-1;i++){
        tab[i]=tab[i+1];
        if(i+1==n-1){
            tab[i+1]=last;

        }
        }
        for(int j =0; j<n;j++)
        {
            System.out.println(tab[j]);
        }
    }
    // Zadania część 2
    public static void zad2_1_1(int[] tab,int n){
        int suma = 0;
        for(int i=0;i<n;i++){
            if(tab[i]%2==1){
                suma++;
            }
        }
        System.out.println(suma);
    }
    public static void zad2_1_2(int[] tab,int n){
        int suma = 0;
        for(int i=0;i<n;i++){
            if(tab[i]%3==0){
                if(tab[i]%5!=0){
                    suma++;
                }
            }
        }
        System.out.println(suma);
    }
    public static void zad2_1_3(int[] tab,int n){
        int suma = 0;
        for(int i=0;i<n;i++){
            if(Math.sqrt(tab[i])%2==0){
                    suma++;
            }
        }
        System.out.println(suma);
    }
    public static void zad2_1_4(int[] tab,int n){
        int suma = 0;
        int ak;
        for(int i=2;i<n-1;i++){
            ak = (tab[i-1]+tab[i+1])/2;
            if(tab[i]<ak){
                suma++;
            }

        }
        System.out.println(suma);
    }
    public static void zad2_1_5(int[] tab,int n){
        int suma = 0;
        for(int i=0;i<n;i++){
            double dwojka = Math.pow(2,i+1);
            double silnia = silnia(i+1);
                if(dwojka<tab[i] && tab[i]<silnia){
                    suma++;
                }
            }

        System.out.println(suma);
    }
    public static void zad2_1_6(int[] tab,int n) {
        int suma = 0;
        for (int i = 0; i < n; i++) {
        if(i+1%2==1){
            if(tab[i]%2==0){
                suma++;
            }
        }
        }
        System.out.println(suma);

    }
    public static void zad2_2(int[] tab,int n) {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            if(tab[i]%2==0) {
                suma = suma + tab[i];
            }
        }
        System.out.println(2*suma);
    }
    public static void zad2_3(int[] tab,int n) {
        int sumaDod = 0;
        int sumaUje = 0;
        int sumaZer = 0;
        for (int i = 0; i < n; i++) {
            if(tab[i]>0){
                sumaDod++;
            }
            if(tab[i]<0){
                sumaUje++;
            }
            if(tab[i]==0){
                sumaZer++;
            }
        }
        System.out.println(sumaDod+" "+sumaUje+" "+sumaZer);
    }
    public static void zad2_4(int[] tab,int n) {
        int min = tab[0];
        int max = tab[0];
        for (int i = 0; i < n; i++) {
            if(tab[i]<min){
                min=tab[i];
            }
            if(tab[i]>max){
                max=tab[i];
            }
        }
        System.out.println(min+" "+max);
    }
    public static void zad2_5(int[] tab,int n) {
        int suma =0;
       for(int i =0; i<n-1;i++){
           if(tab[i]*tab[i+1]>0){
               suma++;
           }
       }
        System.out.println(suma);
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Podaj n: ");
        String input = myObj.nextLine();
        int n = Integer.parseInt(input);
//    wczytaj(n);
        int[] tab = {10, 2, -3, 64, 40, 4};
        zad1(tab, n);
        zad2(tab, n);
        zad3(tab, n);
        zad4(tab, n);
        zad5(tab, n);
        zad6(tab, n);
        zad7(tab, n);
        zad8(tab, n);
        zad9(tab, n);
//    zad10(tab,n);
        zad2_1_1(tab, n);
        zad2_1_2(tab, n);
        zad2_1_3(tab, n);
        zad2_1_4(tab, n);
        zad2_1_5(tab, n);
        zad2_1_6(tab, n);
        zad2_2(tab,n);
        zad2_3(tab,n);
        zad2_4(tab,n);
        zad2_5(tab,n);

    }
}
