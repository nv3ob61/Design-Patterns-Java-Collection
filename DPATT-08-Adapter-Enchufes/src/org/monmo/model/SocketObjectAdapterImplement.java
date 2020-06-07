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
public class SocketObjectAdapterImplement implements SocketAdapter {

  private Socket socket = new Socket();

  @Override
  public Volt get240V() {
    return socket.getVolt();
  }

  @Override
  public Volt get120V() {
    Volt v = socket.getVolt();
    return SocketAdapterImplement.convertVolt(v, 10);
  }

  @Override
  public Volt get12V() {
    Volt v = socket.getVolt();
    return SocketAdapterImplement.convertVolt(v, 100);
  }

  @Override
  public Volt get3V() {
   Volt v = socket.getVolt();
    return SocketAdapterImplement.convertVolt(v, 150);
  }

  @Override
  public Volt get1V() {
    Volt v = socket.getVolt();
    return SocketAdapterImplement.convertVolt(v, 200);
  }

}
