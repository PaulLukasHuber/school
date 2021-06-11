public class Sohn extends Vater  {
    double zahl;

    public Sohn(){
        super();    //Aufruf des Standart Vater Konstuktors
    }

    public Sohn (double d) {
        zahl = d;   //Default Vater Konstrukter wird implizit aufgerufen
    }

    public Sohn (String s, int i, double d){
        super(s,i);
    }
}
