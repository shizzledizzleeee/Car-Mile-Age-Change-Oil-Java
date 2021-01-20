/*
 * CarRunner
 */
package carrunner;

/**
 *
 * @author HP
 */
public class CarRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Car  c = new Car(9000, 3000);
        
        System.out.println(c.timeForOilChange());
        c.addMiles(2000);
        System.out.println(c.timeForOilChange());
        
        c.addMiles(2000);
        System.out.println(c.timeForOilChange());
    }
    
}
