/* This java file contains the Drown class, with its attributes, constructors and methods. A main method has not been defined in this file.
Therefore, running it leads to a run-time error. A separate java file named TestDrown.java in the same directory is used to create objects 
of the Drown class and test the methods. This is done for clarity of code for the examiner. 

Name: Dikshyanta Uprety
Task 2.2 

*/
public class Drown extends Gadget {
    //Class variables
    private String brand;

    //Methods for the class
    //Constructors
    //Constructor without arguement
    public Drown() {

    }

    //Paramerterized constructor
    public Drown(int quantityInStock, double price, String gadgetCode, String brand) {
        super(quantityInStock, price, gadgetCode);
        this.brand= brand;
    }

    //setter method for setting brand
    public void setBrand(String brand) {
        this.brand= brand;
    }

    //getter method for returning brand
    public String getBrand() {
        return brand;
    }

    //Override getGadgetName() and getGadgetDescription() methods
    @Override
    public String getGadgetName() {
        return ("Drown");
    }

    @Override
    public String getGadgetDescription() {
        return ("4 Chanel drowns with 50 mins flight time");
    }
    
    //Override the toString method to include brand information
    @Override
    public String toString() {
        return (super.toString()+"\n Brand: "+getBrand());    //Used super keyword to reuse the toString() method of the parent class
    }
}