/* This java file contains the Router class, with its attributes, constructors and methods. A main method has not been defined in this file.
Therefore, running it leads to a run-time error. Object of the Router class is created and used in another file called TestPolymorphism in the same directory.
This is done for clarity of code for the examiner. 

Name: Dikshyanta Uprety
Task 3.2

*/
class Router extends Gadget {
    //Attributes
    private String signalStrength;                   //The strength of the signal of the router, compared to other routers ("Weak", "Average", "Strong")
    private String maxSpeed;                         // This is the maximum speed the router is capable of

    //Constructors
    //Constructor without arguements
    public Router() {

    }

    //Parameterized constructor
    public Router( int quantityInStock, double price, String gadgetCode, String signalStrength, String maxSpeed) {
        super( quantityInStock, price, gadgetCode);
        this.signalStrength= signalStrength;
        this.maxSpeed= maxSpeed;
    }

    //setter method for setting signalStrength
    public void setSignalStrength(String signalStrength) {
        this.signalStrength= signalStrength;
    }

    //getter method for returning brand
    public String getSignalStrength() {
        return signalStrength;
    }

    //setter method for setting maxSpeed
    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    //getter method for getting maxSpeed
    public String getMaxSpeed() {
        return maxSpeed;
    }

    //Override the getGadgetName() and getGadgetDescription methods
    @Override
    public String getGadgetName() {
        return ("Router");
    }

    @Override
    public String getGadgetDescription() {
        return ("Standardized routers compatible with all Internet Service Providers");
    }

    //Override the toString method to include Signal Strength and Maximum speed. Use to super keyword to resue the toString() method of Gadget class.
    @Override
    public String toString() {
        return (super.toString()+"\n Relative Signal Strength: "+getSignalStrength()+"\n Maximum Speed: "+getMaxSpeed());
    }
}