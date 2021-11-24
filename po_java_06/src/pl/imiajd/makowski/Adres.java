package pl.imiajd.makowski;

public class Adres {
    private String ulica;
    private int numerDomu;
    private int numerMieszkania=0;
    private String miasto;
    private String kodPocztowy;

    public void Adres(String ulica, int numerDomu, int  numerMieszkania ,String miasto, String  kodPocztowy){
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.numerMieszkania = numerMieszkania;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }
    public void Adres(String ulica, int numerDomu, String miasto, String  kodPocztowy){
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }

    public void pokaz(){
        System.out.println(kodPocztowy+" "+miasto+"\n");
        System.out.println(ulica+" "+numerDomu+" ");
        if(numerMieszkania>0)System.out.print(numerMieszkania);
    }

    public boolean przed(String podanyKod){
        String kod = this.kodPocztowy;
        String nowykod = podanyKod;
        kod.replace("-","");
        nowykod.replace("-","");
        if(Integer.parseInt(kod)<Integer.parseInt(nowykod)){
            return false;
        }else return true;
    }
}
