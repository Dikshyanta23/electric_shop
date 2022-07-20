/* This java file contains the Monitor class, with its attributes, constructors and methods. A main method has not been defined in this file.
Therefore, running it leads to a run-time error. Object of the Monitor class is created and used in another file called TestPolymorphism in the same directory.
This is done for clarity of code for the examiner. 

Name: Dikshyanta Uprety
Task 3.2

*/
public class Monitor extends Gadget {
    //Attributes
    private String brand;        //The brand of the monitor  
    private String size;         // The size of the screen of the monitor
    private String screenType;   //The nature of the screen. For example LCD, LED, etc.

    //Constructors
    //Constructor without parameters
    public Monitor() {

    }

    //Parameterized constructor
    public Monitor( int quantityInStock, double price, String gadgetCode, String brand, String size, String screenType) {
        super( quantityInStock, price, gadgetCode);
        this.brand= brand;
        this.size= size;
        this.screenType= screenType;
    }

    //setter method for setting brand
    public void setBrand(String brand) {
        this.brand= brand;
    }

    //getter method for returning brand
    public String getBrand() {
        return brand;
    }

    //setter method for setting size
    public void setSize(String size) {
        this.size = size;
    }

    //getter method for getting size
    public String getSize() {
        return size;
    }

    //setter method for screenType
    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    //getter method for screenType
    public String getScreenType() {
        return screenType;
    }

    //Override the getGadgetName() and getGadgetDescription() method
    @Override
    public String getGadgetName() {
        return ("Monitor");
    }

    @Override
    public String getGadgetDescription() {
        return ("LCD and LED monitors in all popular sizes");
    }

    //Override the toString method to include brand, size and screen type and use super keyword to reuse toString() method of the parent class
    @Override
    public String toString() {
        return (super.toString()+"\n Brand: "+getBrand()+"\n Size of the screen: "+getSize()+ "\n Type of Screen: "+getScreenType());
    }
}