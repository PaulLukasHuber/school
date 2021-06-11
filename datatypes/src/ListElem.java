public class ListElem {
    
    private Object inhalt;
    private ListElem next;

    public ListElem(Object i, ListElem n) {
        inhalt = i;
        next = n;
    }

    public ListElem(Object i) {
        inhalt = i;
        next = null;
    }

    public void setInhalt(Object i) {
        inhalt = i;
    }

    public void setNext(ListElem n) {
        next = n;
    }

    public Object getInhalt() {
        return inhalt;
    }

    public ListElem getNext() {
        return next;
    }
}
