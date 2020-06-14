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
public class NoMoneyState implements State{
 
  SodaVendingMachine svm;

  public NoMoneyState(SodaVendingMachine svm) {
    this.svm = svm;
  }
  
  @Override
  public void insertMoney() {
    System.out.println("You inserted a dollar");
    svm.setState(svm.getHasMoneySt());
  }

  @Override
  public void ejectMoney() {
    System.out.println("You have not inserted a dollar"); 
  }

  @Override
  public void select() {
    System.out.println("You selected but there is no money!");
  }

  @Override
  public void dispense() {
    System.out.println("Plz, insert coins. Pay first."); 
  }

  @Override
  public String toString() {
    return String.format("waiting for a dollar");
  }
  
}