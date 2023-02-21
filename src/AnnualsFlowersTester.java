
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author remon
 */
public class AnnualsFlowersTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
  
       Scanner scan = new Scanner(System.in);

        OrderFlowers order = new OrderFlowers();
        order.getInput(scan);
      
        System.out.println(order);
        // TODO code application logic here
    }

}
