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
package org.monmo.controller;

/**
 *
 * @author nv3ob61
 */
public class CreditCardAlgo implements Payment{

  private String name;
  private String cardNumber;

  public CreditCardAlgo() {
  }

  public CreditCardAlgo(String name, String cardNumber) {
    this.name = name;
    this.cardNumber = cardNumber;
  }
  
  
  
  @Override
  public void pay(int amount) {
    System.out.println(amount + " paid with CARD.");
  }
  
}
