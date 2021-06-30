public class Person {

    private String vorname;
    private String nachname;
    private String[] hobbies;


    public Person(String v, String n) {
        int i;
        vorname = v;
        nachname = n;
        hobbies = new String[3];
        for (i = 0; i < 3; i++) {
            hobbies[i] = "";
        } // end of for

    }

    public void setVorname(String v) {
        vorname = v;
    }

    public void setNachname(String n) {
        nachname = n;
    }

    public void addHobby(String h) {
        int i = 0;
        while (!hobbies[i].equals("")) {
            i++;
        } // end of while
        hobbies[i] = h;

    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getHobby(int index) {
        return hobbies[index];
    }


    public void drucke() {
        int i;
        System.out.print("Vorname: " + vorname);
        System.out.print(" Nachname: " + nachname + "; ");
        for (i = 0; i < 3; i++) {
            System.out.print(hobbies[i] + ", ");
        } // end of for
        System.out.println();
    }


}//Ende PErson
    
    
  
  
