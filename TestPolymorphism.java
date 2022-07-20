/* This java file contains the testPolymorphism class. In this file, objects of Drown, Monitor, Multiplug and Router classes in the same directory 
are created and used. Separate java files named Drown.java, Monitor.java, Multiplug.java and Router.java are used to store the respective classes, 
their attributes and their methods. This is done for clarity of code for the examiner.

The program asks the user to enter the values by which the stocks are to be added and reduced and the price is to be set for the objects of each of the three
subclass of Gadget class metioned above. A range is provided for each input. This is done in order to avoid unwanted error message.
If in range, these values will be used to alter gadget class variable quantityInStock and price and test the objects of the classes.

Name: Dikshyanta Uprety
Task 3.2

*/
import java.util.Scanner;       //to read the user input and store it
class TestPolymorphism {
    //Declare global variables of the class to store the user inputs in main method and use in gadgetInstance
    //Used static because these variables are used by the  static methods, gadgetInstance() and main()
    
    private static int stockToAdd;
    private static int stockToSell;
    private static double priceToSet;

    //gadgetInstance() method

    public static void gadgetInstance(Gadget gadget) {

        //Output gadget information
        System.out.println("Printing gadget information");
        System.out.println(gadget.toString());
        System.out.println();

        //Increase the stock as specified by the user
        System.out.println("Incrementing stock by "+stockToAdd);
        gadget.addGadget(stockToAdd);
        System.out.println("Printing gadget information");
        System.out.println(gadget.toString());
        System.out.println();
        
        //Selling gadget as specified by user
        System.out.println("Decreasing stock by "+stockToSell);
        gadget.sellGadget(stockToSell);
        System.out.println("Printing gadget information");
        System.out.println(gadget.toString());
        System.out.println();

        //Change the price to a value given by the user
        System.out.println("Changing the price to "+priceToSet);
        gadget.setPrice(priceToSet);
        System.out.println("Printing gadget information");
        System.out.println(gadget.toString());
        System.out.println();
    }

    //main method
    public static void main(String[] args) {
        //Scanner object
        Scanner sc= new Scanner(System.in);

        //Create an array to store the gadgets
        Gadget[] gadget= new Gadget[4];

        //Create an object of each of three subclasses of Gadget class using their parameterized constructors
        Monitor monitor1= new Monitor( 70, 450, "2001", "Hewlett-Packard", "32 inches", "LED");
        Router router1= new Router( 65, 55, "3001",  "Strong", "1 Gigabyte per second");
        Multiplug multiplug1= new Multiplug( 35, 25, "4001", true, 4);

        //Load the objects into the array
        gadget[0]= monitor1;
        gadget[1]= router1;
        gadget[2]= multiplug1;

        //A line to separate the intended print from the system print
        System.out.println();

        //Print out the context to the user
        System.out.println("Upon running this file, the user is asked to enter two integer values and a double value.");
        System.out.println("All of these values are used by the program to alter the Gadget class variables quantityInStock and price.");
        System.out.println("An object each of the three subclasses of the Gadget class created in part 3 (Monitor, Multiplug and Router) are tested by using these values.");
        System.out.println("The two integer values refer to the stock that the program adds and those it deducts from the quantityInStock of each object, the double value refers to the new price that the program sets for the object.");
        System.out.println("Validators are used to regulate the input.So please enter a suitable value within the provided range.");
        System.out.println();


        //Prompt the user into entering the stocks that he wants to add/sell in the program and the price
        //For all of these inputs, a validator is used so that the input is in range of accepted values. This is done to avoid error conditions in the program.
        boolean isValid= false;    //The boolean variable is used to validate the input

        //For adding stocks
        while(!isValid) {
        System.out.println("Please enter the number of stocks that you want to add to each of the products. Please choose an integer value between 1 and 20.");
        stockToAdd= sc.nextInt();
        if (stockToAdd>0 && stockToAdd<=20) {
            isValid= true;
        }
        else {
            System.out.println("Sorry, the integer value you entered is not in range.");
        }
        }
        System.out.println();

        //For selling stocks
        while(isValid) {
        System.out.println("Please enter the number of stocks that you want to sell for each product. Please choose an integer value between 1 and 20.");
        stockToSell= sc.nextInt();
        if(stockToSell>0 && stockToSell<=20) {
            isValid= false;
        }
        else {
            System.out.println("Sorry, the integer value you entered is not in range.");
        }
        }
        System.out.println();

        //For setting price
        while(!isValid) {
        System.out.println("Please enter the new price for each of the product. Please choose a double value between 1 and 200");
        priceToSet= sc.nextDouble();
        if(priceToSet>0 && priceToSet<=200) {
            isValid=true;
        }
        else {
            System.out.println("Sorry, the double value you entered is not in range.");
        }
        }
        System.out.println();

        //After all the valid input is entered, let the user know that the test begins
        System.out.println("Thank you for the inputs. The test will now begin.");

        System.out.println();



        //Use a for loop to pass the objects of the array into gadgetInstance() method
        for (int i=0; i<4;i++) {
            // Use a switch statement to label the gadget whose information is printed in the console
            switch(i) {
                case 0: System.out.println("For the monitor object \n");
                break;
                case 1: System.out.println("For the router object \n");
                break;
                case 2: System.out.println("For the multiplug object \n");
                break;
            }
            if(gadget[i]!=null) {        //Passing only the desired members of the array into the gadgetInstance() method
            gadgetInstance(gadget[i]);
            }
        }
        
    }
}