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
public class HasMoneyState implements State {

  SodaVendingMachine svm;

  public HasMoneyState(SodaVendingMachine svm) {
    this.svm = svm;
  }

  @Override
  public void insertMoney() {
    System.out.println("No need to insert another dollar bill");
  }

  @Override
  public void ejectMoney() {
    System.out.println("Returning your dollar. ");
    svm.setState(svm.getNoMoneySt());
  }

  @Override
  public void select() {
    System.out.println("Selected Item... ");
    svm.setState(svm.getSoldSt());
  }

  @Override
  public void dispense() {
    System.out.println("No soda dispensed yet.");
  }

  @Override
  public String toString() {
    return String.format("Waiting to a new selection...");
  }

}
