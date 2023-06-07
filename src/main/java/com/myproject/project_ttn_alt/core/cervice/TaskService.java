package com.myproject.project_ttn_alt.core.cervice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskService {
    public List<String> addNameAndAddressRequest(){

        List<String> list = new ArrayList<>();
        System.out.println("Enter name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Enter address: ");
        String address = scanner.nextLine();

        list.add(name);
        list.add(address);

        return list;
    }


}
