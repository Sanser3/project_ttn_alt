package com.myproject.project_ttn_alt.logic.manager;

import com.myproject.project_ttn_alt.core.cervice.OrderService;

import com.myproject.project_ttn_alt.core.cervice.RequestService;
import com.myproject.project_ttn_alt.core.cervice.TaskService;
import com.myproject.project_ttn_alt.logic.admin.AdminTask;

import java.util.Scanner;

public class ManagerTask {
//    private AddTtnService addTtnService = new AddTtnService();
    private OrderService orderService = new OrderService();
    private TaskService taskService = new TaskService();
    private RequestService requestService = new RequestService();


    public void managerTask() {
        System.out.println("++++++++++ManagerTask++++++++++");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("1. Update");
                System.out.println("2. Find Name");
                System.out.println("3. Find Address");
                System.out.println("4. Find All");
                System.out.println("5. Exit");
                int managerIn = scanner.nextInt();

                switch (managerIn) {
                    case 1:
                        System.out.println("Enter 1");
                        updateTtnManager();
                        break;
                    case 2:
                        System.out.println("Enter 5");
                        findTtnNameManager();
                        break;
                    case 3:
                        System.out.println("Enter 3");
                        findTtnAddressManager();
                        break;
                    case 4:
                        System.out.println("Enter 4");
                        findAllTtnManager();
                        break;
                    case 5:
                        System.out.println("Enter 5");
                        return;
                }
            } catch (Exception e) {
                System.out.println("Error! Task Manager");
            }
        }
    }

    private AdminTask adminTask = new AdminTask();
    private void updateTtnManager() {

//        List<String> data = taskService.addNameAndAddressRequest();
//        List<Integer> order = orderService.updateListOrder();

//        var request = requestService.createRequest(data, order);

//        var response = addTtnService.add((AddTtnRequest) request);
//        System.out.println("Received response" + response);

    }
    private void findTtnAddressManager() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter id: ");
//        Integer id = scanner.nextInt();

//        EntityTtn entityTtn = ttnService.findTtnId(id);
//        System.out.println(entityTtn);
    }

    private void findTtnNameManager(){
//            System.out.println("Enter name Order: ");
//            Scanner scanner = new Scanner(System.in);
//            String name = scanner.nextLine();

//            EntityTtn entityTtn = ttnService.findTtnByName(name);
//            if(entityTtn != null){
//                System.out.println(entityTtn);
//            }else {
//                System.out.println("there is no such customer");
//                System.out.println("create a new");
//            }
    }

    private void findAllTtnManager(){
//        for (EntityTtn entityTtn : ttnService.findAllTtn()) {
//            System.out.println(entityTtn);
//        }

    }
}
