package com.myproject.project_ttn_alt.repository;

import com.myproject.project_ttn_alt.entityTtn.EntityTtn;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ArrayListTtnRepository implements TtnRepository {

    Integer idFirst = 0;
    private final List<EntityTtn> entityDataBase = new ArrayList<>();

    @Override
    public EntityTtn save(EntityTtn entityTtn) {
        if (entityTtn.getId() != null) {
            return update(entityTtn);
        } else {
            entityTtn.setId(idFirst);
            idFirst++;
            entityDataBase.add(entityTtn);
        }
        System.out.println("entityDataBase: "+entityDataBase);
        return entityTtn;
    }

    public EntityTtn update(EntityTtn entityTtn) {
        for (int i = 0; i < entityDataBase.size(); i++) {
            var existingEntity = entityDataBase.get(i);
            if (existingEntity.getId().equals(entityTtn.getId())) {
                entityDataBase.set(i, entityTtn);
                return entityTtn;
            }
        }
        throw new IllegalStateException("Failed to update");
    }

    @Override
    public List<EntityTtn> findAll() {
        return entityDataBase;
    }

    @Override
    public Optional<EntityTtn> findById(Integer id) {
        return entityDataBase.stream()
                .filter(entityTtn -> entityTtn.getId().equals(id))
                .findFirst();
    }

    @Override
    public Integer deleteById(Integer id) {
        return null;
    }

    @Override
    public Integer deleteByName(String name) {
        return null;
    }

    @Override
    public Optional<EntityTtn> findByName(String name) {
        return entityDataBase.stream()
                .filter(entityTtn -> entityTtn.getName().equals(name))
                .findFirst();
    }

//    public EntityTtn insertEntityTtn(EntityTtn entityTtn) {
//        entityTtn.setId(ttnId++);
//        entityTtnMap.put(entityTtn.getId(), entityTtn);
//        return entityTtn;
//    }
//
//    public EntityTtn findEntityTtnId(Integer id) {
//        return entityTtnMap.get(id);
//    }

//    public List<EntityTtn> findAllEntityTtn() {
//        List<EntityTtn> list = new LinkedList<>();
//        for (Map.Entry<Integer, EntityTtn> entry : entityTtnMap.entrySet()) {
//            list.add(entry.getValue());
//        }
//        return list;
//    }

//    public Integer getIdEntityByName(String name) {
//        Set<Map.Entry<Integer, EntityTtn>> entrySet = entityTtnMap.entrySet();
//        Integer keySearch = null;
//        for (Map.Entry<Integer, EntityTtn> pair : entrySet) {
//            if (name.equals(pair.getValue().getName())) {
//                keySearch = Integer.valueOf(pair.getKey());
//            }
//        }
//        return keySearch;
//    }
//
//    public boolean deleteEntityTtn(Integer id) {
//        boolean deleteEntityTtn = false;
//        if (entityTtnMap.containsKey(id)) {
//            entityTtnMap.remove(id);
//            deleteEntityTtn = true;
//            System.out.println("delete ttn repository: " + id);
//        }
//        return deleteEntityTtn;
//    }


}
