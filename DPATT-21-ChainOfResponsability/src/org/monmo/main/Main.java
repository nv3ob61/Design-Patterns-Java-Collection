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

import org.monmo.main.libraries.UtilesEntrada;
import org.monmo.model.CEOPurchasePower;
import org.monmo.model.DirectorPurchasePower;
import org.monmo.model.ManagerPurchasePower;
import org.monmo.model.PurchaseRequest;

/**
 *
 * @author nv3ob61
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    String d = null;
    boolean isOk = true;
    CEOPurchasePower ceo = new CEOPurchasePower();
    DirectorPurchasePower dire = new DirectorPurchasePower();
    ManagerPurchasePower mana = new ManagerPurchasePower();

    //assign the responsability of budget decision
    ceo.setSuccessor(dire);
    dire.setSuccessor(ceo);
    mana.setSuccessor(dire);

    while (isOk) {

      try {
        System.out.println();
        d = UtilesEntrada.readText(
                ">> Enter the amount to check who should approve your budget: ");

        mana.processRequest(new PurchaseRequest(Double.parseDouble(d), "Buy something nice!"));

      } catch (NumberFormatException numberFormatException) {
        if (d.toLowerCase().equals("exit")) {
          isOk = false;
          System.out.println("FIN / END");
        } else {
          System.out.println("ERROR: Invalid format.");
        }
      }
    }
  }

}
