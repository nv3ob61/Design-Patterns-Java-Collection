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
package org.monmo.interfaces;

/**
 *
 * @author nv3ob61
 */
public interface Person {

  String getFirstName();

  String getLastName();

  String getPhoneNumber();

  int getAge();

  String getAddress();

  //implementing DefaultPerson here....
  class DefaultPerson implements Person {

    protected String firstName;
    protected String lastName;

    protected String phoneNumber;
    protected String address;
    protected int age;

    public DefaultPerson(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
    }

    protected DefaultPerson(Builder builder) {
      this(builder.getFirstName(), builder.getLastName());
      this.phoneNumber = builder.phoneNumber;
      this.address = builder.address;
      this.age = builder.age;
    }

    @Override
    public String getFirstName() {
      return this.firstName;
    }

    @Override
    public String getLastName() {
      return this.lastName;
    }

    @Override
    public String getPhoneNumber() {
      return this.phoneNumber;
    }

    @Override
    public int getAge() {
      return this.age;
    }

    @Override
    public String getAddress() {
      return this.address;
    }

    public void setFirstName(String firstName) {
      this.firstName = firstName;
    }

    public void setLastName(String lastName) {
      this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
      this.address = address;
    }

    public void setAge(int age) {
      this.age = age;
    }

    @Override
    public String toString() {
      return String.format("INFO%n----%n"
              + "FIRST NAME: %s%n"
              + "LAST NAME : %s%n"
              + "AGE       : %d%n"
              + "PHONE NUM : %s%n"
              + "ADDRESS   : %s%n", this.firstName, this.lastName, this.age,
              this.phoneNumber, this.address);
    }
  }

  //Builder Class extending DefaultPerson
  public class Builder extends DefaultPerson {

    public Builder(String firstName, String lastName) {
      super(firstName, lastName);
    }

    public Builder phone(String phone) {
      this.phoneNumber = phone;
      return this;
    }

    public Builder address(String address) {
      this.address = address;
      return this;
    }

    public Builder age(int age) {
      this.age = age;
      return this;
    }

    public Person build() {
      return new DefaultPerson(this);
    }
  }

}
