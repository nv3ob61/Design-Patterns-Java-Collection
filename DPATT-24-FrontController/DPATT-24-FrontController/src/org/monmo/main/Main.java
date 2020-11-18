/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.monmo.main;

import org.monmo.controller.FrontController;

/**
 *
 * @author ciclom
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    FrontController frontController = new FrontController();
    frontController.dispatchRequest("HOME");
    frontController.dispatchRequest("STUDENT");
  }

}
