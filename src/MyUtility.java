/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author remon
 */
public class MyUtility {
    public static String arrayFlower(String[][] aFlowers){
        
int rows = aFlowers.length;
int columns=aFlowers[0].length; 
     String mOutput="**price per stem**" ;  
        for (int i = 0; i < rows; i++) {mOutput+="\n";
            for (int j = 0; j < columns; j++) {
              mOutput +=aFlowers[i][j]+"\t\t";
            }

       
                
                }

return mOutput;
}

    
}
