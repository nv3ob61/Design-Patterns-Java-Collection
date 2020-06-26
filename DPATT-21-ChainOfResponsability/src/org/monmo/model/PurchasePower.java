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
abstract class PurchasePower {

  protected static final double BASE = 1000;
  protected PurchasePower successor;

  abstract protected double getAllowable();

  abstract protected String getRole();

  public void setSuccessor(PurchasePower pow) {
    this.successor = pow;
  }

  public PurchasePower getSuccessor() {
    return successor;
  }

  public void processRequest(PurchaseRequest request){
    
    if(request.getAmount() < this.getAllowable()){
      System.out.println(this.getRole() + " will aprove $" + request.getAmount());
    } else if (successor != null){
      successor.processRequest(request);
    }
  }
}
