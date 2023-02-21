/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author remon
 */
public class AnnualFlowers {

    private String flowerName;
    private double flowerPrice;

    private String[][] flowers = {{"Marigold", "2.30"},
    {"Pansy", "1.50"},
    {"Zinnias", "5.12"},
    {"Petunia", "3.25"}};
public void setflowername(String name){
flowerName=name;

}
    public String getflowerName() {
        return flowerName;
    }

    public double getflowerPrice() {
        return flowerPrice;

    }

   

    public void getCost(String name) {
        int rows = flowers.length;
    
        for (int i = 0; i < rows; i++) {

            if (flowers[i][0].equalsIgnoreCase(name)) {
                flowerPrice = Double.parseDouble(flowers[i][1]);
                
                }
        }
    }

    @Override
    public String toString() {
    String aOutput=MyUtility.arrayFlower(flowers);
    
    
    return aOutput;
    }
    }

    
    
    

