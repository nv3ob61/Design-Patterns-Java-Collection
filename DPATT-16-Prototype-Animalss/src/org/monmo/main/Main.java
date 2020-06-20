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

import org.monmo.model.Person;

/**
 *
 * @author nv3ob61
 */
public class Main {

  /**
   * @param args the command line arguments
   * @throws java.lang.CloneNotSupportedException
   */
  public static void main(String[] args) throws CloneNotSupportedException {
//    //first person
//    Person joe = new Person("Joe", 21);
//    System.out.println("Persona 1: " + joe);
//    
//    
//    //another object Person casted to our model
//    Person nio = (Person)joe.clone();
//    nio.setName("Nio");
//    nio.setAge(23);
//    System.out.println("Persona 2: " + nio);

    Person p = new Person("Paco", 40);
    p.muestraInfo();

    Person p2 = (Person) p.clone();
    System.out.println("Person copy: " + p2);

    //separator
    System.out.println();
    System.out.println("---");
    
    System.out.println("Showing hashcodes: ");
    System.out.println(System.identityHashCode(p) + " - "
            + System.identityHashCode(p2));

  }

}
