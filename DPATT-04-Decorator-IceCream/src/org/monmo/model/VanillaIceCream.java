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

import org.monmo.interfaces.IceCream;
import org.monmo.interfaces.IceCreamDecorator;

/**
 *
 * @author nv3ob61
 */
public class VanillaIceCream extends IceCreamDecorator {

  public static final double COSTE_VANILLA = 1.2;

  public VanillaIceCream(IceCream i) {
    super(i);
  }

  @Override
  public double cost() {
    System.out.println("Adding Vanilla Ice-Cream");
    return COSTE_VANILLA + super.cost();
  }

}
