/* This java file contains the abstract Gadget class, with its attributes, constructors and methods. A main method has not been defined in this file.
Therefore, running it leads to a run-time error. This class is used to create a subclass called Drown in the same directory. Objects of the drown class
will be created and tested in a separate file called TestDrown.java. This is done for clarity of code for the examiner.

Name: Dikshyanta Uprety
Task 1.2 and 2.2

*/
public abstract class Gadget {
    //Class variables
    private String gadgetCode;               //Unique code of the gadget
    private int quantityInStock;             //Number of the gadget in stock
    private double price;                            //price of a unit gadget

    //Methods for the class
    //Constructors
    //Constructor with no arguements
    public Gadget() {
    }
    //Constructor with gadget code, stock quantity and unit price as arguements
    public Gadget(int quantityInStock, double price, String gadgetCode) {
        this.quantityInStock= quantityInStock;
        this.price= price;
        this.gadgetCode= gadgetCode;   
    }

    //The setter and getter methods

    //For gadget code
    public void setGadgetCode( String gadgetCode) {
        this.gadgetCode= gadgetCode;
    }
    public String getGadgetCode() {
        return gadgetCode;
    }
    //For quantity in stock
    public void setQuantityInStock( int quantityInStock) {
        this.quantityInStock= quantityInStock;
    }
    public int getQuantityInStock() {
        return quantityInStock;
    }
    //For price
    public void setPrice( double price) {
        this.price= price;
    }
    public double getPrice() {
        return price;
    }

    //getGadgetName() method
    public abstract String getGadgetName();

    //getGadgetDescription() method
    public abstract String getGadgetDescription();
    
    //addGadget() method
    public void addGadget(int gadgetNumber) {
        //If the number of gadgets to be added is less than 1 or the stock exceeds 100 after addition, a suitable error message is displayed
        if (gadgetNumber<1) {
            System.out.println("Error. Sorry, at least a unit must be added to the stock.");
        }
        else if((gadgetNumber+quantityInStock)>100) {
            System.out.println("Error. Sorry, the stock cannot exceed 100 after addition.");
        }
        else {
            quantityInStock+=gadgetNumber;
        }
    }
    //sellGadget() method
    public void sellGadget(int gadgetNumber) {
        // If the number of gadgets to be sold is less than 1 or greater than quantityInStock, a suitable error message is displayed
        if (gadgetNumber<1) {
            System.out.println("Error. Sorry, at least  a unit of gadget must be sold");
        }
        else if (gadgetNumber>quantityInStock){
            System.out.println("Error. Sorry, the number of gadgets sold cannot exceed the quantity in stock.");
        }
        else {
            quantityInStock-=gadgetNumber;
        }
    }

    //getVAT() method (17.5% is used as the VAT rate for this program)
    public double getVAT() {
        return (0.175* price);
    }

    //getter method for price with VAT included
    public double getPriceWithVAT() {
        return(getPrice()+getVAT());         //Price with VAT= price without VAT + VAT
    }

    //toString() method
    //Because the toString method is already defined in object class, of which Gadget class is a subclass, I will override it
    @Override
    public String toString() {
        //Print the gadget information
        return (" Gadget code: "+getGadgetCode()+"\n Gadget Name: "+getGadgetName()+"\n Gadget Description: "+getGadgetDescription()+
        "\n Quantity in Stock: "+getQuantityInStock()+"\n Price before VAT: "+getPrice()+"\n Price after VAT: "+getPriceWithVAT());
    }
}
