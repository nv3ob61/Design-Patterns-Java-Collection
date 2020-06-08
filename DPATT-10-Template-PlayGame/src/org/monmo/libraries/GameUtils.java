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
package org.monmo.libraries;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author nv3ob61
 */
public class GameUtils {

  public static final boolean playerWantsNewChar() {

    boolean isOk = false;
    String answer = getUserInput();

    if (answer.toLowerCase().startsWith("y")) {
      isOk = true;
    }

    return isOk;
  }

  //to do....... very bad implemented!
  public static final String getUserInput() {
    String answer = "";

    System.out.println("Would you like to add a new character to the game (y/n)?");
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    try {
      answer = bf.readLine();
    } catch (Exception e) {
      System.out.println("OOOOPS!: IO Error");
    }

    if (answer == null) {
      return "no";
    }

    return answer;
  }
}
