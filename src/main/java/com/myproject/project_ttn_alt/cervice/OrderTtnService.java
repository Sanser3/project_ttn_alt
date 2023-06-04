package com.myproject.project_ttn_alt.cervice;

import com.myproject.project_ttn_alt.order.OrderTtn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderTtnService {
    private OrderTtn orderTtn = new OrderTtn();

    public List<Integer> createListOrderService() {
        System.out.println("Enter order: ");
        int sizeListOrder = orderTtn.getListOrderTtnSize();
        List<Integer> listOrderTtn = new ArrayList<>(sizeListOrder);
        for (int i = 0; i < sizeListOrder; i++) {
            Scanner scanner = new Scanner(System.in);
            listOrderTtn.add(scanner.nextInt());
        }
        return listOrderTtn;
    }
}