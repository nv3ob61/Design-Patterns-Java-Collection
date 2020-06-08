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

import org.monmo.interfaces.SocketAdapter;
import org.monmo.model.SocketAdapterImplement;
import org.monmo.model.SocketObjectAdapterImplement;
import org.monmo.model.Volt;

/**
 *
 * @author nv3ob61
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    testingObjectAdapter();
    //separador
    System.out.println("---");

    testingClassAdapter();
  }

  private static void testingObjectAdapter() {
    SocketAdapter socketAdapter = new SocketObjectAdapterImplement();

    Volt v1 = getVolt(socketAdapter, 1);
    Volt v3 = getVolt(socketAdapter, 3);
    Volt v12 = getVolt(socketAdapter, 12);
    Volt v120 = getVolt(socketAdapter, 120);
    Volt v240 = getVolt(socketAdapter, 240);

    System.out.println(" 1V is using Object Adapter " + v1.getVolts());
    System.out.println(" 3V is using Object Adapter " + v3.getVolts());
    System.out.println(" 12V is using Object Adapter " + v12.getVolts());
    System.out.println(" 120V is using Object Adapter " + v120.getVolts());
    System.out.println(" 240V is using Object Adapter " + v240.getVolts());
  }

  private static void testingClassAdapter() {
    SocketAdapter socketAdapter = new SocketAdapterImplement();

    Volt v1 = getVolt(socketAdapter, 1);
    Volt v3 = getVolt(socketAdapter, 3);
    Volt v12 = getVolt(socketAdapter, 12);
    Volt v120 = getVolt(socketAdapter, 120);
    Volt v240 = getVolt(socketAdapter, 240);

    System.out.println(" 1V is using Class Adapter " + v1.getVolts());
    System.out.println(" 3V is using Class Adapter " + v3.getVolts());
    System.out.println(" 12V is using Class Adapter " + v12.getVolts());
    System.out.println(" 120V is using Class Adapter " + v120.getVolts());
    System.out.println(" 240V is using Class Adapter " + v240.getVolts());
  }

  private static Volt getVolt(SocketAdapter sa, int i) {

    switch (i) {
      case 1:
        return sa.get1V();
      case 3:
        return sa.get3V();
      case 12:
        return sa.get12V();
      case 120:
        return sa.get120V();
      case 240:
        return sa.get240V();
      default:
        return sa.get240V();
    }
  }
}
