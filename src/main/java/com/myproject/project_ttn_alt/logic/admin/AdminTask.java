package com.myproject.project_ttn_alt.logic.admin;

import com.myproject.project_ttn_alt.core.cervice.*;
import com.myproject.project_ttn_alt.dto.AddTtnRequest;
import com.myproject.project_ttn_alt.repository.ArrayListTtnRepository;
import com.myproject.project_ttn_alt.repository.TtnRepository;

import java.util.List;
import java.util.Scanner;

public class AdminTask {

    private final TtnRepository repository = new ArrayListTtnRepository();
    private final AddTtnService addTtnService = new AddTtnService(repository);
    private final FindAllTtnService findAllTtnService = new FindAllTtnService(repository);
    private final OrderService orderService = new OrderService();
    private final TaskService taskService = new TaskService();
    private final RequestService requestService = new RequestService();
    public void adminTask() {

        System.out.println("++++++++++AdminTask++++++++++");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("1. Create");
                System.out.println("2. Update");
                System.out.println("3. Delete");
                System.out.println("4. Find Id");
                System.out.println("5. Find Name and Address");
                System.out.println("6. Find All");
                System.out.println("7. Exit");
                int managerIn = scanner.nextInt();

                switch (managerIn) {
                    case 1:
                        System.out.println("Enter 1");
                        createTtnAdmin();
                        break;
                    case 2:
                        System.out.println("Enter 2");
                        updateTtnAdmin();
                        break;
                    case 3:
                        System.out.println("Enter 3");
                        deleteTtnAdmin();
                        break;
                    case 4:
                        System.out.println("Enter 4");
                        findTtnIdAdmin();
                        break;
                    case 5:
                        System.out.println("Enter 5");
                        findTtnNameAndAddressAdmin();
                        break;
                    case 6:
                        System.out.println("Enter 6");
                        findAllTtnAdmin();
                        break;
                    case 7:
                        System.out.println("Enter 7");
                        return;
                }
            } catch (Exception e) {
                System.out.println("Error! Task Admin");
            }
        }
    }

    public void createTtnAdmin() {

        List<String> data = taskService.addNameAndAddressRequest();
        List<Integer> order = orderService.createListOrder();

        var requestCreate = requestService.createRequest(data, order);

        var responseCreate = addTtnService.add((AddTtnRequest) requestCreate);

        System.out.println("Received responseCre" + responseCreate);

    }

    private void updateTtnAdmin() {
        List<String> data = taskService.addNameAndAddressRequest();
        List<Integer> order = orderService.updateListOrder();

        var requestUpdate = requestService.createRequest(data, order);

    }

    private void deleteTtnAdmin() {

    }

    private void findTtnIdAdmin() {

    }

    private void findTtnNameAndAddressAdmin() {

    }

    private void findAllTtnAdmin() {
        var response = findAllTtnService.findAll();
        System.out.println(response);
    }

}
