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

import java.util.ArrayList;
import java.util.List;
import org.monmo.interfaces.ATCMediator;

/**
 *
 * @author nv3ob61
 */
public class ATCMediatorImpl implements ATCMediator {

  private List<Aircraft> airCraftList;

  public ATCMediatorImpl() {
    this.airCraftList = new ArrayList<>();
  }

  @Override
  public void sendMessage(String msg, Aircraft airCraft) {
    for (Aircraft aircraft : airCraftList) {
      //message should not be received by the aircraft sending the message
      if(aircraft != airCraft){
        aircraft.receive(msg);
      }
    }
  }

  @Override
  public void addAircraft(Aircraft a) {
    airCraftList.add(a);
  }

}
