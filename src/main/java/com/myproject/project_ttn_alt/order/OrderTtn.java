package com.myproject.project_ttn_alt.order;

import java.util.ArrayList;
import java.util.List;

public class OrderTtn {
    private List<Integer> listOrderTtn = new ArrayList<>();
    private int listOrderTtnSize = 3;

    public List<Integer> getListOrderTtn() {
        return listOrderTtn;
    }

    public void setListOrderTtn(List<Integer> listOrderTtn) {
        this.listOrderTtn = listOrderTtn;
    }

    public int getListOrderTtnSize() {
        return listOrderTtnSize;
    }

    public void setListOrderTtnSize(int listOrderTtnSize) {
        this.listOrderTtnSize = listOrderTtnSize;
    }
}
