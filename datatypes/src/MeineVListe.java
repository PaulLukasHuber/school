public class MeineVListe {

    private ListElem kopf;
    private int laenge;

    public MeineVListe(Object i) {
        kopf = new ListElem(i);
        laenge = 1;
    }

    public MeineVListe() {
        kopf = null;
        laenge = 0;
    }

    public void append(Object i) {

        ListElem neu = new ListElem(i);

        if (laenge == 0) {
            kopf = neu;
        } else {
            ListElem hilf = kopf;
            for (int z = 0; z < laenge - 1; z++) {
                hilf = hilf.getNext();
            }
            hilf.setNext(neu);

        }
        laenge = laenge + 1;
        return;
    }

    public boolean delete(int pos) {
        ListElem hilf1 = kopf;
        ListElem hilf2 = kopf;

        if (laenge < pos - 1) {
            return false;
        } else {

            if (pos == 0) kopf = kopf.getNext();
            
            for (int i = 1; i < pos - 1; i++) {
                hilf1 = hilf1.getNext();
                hilf2 = hilf2.getNext();
            }
            hilf1 = hilf1.getNext();
            hilf2.setNext(hilf1.getNext());
        }
        laenge = laenge - 1;
        return true;
    }

    public boolean setItem(int pos, Object inhalt) {
        ListElem hilf = kopf;
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
        ListElem hilf = kopf;
        if (laenge < pos - 1) {
            return null;
        } else {
            for (int i = 0; i < pos; i++) {
                hilf = hilf.getNext();
            }
            return hilf.getInhalt();
        }
    }

    public boolean insertAt(int pos, Object i) {

        ListElem hilf = kopf;
        ListElem neu = new ListElem(i);

        if (laenge <= pos) {
            return false;
        } else {
            if (pos == 0) {
                neu.setNext(kopf);
                kopf = neu;
            } else {
                for (int z = 0; z < pos - 1; z++) {
                    hilf = hilf.getNext();
                }
                neu.setNext(hilf.getNext());
                hilf.setNext(neu);
            }
        }
        laenge = laenge + 1;
        return true;
    }

    public boolean isEmpty() {
        return kopf == null;
    }

    public int getLength() {
        return laenge;
        /*
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

    public void drucke() {

        ListElem lauf;
        lauf = kopf;

        if (lauf == null) {
            System.out.println("Liste ist leer");
        } else {
            while (lauf != null) {
                System.out.println(lauf.getInhalt());
                lauf = lauf.getNext();
            }
        }
    }
}
