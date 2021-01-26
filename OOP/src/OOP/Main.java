package OOP;


/* Let's create a car class */

/* MAIN TOPICS of OOP:

1) Abstraction
2) Encapsulation (using private and setter/getter for functions for global use
3) Inheritance - allows a class to copy over the variables and methods for its own class
       i.e.
                        Vehicle
                        /     \
                       /       \
                      /         \
                     Car       Bike


4) Polymorphism - object of vehicle class can take reference of its child classes but not vice versa

*/

public class Main {


    public static void main(String[] args) {


//        //Create a vehicle object with no parameters
//
//        Vehicle vehicle1 = new Vehicle();
//
//        System.out.println(vehicle1.color);
//
//        vehicle1.setName("city");
//
//        System.out.println(vehicle1.name);
//
//
//        //Create a vehicle object with parameters
//
//        Vehicle vehicle2 = new Vehicle("civic", "black", "2012", "honda");
//        System.out.println(vehicle2.color);
//
//
//        vehicle2.setColor("red");
//
//        System.out.println(vehicle2.color);
//
//
//
//Tester var1 = new Tester();
//
//        System.out.println(var1.getX(""));









        // Create a car Object


//        Car car1 = new Car("civic", "black", "2012", "honda","900", true, false);
//
//
//        System.out.println(car1.getLedScreen());
//        car1.setName("civic");
//        System.out.println(car1.getName());
//
//



        Vehicle vehicle1 = new Vehicle("civic", "black", "2012", "honda", "900");
        System.out.println(vehicle1.getInfo());





        //Parent containing object of child class: ->

        Vehicle vehicle2 = new Car("civic", "black", "2012", "honda", "900", true, false);
        System.out.println(vehicle2.getInfo());

        //Parent is referring to its child class to figure out it is type car (method overloading)


        Vehicle vehicle3 = new Bike("civic", "black", "2012", "honda", "900", true, false);
        System.out.println(vehicle3.getInfo());

    }
























}
