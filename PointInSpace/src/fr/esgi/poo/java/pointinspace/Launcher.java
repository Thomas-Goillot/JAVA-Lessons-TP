package PointInSpace.src.fr.esgi.poo.java.pointinspace;

public class Launcher {

    public static void main(String[] args) {

        PointClass pointWithoutName = new PointClass(1, 2, 3);
        PointClass pointWithName = new PointClass(4, 5, 6, "point2");

        pointWithoutName.setX(10);
        pointWithoutName.setY(20);
        pointWithoutName.setZ(30);

        System.out.println("pointWithoutName: " + pointWithoutName);

        pointWithoutName.setXYZ(100, 200, 300);

        System.out.println("pointWithoutName: " + pointWithoutName);

        Integer[] xyz = pointWithoutName.getXYZ();

        System.out.println("pointName: " + pointWithName.getName());
        System.out.println("pointWithoutName x: " + xyz[0]);
        System.out.println("pointWithoutName y: " + xyz[1]);
        System.out.println("pointWithoutName z: " + xyz[2]);

        System.out.println(pointWithoutName.toString());

    }

}