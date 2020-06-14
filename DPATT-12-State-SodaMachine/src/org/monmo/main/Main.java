/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.monmo.main;

import org.monmo.model.SodaVendingMachine;

/**
 *
 * @author nv3ob61
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    SodaVendingMachine svm = new SodaVendingMachine(1);
    //view state
    System.out.println(svm);

    //
    System.out.println();
    System.out.println("---");
    System.out.println();

    svm.ejectMoney();
    svm.selectSoda();
    System.out.println();
    System.out.println(svm);
    System.out.println("---");
    svm.insertMoney();
    svm.selectSoda();
    svm.insertMoney();
//    svm.dispense();
    System.out.println();
//    System.out.println(svm);
    System.out.println("---");
//
//
//    System.out.println();
//
//    svm.insertMoney();
//    svm.selectSoda();
//    System.out.println("---");
//    System.out.println();
//    svm.insertMoney();
//    svm.selectSoda();
//    svm.insertMoney();
//    svm.selectSoda();
//    svm.insertMoney();
//    svm.selectSoda();
//    svm.insertMoney();
//    svm.selectSoda();
//    svm.insertMoney();
//    svm.selectSoda();
//    svm.insertMoney();
//    svm.selectSoda();
//    svm.insertMoney();
//    svm.selectSoda();
//    svm.insertMoney();
//    svm.selectSoda();
//    svm.insertMoney();
//    svm.selectSoda();
//
//    //view state
//    System.out.println(svm);

  }

}
