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
public class SoldState implements State {
  
  SodaVendingMachine svm;

  public SoldState(SodaVendingMachine svm) {
    this.svm = svm;
  }

  
  
  @Override
  public void insertMoney() {
    System.out.println("Give a second... soda coming right up");  
  }

  @Override
  public void ejectMoney() {
    System.out.println("Sorry... soda is coming");  
  }

  @Override
  public void select() {
    System.out.println("Nope... you can't eject the money if you "
            + "already have the soda");  
  }

  @Override
  public void dispense() {
    System.out.println("Stop trying to get second soda for free");  
    if(svm.getCount()>0){
      svm.setState(svm.noMoneySt);
    } else {
      System.out.println("Sorry... out of sodas");
      svm.setState(svm.soldOutSt);
    }
  }

  @Override
  public String toString() {
    return String.format("Dispensing soda...");
  }
  
}
