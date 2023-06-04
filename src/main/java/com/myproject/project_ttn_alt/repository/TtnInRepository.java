package com.myproject.project_ttn_alt.repository;

import com.myproject.project_ttn_alt.entityTtn.EntityTtn;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TtnInRepository {
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

    public int getEntityTtnMapSize() {
        return entityTtnMap.size();
    }

    public Integer getIdByName(String name) {
        Set<Map.Entry<Integer, EntityTtn>> entrySet = entityTtnMap.entrySet();
        Integer keySearch = null;
        for (Map.Entry<Integer, EntityTtn> pair : entrySet) {
            if (name.equals(pair.getValue().getName())) {
                keySearch = Integer.valueOf(pair.getKey());
            }
        }
        return keySearch;
    }

    public EntityTtn updateEntityTtn(){

        return null;
    }
}
