package FirstProject.src.fr.esgi.poo.java.firstproject;

import java.lang.Integer;

public class MySampleClass {

    public static final double PI = 3.14159265358979323846; // constante
    public Integer myNumber; // attribut type objet
    public int toto;
    private boolean is0K; // attribut type primitif

    // Constructor
    public MySampleClass(Integer myNumber) {
        this.myNumber = myNumber;
        this.is0K = true;
    }

    public Integer getMyNumber() {
        return this.myNumber;
    }

    public void setMyNumber(Integer myNumber) {
        this.myNumber = myNumber;
    }

    public boolean getIs0K() {
        return this.is0K;
    }

    public void setIs0K(boolean is0K) {
        this.is0K = is0K;
    }


}