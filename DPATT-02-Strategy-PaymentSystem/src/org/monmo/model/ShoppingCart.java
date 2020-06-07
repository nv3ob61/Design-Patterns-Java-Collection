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
package org.monmo.model;

import java.util.ArrayList;
import java.util.List;
import org.monmo.controller.Payment;

/**
 *
 * @author nv3ob61
 */
public class ShoppingCart {

  List<Product> productList;

  public ShoppingCart() {
    this.productList = new ArrayList<>();
  }

  public void addProduct(Product product) {
    productList.add(product);
  }

  public void removeProduct(Product product) {
    productList.remove(product);
  }

  public int calculateTotal() {
    int sum = 0;

    for (Product product : productList) {
      sum += product.getPrice();
    }

    return sum;
  }

  //depende si es tarjeta o paypal
  public void pay(Payment paymentStrategy) {
    int amount = calculateTotal();
    paymentStrategy.pay(amount);
  }
}
