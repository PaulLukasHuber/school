import java.util.Stack;

public class Cellar_Machine {
    //Attribute:
    int zustand;
    Stack st;

    //Konstruktor:
    public Cellar_Machine() {
        zustand = 0;
        st = new Stack();
        st.push('#');
    }


    public void zustandWechseln(char c) {
        switch (zustand) {
            case 0:
                switch (c) {
                    case '(':
                        switch ((char) st.peek()) {
                            case '#':
                                st.push('A');
                                zustand = 0;
                                break;
                            case 'A':
                                st.push('A');
                                zustand = 0;
                                break;
                            default:
                                zustand = 3;
                        }
                        break;
                    case ')':
                        zustand = 1;
                        st.pop();
                        break;
                    default:
                        zustand = 3;
                }
                break;
            case 1:
                switch (c) {
                    case '(':
                        zustand = 3;
                        break;
                    case ')':
                        switch ((char) st.peek()) {
                            case 'A':
                                st.pop();
                                zustand = 1;
                                break;
                            default:
                                zustand = 3;
                        }
                        break;
                    case ' ':
                        zustand = 2;
                        break;
                    default:
                        zustand = 3;
                }
                break;

            default:
                zustand = 3;

        }
    }//ende zustandWechseln


    public boolean wortPruefen(String eingabe) {
        int i;
        for (i = 0; i < eingabe.length(); i++) {
            zustandWechseln(eingabe.charAt(i));
        }
        if (zustand == 2) return true;
        else return false;
    }
}