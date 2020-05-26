public class FachNote {

    //Attributes
    private String fach;
    private int note;

    //Constructor
    public FachNote(String f, int n) {
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

    public void drucke() {
        System.out.println("Fach: " + fach);
        System.out.println("Note: " + note);
    }
}
