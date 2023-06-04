package com.myproject.project_ttn_alt.cervice;

import com.myproject.project_ttn_alt.entityTtn.EntityTtn;
import com.myproject.project_ttn_alt.repository.TtnInRepository;
import com.myproject.project_ttn_alt.validation.TtnValidationService;

import java.util.LinkedList;
import java.util.List;

public class TtnService {
    private TtnInRepository repository = new TtnInRepository();
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
        return repository.findEntityTtnId(repository.getIdByName(name));
    }

    public List<EntityTtn> findAllTtn(){
        List<EntityTtn> list = new LinkedList<>();
        int sizeTtn = repository.getEntityTtnMapSize();
        for (int i = 0; i < sizeTtn; i++) {
            EntityTtn entityTtn = findTtnId(i);
            list.add(entityTtn);
        }
        return list;
    }

    public EntityTtn updateListOrderTtn(EntityTtn entityTtn){
        entityTtn.setOrder(orderTtnService.createListOrderService());
        return entityTtn;
    }
}
