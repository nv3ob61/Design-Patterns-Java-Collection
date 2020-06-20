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

import org.monmo.interfaces.Animal;

/**
 *
 * @author nv3ob61
 */
public class Person implements Animal {

  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
    System.out.println("Person is created....");
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return String.format("This a person named: %s", name);
  }

  public void muestraInfo() {
    System.out.println(toString());
  }

  @Override
  public Animal clone() throws CloneNotSupportedException {
    System.out.println("Creating person...");
    Person p = null;
    
    p = (Person)super.clone();
    return new Person(name, age);
  }

}
