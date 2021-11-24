package pl.imiajd.makowski;

public class Osoba {
    private String nazwisko;
    private int rokUrodzenia;

    public Osoba(String nazwisko, int rokUrodzenia){
        this.nazwisko=nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public String toString(){
        return nazwisko+" "+rokUrodzenia;
    }

    public static void main(String[] args){
        Osoba a = new Osoba("Maciek",2000);
        System.out.println(a.toString());
        Student b = new Student("Maciek",2001,"informatyka");
        System.out.println(b.toString());
        Nauczyciel c = new Nauczyciel("Maciek",1999,3000);
        System.out.println(c.toString());
    }


}


class Student extends Osoba{
    private String kierunek;

    public Student(String nazwisko, int rokUrodzenia, String kierunek) {
        super(nazwisko, rokUrodzenia);
        this.kierunek = kierunek;
    }

    public String toString(){
        return super.toString()+" "+kierunek;
    }

}




class Nauczyciel extends Osoba{
    private int pensja;
    public Nauczyciel(String nazwisko, int rokUrodzenia, int pensja){
        super(nazwisko, rokUrodzenia);
        this.pensja = pensja;
    }
    public String toString(){

        return super.toString()+" "+pensja;
    }
}

