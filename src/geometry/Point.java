/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

import java.util.Random;

/**
 *
 * @author client
 */
public class Point {
   private double x;
   private double y;
   private char name;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }
   
    public Quadrant getQuadrant(){
        if(x>0 && y>0)
            return Quadrant.I;
        else if(x<0 && y>0)
            return Quadrant.II;
        else if(x<0 && y<0)
            return Quadrant.III;
        else if(x>0 && y<0)
            return Quadrant.IV;
        else
            return Quadrant.NONE;
    }
    
    public double getDistance(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y, 2));
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        this.name='A';
    }

    public Point() {
        x=y=0;
        this.name='A';
    }
    
    public Point(double x) {
        this.x=this.y=x;
        this.name='A';
    }
    
    public Point(Point otherPoint){
        this.x=otherPoint.getX();
        this.y=otherPoint.getY();
        this.name=otherPoint.getName();
    }
    
    public double getDistanceFromOtherPoint(Point otherPoint){
        return Math.sqrt(Math.pow(x-otherPoint.getX(),2)+
                Math.pow(y-otherPoint.getY(), 2));
    }
    
    public void randomPosition(){
        Random rnd=new Random();
        x=(double)rnd.nextInt(41)-20;
        y=(double)rnd.nextInt(41)-20;
    }

    @Override
    public String toString() {
        return "Point "+name+" [x="+x+" ,y="+y+"]";
    }
    
    public boolean isTheSameQuadrant(Point otherPoint){
        if(this.getQuadrant()==otherPoint.getQuadrant()
                && this.getQuadrant()!= Quadrant.NONE)
            return true;
        else
            return false;
    }
    public void moveToCentralSymmetry(){
        x *= -1;
        y *= -1;
    }
    public void moveToCentralSymmetry(Point middlePoint){
        this.x=middlePoint.getX()+(middlePoint.getX()-this.x);
        this.y=middlePoint.getY()+(middlePoint.getY()-this.y);
    }
    public void lineSymmetryY(char axis) {
        switch(axis){
            case "y":
            case "y": x=-x; break;
            case "x":
            case "x": y=-y; break;
            default: System.out.println("Issue with lineSymmetry," 
                    + "incorrect parameter: "+axis);
        }
    }
    public void Point3() {
        
    }
    
    public Point clonePoint(){
        Point newPoint=new Point(this.x,this.y);
        newPoint.setName(this.name);
        return newPoint;
    }
    
    
}
