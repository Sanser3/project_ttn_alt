package com.myproject.project_ttn_alt.core.cervice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderService {
    private final int listOrderTtnSize = 3;


    public List<Integer> createListOrder(){
        return new ArrayList<>();
    }

    public List<Integer> updateListOrder() {
        List<Integer> listOrderTtn = new ArrayList<>();
        System.out.println("Enter order: ");
        for (int i = 0; i < listOrderTtnSize; i++) {
            Scanner scanner = new Scanner(System.in);
            listOrderTtn.add(scanner.nextInt());
        }
        return listOrderTtn;
    }

}