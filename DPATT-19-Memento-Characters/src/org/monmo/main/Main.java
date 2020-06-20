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

import org.monmo.model.CareTaker;
import org.monmo.model.Memento;
import org.monmo.model.Originator;

/**
 *
 * @author nv3ob61
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    Originator orig = new Originator();

    orig.setState("Monster");

    Memento memento = orig.createMemento();

    //caretaker applies to mementos
    CareTaker caret = new CareTaker();
    caret.addMemento(memento);

    //crreating more states for the memento
    orig.setState("Monster Two");
    orig.setState("Monster Three");

    //creating another memento
    memento = orig.createMemento();
    caret.addMemento(memento);

    orig.setState("Monster Fourrr");

    //separator
    System.out.println();
    System.out.println("---");

    //End
    System.out.println("Originator current state: " + orig.getState());

    System.out.println("Originator restorin to previous state....");
    memento = caret.getMemento(1);
    orig.setMemento(memento);

    //separator
    System.out.println();
    System.out.println("---");

    //End
    System.out.println("Originator current state: " + orig.getState());
    memento = caret.getMemento(0);
    orig.setMemento(memento);

    //separator
    System.out.println();
    System.out.println("---");

    //End
    System.out.println("Originator current state: " + orig.getState());

  }

}
