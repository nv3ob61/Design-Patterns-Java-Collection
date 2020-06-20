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

import org.monmo.interfaces.ATCMediator;
import org.monmo.model.ATCMediatorImpl;
import org.monmo.model.Aircraft;
import org.monmo.model.AircraftImpl;


/**
 *
 * @author nv3ob61
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    ATCMediator mediator = new ATCMediatorImpl();
    
    //create aircraft
    Aircraft boing = new AircraftImpl(mediator, "SP-304");
    Aircraft helic = new AircraftImpl(mediator, "HELIOS");
    Aircraft robot = new AircraftImpl(mediator, "ROBBOT");

     //adding aircraft to the mediator
     mediator.addAircraft(boing);
     mediator.addAircraft(helic);
     mediator.addAircraft(robot);
     
     
     boing.send("Ready to depart!");
     mediator.sendMessage("Wait please", boing);
  }
  
}
