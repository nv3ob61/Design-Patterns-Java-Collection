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
public class Product {
  
  private String id;
  private int price;

  public Product() {
  }

  public Product(String id, int price) {
    this.id = id;
    this.price = price;
  }
  
  

  public String getId() {
    return id;
  }

  public int getPrice() {
    return price;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setPrice(int price) {
    this.price = price;
  }
  
  
}
