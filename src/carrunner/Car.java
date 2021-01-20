package carrunner;

/**
 *
 * @author HP
 */
public class Car {

    private double milesDriven;

    private double changeOil;

    /**
     * Constructor With Parameters.
     *
     * @param milesDriven
     * @param changeOil
     */
    public Car(double milesDriven, double changeOil) {
        this.milesDriven = milesDriven;
        this.changeOil = changeOil;
    }

    /**
     * Get the value of changeOil
     *
     * @return the value of changeOil
     */
    public double getChangeOil() {
        return changeOil;
    }

    /**
     * Set the value of changeOil
     *
     * @param changeOil new value of changeOil
     */
    public void setChangeOil(double changeOil) {
        this.changeOil = changeOil;
    }

    /**
     * Get the value of milesDriven
     *
     * @return the value of milesDriven
     */
    public double getMilesDriven() {
        return milesDriven;
    }

    /**
     * Set the value of milesDriven
     *
     * @param milesDriven new value of milesDriven
     */
    public void setMilesDriven(double milesDriven) {
        this.milesDriven = milesDriven;
    }

    /**
     * Check If its time to change oil method
     *
     * @return boolean
     */
    public boolean timeForOilChange() {
        if (getMilesDriven() >= getChangeOil()) {
            //Reset Mileage To 0
            setMilesDriven(0);
            return true;

        }
        return false;
    }

    /**
     * addMiles Method.
     *
     * @param miles
     */
    public void addMiles(double miles) {
        //Add miles
        this.milesDriven += miles;

    }

}
