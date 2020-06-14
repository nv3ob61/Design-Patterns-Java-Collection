/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.monmo.model;

import org.monmo.interfaces.State;

/**
 *
 * @author nv3ob61
 */
public class SoldOutState implements State{

  SodaVendingMachine svm;

  public SoldOutState(SodaVendingMachine svm) {
    this.svm = svm;
  }
  
  
  @Override
  public void insertMoney() {
    System.out.println("Machine sold out!");  
  }

  @Override
  public void ejectMoney() {
    System.out.println("Insert money first before ejecting");
  }

  @Override
  public void select() {
    System.out.println("No soda available");
  }

  @Override
  public void dispense() {
      System.out.println("Sold out!");
  }

  @Override
  public String toString() {
    return String.format("SOLD OUT!");
  }
  
  
}
