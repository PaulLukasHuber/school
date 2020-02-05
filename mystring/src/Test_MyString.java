import java.util.Arrays;

public class Test_MyString {

    public static void main(String[] args) {

        MyString ms1,ms2,ms3,ms4;
        //String 1
        ms1 = new MyString();
        char [] t = {'H','a','l','l','o'};
        ms1.setText(t);
        System.out.println(Arrays.toString(ms1.getText()) +","+ms1.getLth());

        //String 2
        ms2 = new MyString();
        char[] s = {'M','i','t','t','w','o','c','h'};
        ms2.setText(s);

        //CharAt

        System.out.println("1. Zeichen: "+ms1.charAt(0));
        System.out.println("3. Zeichen: "+ms1.charAt(3));
        System.out.println("letztes Zeichen: "+ms1.charAt(ms1.getLth() - 1));
        System.out.println("Verboten: "+ms1.charAt(ms1.getLth()));

        if (ms1.charAt(ms1.getLth())== Character.MIN_VALUE){
            System.out.println ("verbotene Positionen");
        }else{
            System.out.println("Fehler in charAt");
        }
        }
}