/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package price.restaurant;

import java.text.DecimalFormat;

/**
 *
 * @author dolee5394
  */
import java.text.*;
public class PriceRestaurant {

   

    
    public static void main(String[] args)  {
        double meal = 16.91;
        double hst = meal *0.13;
        double total = meal + hst;
        
        DecimalFormat x = new DecimalFormat ("##.##");
                
                
        System.out.println("Restaurant Bill");
        System.out.println("***************");
        
        System.out.println("meal:        " + x.format (meal));
        System.out.println("HST:         " + x.format (hst));
        System.out.println("total:       " + x.format (total));

    }
    
}
