package com.myproject.project_ttn_alt.console;

import com.myproject.project_ttn_alt.logic.admin.AdminTask;
import com.myproject.project_ttn_alt.logic.customer.CustomerTask;
import com.myproject.project_ttn_alt.logic.driver.DriverTask;
import com.myproject.project_ttn_alt.logic.manager.ManagerTask;

import java.util.Scanner;

public class ConsoleUI {
    private AdminTask adminTask = new AdminTask();
    private ManagerTask managerTask = new ManagerTask();
    private DriverTask driverTask = new DriverTask();
    private CustomerTask customerTask = new CustomerTask();

    public void execute() {

        System.out.println("++++++++++ConsoleUI++++++++++");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("1. Admin");
                System.out.println("2. Manager");
                System.out.println("3. Driver");
                System.out.println("4. Customer");
                System.out.println("5. Exit");
                int usIn = scanner.nextInt();

                switch (usIn) {
                    case 1:
                        System.out.println("Enter 1");
                        adminTask.adminTask();
                        break;
                    case 2:
                        System.out.println("Enter 2");
                        managerTask.managerTask();
                        break;
                    case 3:
                        System.out.println("Enter 3");
                        driverTask.driverTask();
                        break;
                    case 4:
                        System.out.println("Enter 4");
                        customerTask.customerTask();
                        break;
                    case 5:
                        System.out.println("Enter 5");
                        return;
                }
            } catch (Exception e) {
                System.out.println("Error! ConsoleUI");
            }
//            scanner.close();
        }

    }
}
