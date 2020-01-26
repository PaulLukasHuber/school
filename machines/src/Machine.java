public class Machine {
    //Attribute:
    int zustand;
    // Operationen:

    //Konstruktor:
    public Machine() {
        zustand = 0;
    }


    public void zustandWechseln(char c) {
        switch(zustand) {
            case 0: switch(c) {
                case 'a': zustand = 0;break;
                case 'b': zustand = 1;break;
                default: zustand=2;
            }
                break;
            case 1: switch(c) {
                case 'c': zustand = 1;break;
                default: zustand =2;
            }
                break;
            default: zustand = 2;

        }
    }//ende zustandWechseln


    public boolean wortPruefen(String s) {
        int i;
        for(i=0;i<s.length();i++) {
            zustandWechseln(s.charAt(i));
        }
        if(zustand==1) return true;
        else return false;
    }
}