package OOP;


// Let's create a class for all vehicles in this program.


public class Vehicle {


    /*INSTANCE VARIABLES*/

    public String name = "";
    public String color = "";
    public String model = "";
    public String company = "";
    private String engine = "800";
    public static int count = 0;



    // Create a constructor with no parameters

    public Vehicle(){

        count++;

    }





    // Create a constructor with parameters

    public Vehicle(String name, String color, String model, String company) {
        this.name = name;
        this.color = color;
        this.model = model;
        this.company = company;
        this.engine = engine;
        count++;

    }

    public Vehicle(String name, String color, String model, String company, String engine) {


    }


    // Create functions for this class
//Setters


    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setEngine(String engine){
        this.engine = engine;
    }


    // Getters

    public String getName(){
        return this.name;
    }

    public String getColor(String color){
        return this.color;
    }

    public String getModel(String model){
        return this.model;
    }

    public String getCompany(String company){
        return this.company;
    }

    public String getEngine(String engine){
        return this.engine;
    }


    public String getInfo(){
        return "This is a vehicle";
    }








}


