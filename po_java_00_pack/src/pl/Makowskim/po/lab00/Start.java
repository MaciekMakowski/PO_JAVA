package pl.Makowskim.po.lab00;

public class Start {

    public static void zad1(){
        System.out.println("\nZad1");
        System.out.println(62+29);
    }

    public static void zad2(){
        System.out.println("\nZad2");
        int i=0;
        int suma = 0;
        while(i<10){
            i++;
            suma = suma + i ;
        }
        System.out.println(suma);
    }
    public static void zad3(){
        System.out.println("\nZad3");
        int i=0;
        int il = 1;
        while(i<10){
            i++;
            il = il * i ;
        }
        System.out.println(il);
    }

    public static void zad4(){
        System.out.println("\nZad4");
        double saldo = 1000;
        int i = 0;
        while(i<3){
            saldo=saldo+saldo*0.06;
            System.out.println(saldo);
            i++;
        }
    }
    public static void zad5(){
        System.out.println("\nZad5");
        System.out.println("------");
        System.out.println("|JAVA|");
        System.out.println("------");
    }
    public static void zad6(String img, String img2){
        System.out.println("\nZad6");
        System.out.println("  ///// ");
        System.out.println(" +"+img+img+img+img+img+"+");
        System.out.println("(| o o |)");
        System.out.println("  | "+img2+" |  ");
        System.out.println(" | `-' | ");
        System.out.println(" +-----+");
    }

    public static void zad10(){
        System.out.println("\nZad10");
        System.out.println("Kowalski");
        System.out.println("Nowak");
        System.out.println("Psikuta");

    }
    public static void zad11(){
        System.out.println("\nZad11");
        System.out.println("Mam trzy latka trzy i pół\n" +
                "brodą sięgam ponad stół.\n" +
                "Mam fartuszek z muchomorkiem\n" +
                "do przedszkola chodzę z workiem.\n" +
                "Pantofelki ładnie zmieniam\n" +
                "myję rączki do jedzenia.\n" +
                "Zjadam wszystko z talerzyka\n" +
                "tańczę, kiedy gra muzyka.");
    }
    public static void zad12(){
    System.out.println("\nZad12");
    System.out.println("* * * * * *========================");
    System.out.println(" * * * * * ========================");
    System.out.println("* * * * * *========================\n"+
                       " * * * * * ========================\n"+
                       "* * * * * *========================\n"+
                       " * * * * * ========================\n"+
                       "* * * * * *========================\n"+
                       " * * * * * ========================\n"+
                       "* * * * * *========================\n");

    }

    public static void main(String[] args){
        String img = new StringBuilder().appendCodePoint(34).toString();
        String img2 = new StringBuilder().appendCodePoint(664).toString();
        zad1();
        zad2();
        zad3();
        zad4();
        zad5();
        zad6(img,img2);
        zad10();
        zad11();
        zad12();
    }

}
