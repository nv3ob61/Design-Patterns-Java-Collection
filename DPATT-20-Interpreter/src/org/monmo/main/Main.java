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

import org.monmo.interfaces.Expression;
import org.monmo.model.IntToBinaryExpression;
import org.monmo.model.IntToHexExpression;
import org.monmo.model.InterpreterContext;

/**
 *
 * @author nv3ob61
 */
public class Main {

  public InterpreterContext inter;

  public static void main(String[] args) {

    String first = "28 in Binary";
    String secon = "28 in Hex";

    Main interpreter = new Main(new InterpreterContext());

    //end
    System.out.println(first + " = " + interpreter.interpret(first));
    System.out.println(secon + " = " + interpreter.interpret(secon));
  }

  public Main(InterpreterContext interp) {
    this.inter = interp;
  }

  public String interpret(String str) {
    Expression expr = null;

    if (str.contains("Hex")) {
      expr = new IntToHexExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
    } else if (str.contains("Binary")) {
      expr = new IntToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
    } else {
      return str;
    }

    return expr.interpreter(inter);
  }
}
