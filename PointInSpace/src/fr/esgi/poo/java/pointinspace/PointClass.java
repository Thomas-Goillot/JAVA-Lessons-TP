package PointInSpace.src.fr.esgi.poo.java.pointinspace;

import java.lang.Integer;

public class PointClass {

    private Integer x;
    private Integer y;
    private Integer z;
    private String name;

    public PointClass(Integer x, Integer y, Integer z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public PointClass(Integer x, Integer y, Integer z, String name) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }

    public PointClass() {
        this.x = 1;
        this.y = 2;
        this.z = 3;
        this.name = "DEfault point";
    }

    public Integer getX() {
        return this.x;
    }

    public Integer getY() {
        return this.y;
    }

    public Integer getZ() {
        return this.z;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    public void setXYZ(Integer x, Integer y, Integer z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString() {
        return "PointClass [x=" + this.x + ", y=" + this.y + ", z=" + this.z + "]";
    }

    public Integer[] getXYZ() {
        Integer[] xyz = {this.x, this.y, this.z};
        return xyz;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}