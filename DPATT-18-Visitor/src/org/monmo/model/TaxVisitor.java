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
package org.monmo.model;

import org.monmo.interfaces.Visitor;

/**
 *
 * @author nv3ob61
 */
public class TaxVisitor implements Visitor {


  public TaxVisitor() {
  }

  @Override
  public double visitor(Shirt shirt) {
    System.out.println("Shirt final price with tax: ");
    return Double.parseDouble(String.format("%.2f", shirt.getPrice() * 0.10
            + shirt.getPrice()));
  }

  @Override
  public double visitor(Tshirt tshirt) {
    System.out.println("T-Shirt final price with tax: ");
    return Double.parseDouble(String.format("%.2f", tshirt.getPrice() * 0.18
            + tshirt.getPrice()));
  }

  @Override
  public double visitor(Jacket jacket) {
    System.out.println("Jacket final price with tax: ");
    return Double.parseDouble(String.format("%.2f", jacket.getPrice() * 0.20
            + jacket.getPrice()));
  }

}
