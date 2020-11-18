/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.monmo.controller;

import org.monmo.model.StudentView;
import org.monmo.model.TeacherView;

/**
 *
 * @author ciclom
 */
public class Dispatching {

  private final StudentView studentView;
  private final TeacherView teacherView;

  public Dispatching() {
    studentView = new StudentView();
    teacherView = new TeacherView();
  }

  public void dispatch(String request) {
    if (request.equalsIgnoreCase("Student")) {
      studentView.display();
    } else {
      teacherView.display();
    }
  }
}
