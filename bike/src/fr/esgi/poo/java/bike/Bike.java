package bike.src.fr.esgi.poo.java.bike;

import java.lang.Integer;

public class Bike {

    public static Integer defaultWhellCount = 2;

    public Integer whellCount;
    private String label;

    public Bike(String label) {
        this.label = label;
    }

    public String display() {
        return this.label + " has " + this.whellCount + " whells" + " and " + Bike.defaultWhellCount + " default whells";
    }


}
