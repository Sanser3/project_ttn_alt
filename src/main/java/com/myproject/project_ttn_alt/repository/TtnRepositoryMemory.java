package com.myproject.project_ttn_alt.repository;

import com.myproject.project_ttn_alt.entityTtn.EntityTtn;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TtnRepositoryMemory {
    private Integer ttnId = 0;
    private Map<Integer, EntityTtn> entityTtnMap = new HashMap<>();

    public EntityTtn insertEntityTtn(EntityTtn entityTtn) {
        entityTtn.setId(ttnId++);
        entityTtnMap.put(entityTtn.getId(), entityTtn);
        return entityTtn;
    }

    public EntityTtn findEntityTtnId(Integer id) {
        return entityTtnMap.get(id);
    }

    public List<EntityTtn> findAllEntityTtn() {
        List<EntityTtn> list = new LinkedList<>();
        for (Map.Entry<Integer, EntityTtn> entry : entityTtnMap.entrySet()) {
            list.add(entry.getValue());
        }
        return list;
    }

    public Integer getIdEntityByName(String name) {
        Set<Map.Entry<Integer, EntityTtn>> entrySet = entityTtnMap.entrySet();
        Integer keySearch = null;
        for (Map.Entry<Integer, EntityTtn> pair : entrySet) {
            if (name.equals(pair.getValue().getName())) {
                keySearch = Integer.valueOf(pair.getKey());
            }
        }
        return keySearch;
    }

    public boolean deleteEntityTtn(Integer id) {
        boolean deleteEntityTtn = false;
        if (entityTtnMap.containsKey(id)) {
            entityTtnMap.remove(id);
            deleteEntityTtn = true;
            System.out.println("delete ttn repository: " + id);
        }
        return deleteEntityTtn;
    }
}
