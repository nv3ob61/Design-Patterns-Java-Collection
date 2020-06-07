/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.monmo.interfaces;

import org.monmo.model.Volt;

/**
 *
 * @author nv3ob61
 */
public interface SocketAdapter {

  Volt get240V();

  Volt get120V();

  Volt get12V();

  Volt get3V();

  Volt get1V();
}
