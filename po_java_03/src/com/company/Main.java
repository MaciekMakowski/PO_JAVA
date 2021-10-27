package com.company;
import java.lang.StringBuffer;

public class Main {

    public static int countChar(String str, char c){
        int wynik = 0;
        str = str.toLowerCase();
        for(int i=0; i<str.length();i++){
            char check_char = str.charAt(i);
            if(check_char == c){
                wynik+=1;
            }
        }
        return wynik;
    }
    public static int countSubStr(String str, String subStr){
        int wynik = 0;
        int len = subStr.length();
        for(int i=0; i<=str.length()-len;i++){
            String new_str = str.substring(i,len+i).toLowerCase();
            if(new_str.equals(subStr.toLowerCase())){
                wynik+=1;
            }
        }
        return wynik;
    }
    public static String middle(String str){
        int len = str.length();
        if(len%2!=0){
            return Character.toString(str.charAt(len/2));
        }else{
                String wynik = str.charAt(len/2-1)+""+str.charAt(len/2);
                return wynik;
        }
    }

    public static String repeat(String str, int n){
        String new_str = "";
        for(int i=0; i<n;i++){
            new_str = new_str+str;
        }
        return new_str;
    }
    public static int[] where(String str, String subStr) {
        int len = subStr.length();
        int[] tab = new int[countSubStr(str, subStr)*2];
        int n=0;
        for (int i = 0; i <= str.length() - len; i++) {
            String new_str = str.substring(i, len + i).toLowerCase();
            if(new_str.equals(subStr.toLowerCase())){
            tab[n]=i;
            tab[n+1]=len-1+i;
            n+=2;
            }
        }
        return tab;
    }
    public static void pokaz(int[] tab){
        for(int i =0; i<tab.length;i+=2){
            System.out.print(tab[i] + " " + tab[i + 1] + "\n");
        }
    }

    public static String change(String str){
        StringBuffer new_str = new StringBuffer();
        for(int i=0;i<str.length();i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                char new_letter = Character.toLowerCase(str.charAt(i));
                new_str.append(new_letter);
            }else{
                char new_letter = Character.toUpperCase(str.charAt(i));
                new_str.append(new_letter);
            }

        }
        String wynik= new_str.toString();
        return wynik;
    }
    public static String nice(String str, int n,String sep){
        int len = str.length();
        StringBuffer new_str = new StringBuffer();
        for(int j = len-1, i=0; j >=0 ; j--,i++) {
            if (i % n == 0 && i != 0) {
                new_str.append(sep+" ");
            }
            new_str.append(str.charAt(j));
        }
        new_str.reverse();
        String wynik = new_str.toString();
        return wynik;
    }




    public static void main(String[] args) {
	System.out.println(countChar("Mleko",'m'));
	System.out.println(countSubStr("Mlelekoleko","le"));
	System.out.println(middle("middle"));
	System.out.println(repeat("ho",3));
	pokaz(where("hohosobiehoe","ho"));
	System.out.println(change("jaJkoS"));
	System.out.println(nice("12345672",3,","));

    }
}
