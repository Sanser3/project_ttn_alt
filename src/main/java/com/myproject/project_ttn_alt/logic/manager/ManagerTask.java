package com.myproject.project_ttn_alt.logic.manager;

import com.myproject.project_ttn_alt.cervice.OrderTtnService;
import com.myproject.project_ttn_alt.cervice.TtnService;
import com.myproject.project_ttn_alt.entityTtn.EntityTtn;

import java.util.Scanner;

public class ManagerTask {
    private TtnService ttnService = new TtnService();
    private OrderTtnService orderTtnService = new OrderTtnService();

    public void managerTask() {
        System.out.println("++++++++++ManagerTask++++++++++");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("1. Create");
                System.out.println("2. Update");
                System.out.println("3. Delete");
                System.out.println("4. Find Id");
                System.out.println("5. Find Name");
                System.out.println("6. Find All");
                System.out.println("7. Exit");
                int managerIn = scanner.nextInt();

                switch (managerIn) {
                    case 1:
                        System.out.println("Enter 1");
                        createTtnManager();
                        break;
                    case 2:
                        System.out.println("Enter 2");
                        updateTtnManager();
                        break;
                    case 3:
                        System.out.println("Enter 3");
                        deleteTtnManager();
                        break;
                    case 4:
                        System.out.println("Enter 4");
                        findTtnIdManager();
                        break;
                    case 5:
                        System.out.println("Enter 5");
                        findTtnNameManager();
                        break;
                    case 6:
                        System.out.println("Enter 6");
                        findAllSizeTtnManager();
                        break;
                    case 7:
                        System.out.println("Enter 7");
                        return;
                }
            } catch (Exception e) {
                System.out.println("Error!");
            }
        }
    }

    private void createTtnManager() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        EntityTtn entityTtn = new EntityTtn();
        entityTtn.setName(name);
        entityTtn.setOrder(orderTtnService.createListOrderService());

        Integer id = ttnService.createTtn(entityTtn);
        System.out.println("Result id: " + id);

    }

    private void findTtnIdManager() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        Integer id = scanner.nextInt();

        EntityTtn entityTtn = ttnService.findTtnId(id);
        System.out.println(entityTtn);
    }

    private void findTtnNameManager(){
        System.out.println("Enter name Order: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        EntityTtn entityTtn = ttnService.findTtnName(name);
        System.out.println(entityTtn);
    }

    private void findAllSizeTtnManager(){
        ttnService.findAllSizeTtn();
    }

    private void updateTtnManager() {
        ttnService.updateListOrderTtn();
    }

    private void deleteTtnManager() {
    }
}
