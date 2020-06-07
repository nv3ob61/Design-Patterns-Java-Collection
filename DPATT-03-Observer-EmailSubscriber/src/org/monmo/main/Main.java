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

import org.monmo.interfaces.Observer;
import org.monmo.model.EmailTopic;
import org.monmo.model.EmailTopicSubscriber;

/**
 *
 * @author nv3ob61
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    EmailTopic topic = new EmailTopic();

    //Create Observers
    Observer o1 = new EmailTopicSubscriber("First Observer ");
    Observer o2 = new EmailTopicSubscriber("Second Observer ");
    Observer o3 = new EmailTopicSubscriber("Third Observer ");

    //register them
    topic.register(o1);
    topic.register(o2);
    topic.register(o3);

    //Attaching observer to subject
    o1.setSubject(topic);
    o2.setSubject(topic);
    o3.setSubject(topic);

    //check for updates
    o1.update();
    o3.update();

    //Provider / Subject (broadcaster)   
    topic.postMessage("Hi Pacos!");

    //unregister objects
    topic.unregister(o1);

    //Provider / Subject (broadcaster)   
    topic.postMessage("Bye Observer 1!");
  }

}
