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
import org.monmo.interfaces.Catalog;

/**
 *
 * @author nv3ob61
 */
public final class GeekyStoreCatalog implements Catalog{

  private final ArrayList<Product> catalog;

  public GeekyStoreCatalog() {

    catalog = new ArrayList<>();

    addItem("Supermann", "T-Shirt", 12.34);
    addItem("Sponge Bob", "T-Shirt", 23.50);
    addItem("Paco", "T-Shirt", 49.99);
    addItem("Batman", "T-Shirt", 13.00);

  }

  public void addItem(String name, String desc, double price) {
    Product prod = new Product(name, desc, price);

    catalog.add(prod);
  }

  @Override
  public GeekyStoreIterator createIterator() {
    return new GeekyStoreIterator(catalog);
  }
}
