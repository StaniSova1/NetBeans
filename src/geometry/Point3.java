/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

/**
 *
 * @author Stanislav
 */
public class Point3 extends Point {
    private double z;
    
    public double getZ() {
        return z;
    }
    public void setZ(double z) {
        this.z=z;
    }
    @Override
    public double getDistance() {
        return Math.sqrt(z*z+getX()*getX()*getY()*getY());
    }
    @Override
    public String toString() {
        return "Point "+getName()+" [x="+getX()+" ,y="+getY()+",z="+z+"]";
    }
    
    
}
