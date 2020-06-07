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

import org.monmo.interfaces.HamburgerStore;
import org.monmo.model.CheeseBurger;
import org.monmo.model.Hamburger;
import org.monmo.model.JamHamburgerStore;
import org.monmo.model.MozHamburgerStore;

/**
 *
 * @author nv3ob61
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    HamburgerStore jamStore = new JamHamburgerStore();
    HamburgerStore mozStore = new MozHamburgerStore();

    Hamburger hamburger = mozStore.orderHamburger("veggie");
    System.out.println("Joan ordered :" + hamburger.getName() + "\n");

    hamburger = jamStore.orderHamburger("cheese");
    System.out.println("Paco Bond ordered: " + hamburger.getName() + "\n");

    hamburger = jamStore.orderHamburger("meat");
    System.out.println("Menchu ordered: " + hamburger.getName() + "\n");
  }

}
