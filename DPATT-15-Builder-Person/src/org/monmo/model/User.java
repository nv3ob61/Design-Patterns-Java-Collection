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

/**
 *
 * @author nv3ob61
 */
public class User {

  private final String firstName;
  private final String lastName;
  private final int age;
  private final String phoneNumber;
  private final String address;

  public User(UserBuilder builder) {
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.age = builder.age;
    this.phoneNumber = builder.phoneNumber;
    this.address = builder.address;
  }

  @Override
  public String toString() {
    return String.format("INFO%n----%n"
            + "FIRST NAME: %s%n"
            + "LAST NAME : %s%n"
            + "AGE       : %d%n"
            + "PHONE NUM : %s%n"
            + "ADDRESS   : %s%n", firstName, lastName, age, phoneNumber, address);
            }
  
  

  public static class UserBuilder {

    final String firstName;
    final String lastName;
    int age;
    String phoneNumber;
    String address;

    public UserBuilder(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
    }

    public UserBuilder(String firstName, String lastName, int age, String phoneNumber, String address) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.phoneNumber = phoneNumber;
      this.address = address;
    }

    public UserBuilder age(int age) {
      this.age = age;
      return this;
    }

    public UserBuilder phoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    public UserBuilder address(String address) {
      this.address = address;
      return this;
    }

    public User build() {
      return new User(this);
    }
  }
}
