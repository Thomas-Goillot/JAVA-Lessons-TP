package bike.src.fr.esgi.poo.java.bike;

public class Main {

    public final static Integer NUMBER_OF_BIKES = 5;

    public static void main(String[] args) {


        Bike[] bikes = new Bike[NUMBER_OF_BIKES];

        for (int i = 0; i < NUMBER_OF_BIKES; i++) {
            bikes[i] = new Bike("Bike " + i);
        }

        for (int i = 0; i < bikes.length; i++) {
            System.out.println(bikes[i].display());
        }

        Bike.defaultWhellCount = 3;

        for (int i = 0; i < bikes.length; i++) {
            System.out.println(bikes[i].display());
        }
 
    }

}