public class MeineVListe {

    private final ListElem kopf;
    private final int laenge;

    public MeineVListe(Object i) {
        kopf = new ListElem(i);
        laenge = 1;
    }

    public MeineVListe() {
        kopf = null;
        laenge = 0;
    }

    public void append(Object i) {
        new ListElem(i);
    }

    public boolean delete(int pos) {
        ListElem hilf1 = kopf;
        ListElem hilf2 = kopf;

        if (laenge < pos - 1) {
            return false;
        } else {
            for (int i = 1; i < pos - 1; i++) {
                hilf1 = hilf1.getNext();
                hilf2 = hilf2.getNext();
            }
            hilf1 = hilf1.getNext();
            hilf2.setNext(hilf1.getNext());
        }
        return true;
    }

    public boolean setItem(int pos, Object inhalt) {
        ListElem hilf = null;
        if (laenge < pos - 1) {
            return false;
        } else {
            for (int i = 1; i < pos; i++) {
                hilf = hilf.getNext();
            }
            hilf.setInhalt(inhalt);
            return true;
        }
    }

    public Object getItem(int pos) {
        ListElem hilf = null;
        if (laenge < pos - 1) {
            return null;
        } else {
            for (int i = 1; i < pos; i++) {
                hilf = hilf.getNext();
            }
            return hilf.getInhalt();
        }
    }

    public void insertAt(int pos, Object i) {

    }

    public boolean isEmpty() {
        return kopf == null;
    }

    public int getLength() {
        return laenge;
        /**
         ListElem hilf;
         int anzahl = 0;

         hilf = kopf;

         if (hilf == null) return 0;

         while (hilf.getNext() != null) {
         anzahl = anzahl + 1;
         hilf = hilf.getNext();
         }
         anzahl = anzahl + 1;
         return anzahl;
         */
    }
}
