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
public class SodaVendingMachine {

  //states
  State soldOutSt;
  State noMoneySt;
  State hasMoneySt;
  State soldSt;

  //initial state
  State state = getSoldOutSt();

  //init count
  int count = 0;

  public SodaVendingMachine(int numberOfSodas) {
    soldOutSt = new SoldOutState(this);
    noMoneySt = new NoMoneyState(this);
    hasMoneySt = new HasMoneyState(this);
    soldSt = new SoldState(this);

    this.count = numberOfSodas;

    if (numberOfSodas > 0) {
      state = noMoneySt;   // if there are more than 0 sodas set state to noMoney
    } else if (numberOfSodas < 1){
      state = soldOutSt; //0 or less to soldOut
    }
  }

  //Actions
  public void insertMoney() {
    state.insertMoney();
  }

  public void ejectMoney() {
    state.ejectMoney();
  }

  public void selectSoda() {
    state.select();
  }

  public void dispense() {
    state.dispense();
  }

  //getters & setters for all 
  int getCount() {
    return count;
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public State getSoldOutSt() {
    return soldOutSt;
  }

  public State getNoMoneySt() {
    return noMoneySt;
  }

  public State getHasMoneySt() {
    return hasMoneySt;
  }

  public State getSoldSt() {
    return soldSt;
  }

  public void setSoldOutSt(State soldOutSt) {
    this.soldOutSt = soldOutSt;
  }

  public void setNoMoneySt(State noMoneySt) {
    this.noMoneySt = noMoneySt;
  }

  public void setHasMoneySt(State hasMoneySt) {
    this.hasMoneySt = hasMoneySt;
  }

  public void setSoldSt(State soldSt) {
    this.soldSt = soldSt;
  }

  @Override
  public String toString() {
    return String.format(
            "The SodaMachine: %n"
            + "COUNT: %d%n"
            + "%n"
            + "STATE: %s", count, state);
  }

}
