package com.myproject.project_ttn_alt.entityTtn;

import java.util.List;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntityTtn entityTtn = (EntityTtn) o;
        return Objects.equals(id, entityTtn.id) && Objects.equals(name, entityTtn.name) && Objects.equals(order, entityTtn.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, order);
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
