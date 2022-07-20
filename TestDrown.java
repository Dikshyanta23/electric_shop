/* This java file contains the testDrown class. In this file, objects of Drown class in the same directory are created and tested.
A separate java file named Drown.java is used to store the Drown class, its attributes and its methods. This is done for clarity of code for
the examiner.

Name: Dikshyanta Uprety
Task 2.2

*/ 
public class TestDrown {
    public static void main(String args[]) {

        //A line to separate the intended print from the system print
        System.out.println();

        //Print out the context to the user
        System.out.println("Upon running this file, a Drown object is created using the parameterized constructor of Drown class.");
        System.out.println("Then the object is subjected to various tests whereby its class variables are changed using class defined methods and the output is observed.");
        System.out.println("Each test is followed by a copy of the object information so that the user can  observe the effects of the test clearly.");
        System.out.println("In case of an error message, the tests are not followed by object information. This is because, in case of an error, no change in class variable takes place.");
        System.out.println("The test will now begin.");
        System.out.println();

        //Testing the parameterized condition
        System.out.println("Creating a stock with 45 drowns, each of price 150 ,gadget code '1001' and brand 'Dell'.");
        Drown drown2= new Drown(45, 150, "1001", "Dell");
        System.out.println("Printing gadget information");
        System.out.println(drown2.toString());
        System.out.println();

        // Adding 8 drowns to the stock
        System.out.println("Adding 8 drowns to the stock.");
        drown2.addGadget(8);
        System.out.println("Printing gadget information.");
        System.out.println(drown2.toString());
        System.out.println();

        //Adding 0 drowns
        System.out.println("Adding 0 drowns to the stock.");
        drown2.addGadget(0);
        System.out.println();

        //Adding 115 drowns to the stock
        System.out.println("Adding 115 drowns to the stock.");
        drown2.addGadget(115);
        System.out.println();

        //Selling 6 drowns
        System.out.println("Selling 6 drowns from the stock.");
        drown2.sellGadget(6);
        System.out.println("Printing the gadget information.");
        System.out.println(drown2.toString());
        System.out.println();

        //Selling 0 stocks
        System.out.println("Selling 0 drowns from the stock.");
        drown2.sellGadget(0);
        System.out.println();

        //Selling 125 drowns from the stock
        System.out.println("Selling 125 drowns from the stock.");
        drown2.sellGadget(100);
        System.out.println();

        //Setting the price of drowns to 220
        System.out.println("Setting the price of the drowns to 220.");
        drown2.setPrice(220);
        System.out.println("Printing gadget information.");
        System.out.println(drown2.toString());
        System.out.println();

        //Setting the brand to Razor
        System.out.println("Changing the brand from Dell to Razor");
        drown2.setBrand("Razor");
        System.out.println("Printing gadget information");
        System.out.println(drown2.toString());
        System.out.println();
    }
}