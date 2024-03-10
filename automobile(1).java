package automobile;
import java.io.*;
import java.util.*;
public class Automobile implements Serializable {
 
    Scanner input = new Scanner(System.in);
 
 
private String make;
private String model;
private String color;
private int year;
private int mileage;
//as above values are initialized at startup, below values are not, and serve to update the currently selected car
private String make1;
private String model1;
private String color1;
private int year1;
private int mileage1;
 
//Default Constructor
public Automobile() {
    make = "something expensive";
    model = "nyooom";
    color = "rainbow";
    year = 4;
    mileage = -5;
}
 
//Parameterized Constructor
public Automobile(String make, String model, String color, int year, int mileage) {
    this.make = make;
    this.model = model;
    this.color = color;
    this.year = year;
    this.mileage = mileage;
}
 
public void updateVehicle(String make1, String model1, String color1, int year1, int mileage1) { //replica variables that arent initialized with the original car
 
System.out.println("enter the new make, model, color, year of production, and mileage: ");
 
    this.make = make1 = input.nextLine();
    this.model = model1 = input.nextLine();
    this.color = color1 = input.nextLine();
    this.year = year1 = input.nextInt();
    this.mileage = mileage1 = input.nextInt();
}
 
public void setTo0(String make0, String model0, String color0, int year0, int mileage0) {       //remove current values
System.out.println("erasing all current attributes: ");
  make = make0;
  model = model0;
  color = color0;
  year = year0;
  mileage = mileage0;
  System.out.println("");
}
 
public void printVehicle() {
    System.out.println("Vehicle make: " + this.make);
    System.out.println("Vehicle model: " + this.model);
    System.out.println("Vehicle color: " + this.color);
    System.out.println("Year of production: " + this.year);
    System.out.println("Current mileage: " + this.mileage);
    System.out.println("");//list currently selected vehicle information
}
 
}