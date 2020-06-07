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

import org.monmo.interfaces.Observer;
import org.monmo.interfaces.Subject;

/**
 *
 * @author nv3ob61
 */
public class EmailTopicSubscriber implements Observer {

  //creamos el mensaje
  private String name;

  //referencia a la clase Subject
  private Subject topic;

  public EmailTopicSubscriber(String name) {
    this.name = name;
  }

  @Override
  public void update() {
    String msg = (String) topic.getUpdate(this);

    if (msg == null) {
      System.out.println(name + "No new messages on this topic!");
    } else {
      System.out.println(name + "Retrieving message: " + msg);
    }
  }

  @Override
  public void setSubject(Subject sub) {
    this.topic = sub;
  }

}
