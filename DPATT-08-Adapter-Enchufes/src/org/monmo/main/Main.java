/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.monmo.main;

import org.monmo.interfaces.SocketAdapter;
import org.monmo.model.SocketAdapterImplement;
import org.monmo.model.SocketObjectAdapterImplement;
import org.monmo.model.Volt;

/**
 *
 * @author nv3ob61
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    testingObjectAdapter();
    //separador
    System.out.println("---");

    testingClassAdapter();
  }

  private static void testingObjectAdapter() {
    SocketAdapter socketAdapter = new SocketObjectAdapterImplement();

    Volt v1 = getVolt(socketAdapter, 1);
    Volt v3 = getVolt(socketAdapter, 3);
    Volt v12 = getVolt(socketAdapter, 12);
    Volt v120 = getVolt(socketAdapter, 120);
    Volt v240 = getVolt(socketAdapter, 240);

    System.out.println(" 1V is using Object Adapter " + v1.getVolts());
    System.out.println(" 3V is using Object Adapter " + v3.getVolts());
    System.out.println(" 12V is using Object Adapter " + v12.getVolts());
    System.out.println(" 120V is using Object Adapter " + v120.getVolts());
    System.out.println(" 240V is using Object Adapter " + v240.getVolts());
  }

  private static void testingClassAdapter() {
    SocketAdapter socketAdapter = new SocketAdapterImplement();

    Volt v1 = getVolt(socketAdapter, 1);
    Volt v3 = getVolt(socketAdapter, 3);
    Volt v12 = getVolt(socketAdapter, 12);
    Volt v120 = getVolt(socketAdapter, 120);
    Volt v240 = getVolt(socketAdapter, 240);

    System.out.println(" 1V is using Class Adapter " + v1.getVolts());
    System.out.println(" 3V is using Class Adapter " + v3.getVolts());
    System.out.println(" 12V is using Class Adapter " + v12.getVolts());
    System.out.println(" 120V is using Class Adapter " + v120.getVolts());
    System.out.println(" 240V is using Class Adapter " + v240.getVolts());
  }

  private static Volt getVolt(SocketAdapter sa, int i) {

    switch (i) {
      case 1:
        return sa.get1V();
      case 3:
        return sa.get3V();
      case 12:
        return sa.get12V();
      case 120:
        return sa.get120V();
      case 240:
        return sa.get240V();
      default:
        return sa.get240V();
    }
  }
}
