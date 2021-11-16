import java.util.Random;
import java.lang.Math;
import java.util.Scanner;

public class RachunekBankowy {
    public static double rocznaStopaProcentowa;
    private double saldo;

    double obliczMiesieczneOdsetki()
    {
        saldo = saldo+(saldo*rocznaStopaProcentowa)/12;
        return (saldo*rocznaStopaProcentowa)/12;
    }
    static void setStopaProcentowa(double nowa){
        rocznaStopaProcentowa = nowa;
    }
public static void main(String[] args){
        RachunekBankowy saver1 = new RachunekBankowy();
        RachunekBankowy saver2 = new RachunekBankowy();
        saver1.saldo=2000;
        saver2.saldo=3000;
        setStopaProcentowa(0.04);
        System.out.println(saver1.obliczMiesieczneOdsetki());
        System.out.println(saver2.obliczMiesieczneOdsetki());
        System.out.println(saver1.saldo);
        System.out.println(saver2.saldo);
        setStopaProcentowa(0.05);
        System.out.println('\n');
        System.out.println(saver1.obliczMiesieczneOdsetki());
        System.out.println(saver2.obliczMiesieczneOdsetki());
        System.out.println(saver1.saldo);
        System.out.println(saver2.saldo);

}

}