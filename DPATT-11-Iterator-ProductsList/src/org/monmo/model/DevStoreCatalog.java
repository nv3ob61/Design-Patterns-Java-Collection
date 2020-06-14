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

import org.monmo.interfaces.Catalog;

/**
 *
 * @author nv3ob61
 */
public final class DevStoreCatalog implements Catalog{

  private static final int MAX_ITEMS = 4;
  private int numbOfProducts = 0;
  Product[] catalog;

  public DevStoreCatalog() {

    catalog = new Product[MAX_ITEMS];

    addItem("C++ is not DEAD", "Book", 39.99);
    addItem("Paco Orientado a Objetos", "Book", 19.99);
    addItem("Con Joanpaon he aprendido mogollón", "Book", 23.99);
    addItem("Polymorphism... uhhhh (Vol I)", "Book", 42.99);
  }

  public void addItem(String name, String desc, double price) {
    Product prod = new Product(name, desc, price);

    if (numbOfProducts >= MAX_ITEMS) {
      System.out.println("Catalog is Full - can't add products.");
    } else {
      catalog[numbOfProducts] = prod;
      numbOfProducts = numbOfProducts + 1;
    }
  }


  @Override
  public DevStoreIterator createIterator() {
    return new DevStoreIterator(catalog);
  }
}
