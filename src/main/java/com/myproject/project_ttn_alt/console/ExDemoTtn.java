package com.myproject.project_ttn_alt.console;

import com.myproject.project_ttn_alt.logic.customer.CustomerTask;
import com.myproject.project_ttn_alt.logic.driver.DriverTask;
import com.myproject.project_ttn_alt.logic.manager.ManagerTask;

import java.util.Scanner;

public class ExDemoTtn {
    public static void main(String[] args) {

        ManagerTask managerTask = new ManagerTask();
        DriverTask driverTask = new DriverTask();
        CustomerTask customerTask = new CustomerTask();

        System.out.println("++++++++++MenuTask++++++++++");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("1. Manager");
                System.out.println("2. Driver");
                System.out.println("3. Customer");
                System.out.println("4. Exit");
                int usIn = scanner.nextInt();

                switch (usIn) {
                    case 1:
                        System.out.println("Enter 1");
                        managerTask.managerTask();
                        break;
                    case 2:
                        System.out.println("Enter 2");
                        driverTask.driverTask();
                        break;
                    case 3:
                        System.out.println("Enter 3");
                        customerTask.customerTask();
                        break;
                    case 4:
                        System.out.println("Enter 4");
                        return;
                }
            } catch (Exception e) {
                System.out.println("Error!");
            }
//            scanner.close();
        }

    }
}
