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

import org.monmo.interfaces.Visitable;
import org.monmo.interfaces.Visitor;

/**
 *
 * @author nv3ob61
 */
public class Jacket implements Visitable {

  private double price;

  public Jacket(double price) {
    this.price = price;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public double accept(Visitor visitor) {
    return visitor.visitor(this);
  }

}
