package automobile;
import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
 
        ArrayList<Automobile> carrayList = new ArrayList<Automobile>(); //haha get it cause car arraylist
      System.out.println("Car inventory: please enter the make, model, color, year of production, and mileage: ");
        String make = input.nextLine();
        String model = input.nextLine();
        String color = input.nextLine();
        int year = input.nextInt();
        int mileage = input.nextInt();
 
        Automobile paraCar = new Automobile(make, model, color, year, mileage); //had to initialize outside of switch case to avoid "X might not be initialized" errors
        System.out.println("");
        paraCar.printVehicle();
 
 
 
int loop = 99;
 
      while (loop != 0) {
 
        System.out.println("menu: ");
System.out.println("Press 1 for current vehicle info: ");
System.out.println("Press 2 to clear current vehicle info: ");
System.out.println("Press 3 to update vehicle info: ");
System.out.println("Press 4 to save current vehicle to inventory: ");
System.out.println("Press 5 to view inventory: ");
System.out.println("Press 6 to delete previous inventory entry: ");
System.out.println("Press 7 to save inventory to file on disk: ");
System.out.println("Press 8 to exit: ");
System.out.println("");
        int menu = input.nextInt();
    switch (menu){  
 
    case (1):
    	paraCar.printVehicle();
    break;
 
     case (2):
        paraCar.setTo0(null,null,null, 0, 0);
        paraCar.printVehicle();
        break;
 
      case (3):
    	paraCar.updateVehicle(make, model, color, year, mileage);
        paraCar.printVehicle();
        break;
 
         case (4):
       carrayList.add(paraCar); //add to inventory
       //adds current instance of paraCar, but turns all previous instances into current instance
        break;
 
case (5): //prints out arraylist
        System.out.println("There currently are " + carrayList.size() + " cars in inventory:");
 
        for(Automobile silverbullet : carrayList) {
            silverbullet.printVehicle();
          }
        break;
        case (6): 
        carrayList.remove(carrayList.size()-1);
        break;
        case (7):
        //file output, not even remotely functional
 
        	/*FileOutputStream fos = new FileOutputStream("inventory.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos); {
      oos.writeObject(carrayList);
      }*/
        case (8):
        System.exit(0);
        break;
}
}
    }
}
 
 