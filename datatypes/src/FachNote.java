import java.util.Arrays;

public class FachNote {

    //Attributes
    private String fach;
    private int note;

    //Constructor
    public FachNote(String f, int n){
        fach = f;
        note = n;
    }

    //Getter,Setter
    public String getFach() {
        return fach;
    }

    public int getNote() {
        return note;
    }

    public void setFach(String f) {
        fach = f;
    }

    public void setNote(int n) {
        note = n;
    }

    //ArrayPrinter
    // System.out.println(Arrays.toString(FELD));
}
