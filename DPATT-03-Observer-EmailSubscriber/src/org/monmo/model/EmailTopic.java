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
import org.monmo.interfaces.Observer;
import org.monmo.interfaces.Subject;

/**
 *
 * @author nv3ob61
 */
public class EmailTopic implements Subject {

  private List<Observer> observers;
  private String message;

  public EmailTopic() {
    this.observers = new ArrayList<>();

  }

  @Override
  public void register(Observer obs) {
    if (obs == null) {
      throw new NullPointerException("Null object/Observer");
    }

    if (!observers.contains(obs)) {
      observers.add(obs);
    }

  }

  @Override
  public void unregister(Observer obs) {

    observers.remove(obs);
  }

  @Override
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update();
    }
  }

  @Override
  public Object getUpdate(Observer obs) {
    return this.message;
  }

  public void postMessage(String msg) {
    System.out.println("---");
    System.out.println("Message posted to my topic : " + msg);
    System.out.println("---");
    this.message = msg;
    //cada vez que se postee se notifica a los observadores.
    notifyObservers();
  }
}
