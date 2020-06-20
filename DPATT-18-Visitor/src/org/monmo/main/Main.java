/* 
 * Copyright (C) 2020 nv3ob61
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.monmo.main;

import org.monmo.model.DiscVisitor;
import org.monmo.model.Jacket;
import org.monmo.model.Shirt;
import org.monmo.model.TaxVisitor;

/**
 *
 * @author nv3ob61
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    TaxVisitor taxVis = new TaxVisitor();
    DiscVisitor discVis = new DiscVisitor();

    Jacket jack = new Jacket(45.99);

    Shirt sh = new Shirt(34.25);

    System.out.println("Jacket price " + jack.getPrice());
    System.out.println("---");
    System.out.println(jack.accept(taxVis));
    System.out.println("---");
    System.out.println(jack.accept(discVis));
    System.out.println("---");
    System.out.println("Shirt price " + sh.getPrice());
    System.out.println("---");
    System.out.println(sh.accept(taxVis));
    System.out.println("---");
    System.out.println(sh.accept(discVis));
    System.out.println("---");
  }

}
