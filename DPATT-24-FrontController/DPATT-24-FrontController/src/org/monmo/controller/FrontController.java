/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.monmo.controller;

/**
 *
 * @author ciclom
 */
public class FrontController {

  private Dispatching Dispatching;

  public FrontController() {
    Dispatching = new Dispatching();
  }

  private boolean isAuthenticUser() {
    System.out.println("Authentication successful.");
    return true;
  }

  private void trackRequest(String request) {
    System.out.println("Requested View: " + request);
  }

  public void dispatchRequest(String request) {
    trackRequest(request);

    if (isAuthenticUser()) {
      Dispatching.dispatch(request);
    }
  }
}
