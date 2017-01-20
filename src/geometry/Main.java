/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

/**
 *
 * @author client
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Point x=new Point(6,4);
        Point y=new Point(-2,2);
        
        System.out.println("Vzdialenost bodu od 0: "+x.getDistance());
        System.out.println("Vzdialenost bodu od 0: "+x.getDistanceFromOtherPoint(y));
        System.out.println(x.toString());
        
    }
    
}
