
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author remon
 */
public class OrderFlowers {

    private int quantity;
    AnnualFlowers annual = new AnnualFlowers();

public void getInput(Scanner scan){
System.out.println("Enter the name of flower followed by quantity, example: marigold,3");
System.out.println("Flowers name: Marigold, Pansy, Zinnias Petunia");
System.out.println("");
boolean isValidInput = false;
while (!isValidInput) {
String input=scan.next();
String[] words = input.split(",");
String fName= words[0];
quantity = Integer.parseInt(words[1]) ;


    if (isValidFlowerName(fName)) {
        annual.getCost(fName);
        annual.setflowername(fName);
        isValidInput = true;
    } else {
        System.out.println("Invalid flower name entered! Please enter a valid flower name.");
    }
}
}

private boolean isValidFlowerName(String name) {
String[] validNames = {"Marigold", "Pansy", "Zinnias", "Petunia"};
for (String validName : validNames) {
if (validName.equalsIgnoreCase(name)) {
return true;
}
}
return false;
}


    public double totalCost() {
        double cost = quantity * annual.getflowerPrice();

        return cost;
    }

    @Override
    public String toString() {
        String oOutput = annual.toString() + "\n**********Bill**********" + "\n" + annual.getflowerName() + " costs $" + String.format("%.2f", totalCost()) + " for " + quantity + " stems";

        return oOutput;
    }
}
