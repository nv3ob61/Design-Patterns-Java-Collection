/* 
 * Copyright (C) 2020 mon_mode   0mon.mode@gmail.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package org.monmo.main;

import org.monmo.controller.CreditCardAlgo;
import org.monmo.controller.PaypalAlgo;
import org.monmo.model.Product;
import org.monmo.model.ShoppingCart;


/**
 *
 * @author nv3ob61
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    //instancia shoppingcart   
    ShoppingCart sc = new ShoppingCart();
    
    //instancia productos
    Product cafe = new Product("0000", 25);
    Product agua = new Product("0001", 15);
    
    //add to shopping cart
    sc.addProduct(cafe);
    sc.addProduct(agua);
    
    //payment decisions
    sc.pay(new PaypalAlgo("email@email.com", "cambiaelpass"));
    
    sc.pay(new CreditCardAlgo("Juan Sin", "0000-9983-1341-2345"));

  }
  
}
