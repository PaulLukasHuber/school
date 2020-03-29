
public class MyString {

    //Attributes
    private char [] text;
    private int lth; //Length

    //Constructors
    public MyString(){

        text = new char[20];
        lth = 0;
    }

    public MyString(int l){

        text = new char [l];
        lth = 0;
    }

    //getter setter
    public char[] getText() {
        return text;
    }
    public int getLth() {
        return lth;
    }
    public void setText(char[] t) {
        text = t;
        lth = t.length;
    }
    public void setLth(int l) {
        lth = l;
    }

    //CharAt / SetCharAt
    public char charAt (int pos){
        if (pos <=lth && pos >= '0') {
            return text[pos];
        }
        else{
            return Character.MIN_VALUE;
        }
    }
    public boolean setCharAt(int pos, char t) {
        try {
            text[pos] = t;
            return true;
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }

    //Equals
    public boolean equals (MyString s){
        int i;
        if (lth == s.getLth()){
            for (i = 0;i < lth; i++){
                if (text [i] != s.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
        else return false;
    }

    //Compare
    public int compare (MyString s){
        int l = 0;
        if (lth < s.getLth()){
            l = lth;
        }
        else{
            l = s.getLth();
        }
        for (int i = 0; i < l -1; i++){
            if (text[1] < s.charAt(i)){
                return 1;
            }
            else{
                if (text [i] > s.charAt(i)){
                    return -1;
                }
                else{
                }
            }
        }
        if (lth == s.getLth()){
            return 0;
        }
        else {
            if (lth > s.getLth()){
                return -1;
            }
            else{
                return 1;
            }
        }
    }
    //Concat
    public void concat (MyString s2){
        int l1 = getLth();
        int l2 = l1 + lth;

        if (l2 > 20){
            char [] h = new char[l2];
            for (int i=0;i<lth-1;i++){
                h[i] = text[i];
            }
            for (int i=0;i<l1-1;i++){
                h[lth+i] = s2.charAt(i);
            }
            text = h;
            lth = l2;
        }else {
            for (int i=0;i<l1;i++){
                text[lth+1]=s2.charAt(i);
            }
            lth=l2;
        }
    }

}