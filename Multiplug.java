/* This java file contains the Multiplug class, with its attributes, constructors and methods. A main method has not been defined in this file.
Therefore, running it leads to a run-time error. Object of the Multiplug class is created and used in another file called TestPolymorphism in the same directory.
This is done for clarity of code for the examiner. 

Name: Dikshyanta Uprety
Task 3.2

*/
public class Multiplug extends Gadget {
    //Attributes
    private boolean isFused;                          //A boolean data member that is true if the multiplug has a fuse, otherwise false 
    private int maxConnection;                        // This is the maximum number of devices that can be connected at once to the multiplug

    //Constructors
    //Constructor without arguements
    public Multiplug() {

    }

    //Parameterized constructor
    public Multiplug( int quantityInStock, double price, String gadgetCode, boolean isFused, int maxConnection) {
        super( quantityInStock, price, gadgetCode);
        this.isFused= isFused;
        this.maxConnection= maxConnection;
    }

    //setter method for setting isFused
    public void setisFused(boolean isFused) {
        this.isFused = isFused;
    }

    //getter method for getting isFused
    public boolean getIsFused() {
        return isFused;
    }

    //setter method for maxConnection
    public void setMaxConnection(int maxConnection) {
        this.maxConnection = maxConnection;
    }

    //getter method for maxConnection
    public int getMaxConnection() {
        return maxConnection;
    }

    //Override the getGadgetName() and getGadgetDescription() method
    @Override
    public String getGadgetName() {
        return ("Multiplug");
    }

    @Override
    public String getGadgetDescription() {
        return ("High quality multiplugs in variety of sizes and colors");
    }

    //Override the toString() method to include brand, whether the multiplug is fused and maximum connections to the plug at once. Used super keyword to
    // reuse the toString() method of the Gadget class (parent class)
    @Override
    public String toString() {
        return (super.toString()+"\n Multiplug is fused? true or false: "+getIsFused()+ "\n Maximum synchronous connections: "+getMaxConnection());
    }
}