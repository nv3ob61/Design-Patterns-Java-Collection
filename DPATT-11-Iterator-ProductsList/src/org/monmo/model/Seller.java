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

import org.monmo.interfaces.Iterator;

/**
 *
 * @author nv3ob61
 */
public class Seller {
  //frontdoor person, sort of selling things..

  GeekyStoreCatalog geekyStoreCatalog;
  DevStoreCatalog devStoreCatalog;

  public Seller(GeekyStoreCatalog geekyStoreCatalog, DevStoreCatalog devStoreCatalog) {
    this.geekyStoreCatalog = geekyStoreCatalog;
    this.devStoreCatalog = devStoreCatalog;
  }

  public void printCatalog() {
    //create iterators
    Iterator gite = geekyStoreCatalog.createIterator();
    Iterator dite = devStoreCatalog.createIterator();
    //printing issues
    System.out.println("Printing Geeky Catalog: ");
    System.out.println("-----------------------");
    printCatalog((GeekyStoreIterator) gite);

    //separator
    System.out.println();
    System.out.println("Printing Dev Catalog: ");
    System.out.println("-----------------------");
    printCatalog((DevStoreIterator) dite);
  }

  //we're using our interface not java.util.iterator or whatever imports name is.
  private void printCatalog(Iterator ite) {

    while (ite.hasNext()) {
      Product p = (Product) ite.next();
      System.out.printf("%34s - %s : %2.2f€%n", p.getName(), p.getDesc(), p.getPrec());
    }
  }

}
