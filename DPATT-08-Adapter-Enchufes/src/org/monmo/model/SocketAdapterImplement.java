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

import org.monmo.interfaces.SocketAdapter;

/**
 *
 * @author nv3ob61
 */
//Class adapter
public class SocketAdapterImplement extends Socket implements SocketAdapter {

  @Override
  public Volt get240V() {
    return getVolt();
  }

  @Override
  public Volt get120V() {
    Volt v = getVolt();
    return convertVolt(v, 10);
  }

  @Override
  public Volt get12V() {
    Volt v = getVolt();
    return convertVolt(v, 100);
  }

  @Override
  public Volt get3V() {
    Volt v = getVolt();
    return convertVolt(v, 150);
  }

  @Override
  public Volt get1V() {
    Volt v = getVolt();
    return convertVolt(v, 200);
  }

  public static final Volt convertVolt(Volt v, int i) {
    return new Volt(v.getVolts() / i);
  }

}
