/* This java file contains the TestGadget class. The aim of this file is to check Gadget class and its properties. Since gadget class is an abstract
class, objects of the class cannot be created. However, this class extends the gadget class, only defining the constructors and overwriting the abstract methods.
Therefore, the program tests the gadget class by creating and altering objects of TestGadget subclass of gadget class (basically the same class).

Throughout the program, the object of TestGadget class is referred to as Gadget object. This is because the intention of creating the TestGadget class was to 
create a non-abstract Gadget class, create and test its objects. Therefore, in testing this class, the program tests the gadget class. So, the object of this class
is referred loosely as objects of the Gadget class.

Name: Dikshyanta Uprety
Task 1.2

*/
public class TestGadget extends Gadget{

    //constructors for this class
    //unparameterized constructor
    public TestGadget() {

    }
    //parameterized constructor
    public TestGadget(int quantityInStock, double price, String gadgetCode) {
        super(quantityInStock, price, gadgetCode);
    }
 
    //Override the abstract methods in the Gadget class, getGadgetName() and getGadgetDescription()
    @Override
    public String getGadgetName() {
        return ("Unknown Gadget Name");
    }

    @Override
    public String getGadgetDescription() {
        return ("Unknown Gadget Description");
    }

    //main method
    public static void main(String[] args) {

        //A line to separate the intended print from the system print
        System.out.println();

        //Print out the context to the user
        System.out.println("Upon running this file, a TestGadget object(exactly same to Gadget object) is created using the parameterized constructor of TestGadget class.");
        System.out.println("Then the object is subjected to various tests whereby its class variables are changed using class defined methods and the output is observed.");
        System.out.println("Each test is followed by a copy of the object information so that the user can  observe the effects of the test clearly.");
        System.out.println("In case of an error message, the tests are not followed by object information. This is because, in case of an error, no change in class variable takes place.");
        System.out.println("The test will now begin.");
        System.out.println();

        //Testing the parameterized constructor
        System.out.println("Creating a stock with 50 unknown items, each of price 100 and gadget code '0001'");
        TestGadget gadget2= new TestGadget(50, 100, "0001");
        System.out.println("Priting gadget information.");
        System.out.println(gadget2.toString());
        System.out.println();

        //Adding 10 gadgets to the stock 
        System.out.println("Adding 10 gadgets to the stock.");
        gadget2.addGadget(10);
        System.out.println("Printing gadget information.");
        System.out.println(gadget2.toString());
        System.out.println();

        //Adding 0 gadgets to the stock
        System.out.println("Adding 0 gadgets.");
        gadget2.addGadget(0);
        System.out.println();

        //Adding 110 gadgets to the stock
        System.out.println("Adding 110 Gadgets to stock.");
        gadget2.addGadget(110);
        System.out.println();

        //Selling 5 units from the stock
        System.out.println("Selling 5 gadgets.");
        gadget2.sellGadget(5);
        System.out.println("Printing the gadget information.");
        System.out.println(gadget2.toString());
        System.out.println();   
        
        //Selling 0 units from the stock
        System.out.println("Selling 0 gadgets.");
        gadget2.sellGadget(0);
        System.out.println();

        //Selling 105 units from the stock
        System.out.println("Selling 105 gadgets.");
        gadget2.sellGadget(100);
        System.out.println();        
        
        //Setting new price without VAT to 200
        System.out.println("Setting the price of the gadget to 200.");
        gadget2.setPrice(200);
        System.out.println("Printing gadget information.");
        System.out.println(gadget2.toString());
        System.out.println();        
    }
}