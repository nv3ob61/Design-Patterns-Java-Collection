/* 
 * Copyright (C) 2020 mon_mode   0mon.mode@gmail.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package org.monmo.main;

import org.monmo.controller.EmpController;
import org.monmo.model.Employee;
import org.monmo.view.EmpDashboardView;

/**
 *
 * @author nv3ob61
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //retrieve info from emp
    Employee emp = retrieveEmployee();

    //create view to which we'll write out our employee info
    EmpDashboardView view = new EmpDashboardView();

    //create controller
    EmpController controller = new EmpController(emp, view);

    //update dashboard view
    controller.updateDashboardView();
  }

  public static Employee retrieveEmployee() {
    Employee emp = new Employee();

    emp.setFirstName("Paco");
    emp.setLastName("Mer");
    emp.setSsNumber("001");
    emp.setSalary(40000);

    return emp;
  }
}
