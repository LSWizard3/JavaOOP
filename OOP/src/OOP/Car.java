package OOP;


/* This Car class is a child class of Vehicle class since it extends from it.

 Class:       Vehichle
                 /
                /
               /
   Class:     Car

* Method overriding - when you overwrite a parent function to customize it specifically
                      and more suitable for your child class




 */



public class Car extends Vehicle {


    private boolean powerSteering = false;
    private boolean ledScreen = true;


    //Create a constructor for Car class requires all the paramaters from the parent class and any additional parameters from the instance variables declared for the Car class.


    public Car(String name, String color, String model, String company, String engine, boolean powerSteering, boolean ledScreen){

        // Use keyword "super" which send those properties to the parent class

        super(name, color, model, company, engine);
        this.powerSteering = powerSteering;
        this.ledScreen = ledScreen;
    }



    // Declare setters and getters for the Car Class




    //Overwriting a parent function in the child function
    // This is called "Method Overriding"
    public String getName(){
        return ("Name of your vehicle is: " + super.getName());
    }




    public boolean getPowerSteering() {
        return powerSteering;
    }

    public void setPowerSteering(boolean powerSteering) {
        this.powerSteering = powerSteering;
    }

    public boolean getLedScreen() {
        return ledScreen;
    }

    public void setLedScreen(boolean ledScreen) {
        this.ledScreen = ledScreen;
    }



    public String getInfo(){
        return "This is a car";
    }





}

