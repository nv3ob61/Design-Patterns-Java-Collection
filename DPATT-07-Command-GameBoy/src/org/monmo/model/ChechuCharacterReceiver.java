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
  //receiver class
public class ChechuCharacterReceiver {

  private String name;

  public void moveUp() {
    System.out.println(getName() + "jumping up!");
  }

  public void moveLeft() {
    System.out.println(getName() + "muving left!");
  }

  public void moveRight() {
    System.out.println(getName() + "moving right!");
  }

  public void moveDown() {
    System.out.println(getName() + "moving down!");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
