/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
