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

import org.monmo.model.ChechuCharacterReceiver;
import org.monmo.model.ChechuDownCommand;
import org.monmo.model.ChechuLeftCommand;
import org.monmo.model.ChechuRightCommand;
import org.monmo.model.ChechuUpCommand;
import org.monmo.model.GameBoy;
import org.monmo.model.NagamoxiCharacterReceiver;
import org.monmo.model.NagamoxiDownCommand;
import org.monmo.model.NagamoxiLeftCommand;
import org.monmo.model.NagamoxiRightCommand;
import org.monmo.model.NagamoxiUpCommand;

/**
 *
 * @author nv3ob61
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    //Create receivers
    ChechuCharacterReceiver chechu = new ChechuCharacterReceiver();
    chechu.setName("Chechulín ");

    NagamoxiCharacterReceiver naga = new NagamoxiCharacterReceiver();
    naga.setName("Narakaturatoshi ");

    //create commands for characters
    ChechuUpCommand chechuUp = new ChechuUpCommand(chechu);
    ChechuDownCommand chechuDown = new ChechuDownCommand(chechu);
    ChechuLeftCommand chechuLeft = new ChechuLeftCommand(chechu);
    ChechuRightCommand chechuRight = new ChechuRightCommand(chechu);

    NagamoxiUpCommand nagaUp = new NagamoxiUpCommand(naga);
    NagamoxiDownCommand nagaDown = new NagamoxiDownCommand(naga);
    NagamoxiLeftCommand nagaLeft = new NagamoxiLeftCommand(naga);
    NagamoxiRightCommand nagaRight = new NagamoxiRightCommand(naga);

    //invoker
    GameBoy gameBoy = new GameBoy(chechuUp, chechuDown, chechuLeft, chechuRight);
    //movement for magaxoxi too   //comment these lines 
    GameBoy gameBoy2 = new GameBoy(nagaUp, nagaDown, nagaLeft, nagaRight);
    
    
    gameBoy.arrowDown();
    
    gameBoy2.arrowUp();
  }

}
