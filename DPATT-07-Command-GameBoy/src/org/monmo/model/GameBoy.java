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

import org.monmo.interfaces.Command;

/**
 *
 * @author nv3ob61
 */
//the invoker class
public class GameBoy {

  private Command up;
  private Command down;
  private Command left;
  private Command right;

  public GameBoy(Command up, Command down, Command left, Command right) {
    this.up = up;
    this.down = down;
    this.left = left;
    this.right = right;
  }
  
  //or gameBoy knwows the commands here.
  public void arrowUp(){
    up.execute();
  }
  
  public void arrowDown(){
    down.execute();
  }
  
  public void arrowLeft(){
    left.execute();
  }
  
  public void arrowRight(){
    right.execute();
  }
}
