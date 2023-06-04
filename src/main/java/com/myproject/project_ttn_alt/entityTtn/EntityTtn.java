package com.myproject.project_ttn_alt.entityTtn;

import java.util.List;

public class EntityTtn {
    private Integer id;
    private String name;
    private List<Integer> order;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getOrder() {
        return order;
    }

    public void setOrder(List<Integer> order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "EntityTtn{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", order=" + order +
                '}';
    }
}
