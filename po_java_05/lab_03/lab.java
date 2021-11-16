package pl.Makowskim.po.lab00;
import java.util.Random;
import java.lang.Math;

public class Start {

    public static void generuj(int tab[], int n, int minVal, int maxVal){
        Random r = new Random();
        for(int i=0;i<n;i++)
        {
            if(minVal>0){
                tab[i]=r.nextInt(2*maxVal)-minVal;
            }else{
                tab[i]=r.nextInt(2*maxVal)+minVal;
            }

        }
    }
    public static void pokaz(int tab[]){
        for(int i=0;i<tab.length;i++){
            System.out.println(tab[i]);
        }
    }




    public static int ileNieparzystch(int tab[]){
        int wynik = 0;
        for(int i=0;i<tab.length;i++){
            if(Math.abs(tab[i])%2!=0){
                wynik++;
            }
        }
        return wynik;
    }
    public static int ileParzystch(int tab[]){
        int wynik = 0;
        for(int i=0;i<tab.length;i++){
            if(tab[i]%2==0){
                wynik++;
            }
        }
        return wynik;
    }
    public static int ileDodatnich(int tab[]){
        int wynik = 0;
        for(int i=0;i<tab.length;i++){
            if(tab[i]>=0){
                wynik++;
            }
        }
        return wynik;
    }
    public static int ileUjemncyh(int tab[]){
        int wynik = 0;
        for(int i=0;i<tab.length;i++){
            if(tab[i]<0){
                wynik++;
            }
        }
        return wynik;
    }
    public static int ileZerowych(int tab[]){
        int wynik = 0;
        for(int i=0;i<tab.length;i++){
            if(tab[i]==0){
                wynik++;
            }
        }
        return wynik;
    }
    public static int ileMaksymalnych(int tab[]){
        int wynik = 0;
        int max = 0;
        for(int j=0;j<tab.length;j++){
            if(tab[j]>max){
                max = tab[j];
            }
        }
        for(int i=0;i<tab.length;i++){
            if(tab[i]==max){
                wynik++;
            }
        }
        return wynik;
    }
    public static int sumaDodatnich(int tab[]){
        int wynik = 0;
        for(int i=0;i<tab.length;i++){
            if(tab[i]>=0){
                wynik=wynik+tab[i];
            }
        }
        return wynik;
    }
    public static int sumaUjemnych(int tab[]){
        int wynik = 0;
        for(int i=0;i<tab.length;i++){
            if(tab[i]<0){
                wynik=wynik+tab[i];
            }
        }
        return wynik;
    }
    public static int dlugoscMaksymalnegoCiaguDodatnich(int tab[]){
        int wynik = 0;
        for(int i=0;i<tab.length;i++){
            if(tab[i]>=0){
                int liczba = tab[i];
                int len = 0;
                while(liczba>0){
                    liczba = liczba/10;
                    len++;
                }
                if(len>wynik){
                    wynik = len;
                }

            }
        }
        return wynik;
    }
    public static void signum(int tab[]){
        for(int i=0;i<tab.length;i++) {
            if (tab[i] >= 0) {
                tab[i] = 1;
            }else{
                tab[i]=-1;
            }
        }
    }
    public static void odwrocFragment(int tab[],int lewy, int prawy) {
        int dif = 0;
        if(prawy<lewy){
            dif = tab.length-lewy+prawy;
        }
        else{
            dif=prawy-lewy;
        }
        if (dif % 2 != 0) {
            dif = dif -1;
        }
        for (int i = 0; i < dif; i++) {
            int bufor;
            if (prawy + i > tab.length) {
                bufor = tab[prawy + i - tab.length];
                tab[(prawy + i) - tab.length] = tab[lewy - i];
                tab[lewy - i] = bufor;

            } else if (lewy - i < 0) {
                bufor = tab[lewy - i];
                tab[tab.length + lewy - i] = tab[prawy + i];
                tab[prawy + i] = bufor;

            } else {
                bufor = tab[lewy + i];
                tab[lewy + i] = tab[prawy -i];
                tab[prawy - i] = bufor;
            }
        }
    }

    public static void generuj(int tab[][], int n, int m)
    {
        Random r = new Random();
        for(int i=0; i<tab.length; i++)
        {
            for(int j=0; j< tab.length; j++)
            {
                tab[i][j] = r.nextInt(20);
            }

        }
    }

    public static void wypisz(int tab[][])
    {
        for (int i = 0; i<tab[0].length; i++)
        {
            for (int j = 0; j<tab.length; j++)
            {
                System.out.print(tab[j][i] + ", ");
            }
            System.out.println();
        }
    }

    public static void mnozenie(int tab1[][], int tab2[][], int tab3[][])
    {
        for(int i=0;i<tab1.length;i++)
        {
            for(int j=0;j<tab2.length;j++)
            {
                int iloczyn =0;
                for(int k=0; k<tab3.length; k++)
                {
                    iloczyn += tab1[i][k] * tab2[k][j];
                }
                tab3[i][j] = iloczyn;
            }
        }
    }


    public static void main(String[] args){
        int n=5;
        int[] tab;
        tab = new int[n];
        int minVal = -100;
        int maxVal = 100;
        generuj(tab,n,minVal,maxVal);
        pokaz(tab);
        System.out.println(" ");
        System.out.println(ileNieparzystch(tab));
        System.out.println(ileParzystch(tab));
        System.out.println(ileDodatnich(tab));
        System.out.println(ileUjemncyh(tab));
        System.out.println(ileZerowych(tab));
        System.out.println(ileMaksymalnych(tab));
        System.out.println(sumaDodatnich(tab));
        System.out.println(sumaUjemnych(tab));
        System.out.println(dlugoscMaksymalnegoCiaguDodatnich(tab));
        odwrocFragment(tab,3,1);
        pokaz(tab);
        signum(tab);
        pokaz(tab);


        System.out.println("Podaj liczby m,n,k: ");
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int k = scan.nextInt();
        if(m<1 && m<11 && n<1 && n<11 && k<1 && k<11)
        {
            System.out.println("Podaj poprawna wartosc z zakresu [1:10]");
        }
        int[][] tab = new int[m][n];
        generuj(tab,m,n);
        wypisz(tab);
        int[][] tab2 = new int[n][k];
        generuj(tab2,n,k);
        wypisz(tab2);
        int[][] tab3 = new int[m][k];
        mnozenie(tab,tab2,tab3);
        wypisz(tab3)
    }

}