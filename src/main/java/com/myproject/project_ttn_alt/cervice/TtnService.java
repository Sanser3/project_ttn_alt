package com.myproject.project_ttn_alt.cervice;

import com.myproject.project_ttn_alt.entityTtn.EntityTtn;
import com.myproject.project_ttn_alt.repository.TtnRepositoryMemory;
import com.myproject.project_ttn_alt.validation.TtnValidationService;

import java.util.List;

public class TtnService {
    private TtnRepositoryMemory repository = new TtnRepositoryMemory();
    private TtnValidationService ttnValidationService = new TtnValidationService();
    private OrderTtnService orderTtnService = new OrderTtnService();

    public Integer createTtn(EntityTtn entityTtn){
        ttnValidationService.validate(entityTtn);
        EntityTtn createTtn = repository.insertEntityTtn(entityTtn);
        return createTtn.getId();
    }

    public EntityTtn findTtnId(Integer id){
        return repository.findEntityTtnId(id);
    }

    public EntityTtn findTtnByName(String name){
        return repository.findEntityTtnId(repository.getIdEntityByName(name));
    }

    public List<EntityTtn> findAllTtn(){
        return repository.findAllEntityTtn();
    }

    public EntityTtn updateListOrderTtn(EntityTtn entityTtn){
        entityTtn.setOrder(orderTtnService.createListOrderService());
        return entityTtn;
    }

    public Integer deleteTtn(String name){
        Integer id = repository.getIdEntityByName(name);
        boolean boolDelete = repository.deleteEntityTtn(id);
        if (boolDelete){
            System.out.println("delete ttn service ok: "+id);
            return id;
        }
        return null;
    }
}
