package com.myproject.project_ttn_alt.core;

import com.myproject.project_ttn_alt.core.validation.ValidationRule;
import com.myproject.project_ttn_alt.entityTtn.EntityTtn;
import com.myproject.project_ttn_alt.repository.ArrayListTtnRepository;
import com.myproject.project_ttn_alt.repository.TtnRepository;
import com.myproject.project_ttn_alt.core.validation.ValidationService;
import dto.AddTtnRequest;
import dto.AddTtnResponse;

import java.util.ArrayList;
import java.util.List;

public class AddTtnService {

    private TtnRepository repository = new ArrayListTtnRepository();
    private List<ValidationRule> validationRuleList = new ArrayList<>();
    private ValidationService validationService = new ValidationService(validationRuleList);

    public AddTtnResponse add(AddTtnRequest request) {
        System.out.println("Received request: " + request);
        var validationResult = validationService.validate(request);
        if (!validationResult.isEmpty()) {
            System.out.println("Validation filed, error: " + validationResult);
            var response = new AddTtnResponse();
            response.setErrors(validationResult);
            return response;
        }
        var entity = convert(request);
        var createEntity = repository.save(entity);
        System.out.println("successfully saved: " + createEntity);
        var response = new AddTtnResponse();
        response.setCreatedTtnId(createEntity.getId());
        System.out.println("Sending response" + response);
        return response;
    }


    private EntityTtn convert(AddTtnRequest request) {
        EntityTtn entity = new EntityTtn();
        entity.setName(request.getName());
        entity.setOrder(request.getOrder());
        return entity;
    }


//    public Integer createTtn(EntityTtn entityTtn){
//        ttnValidationService.validate(entityTtn);
//        EntityTtn createTtn = repository.insertEntityTtn(entityTtn);
//        return createTtn.getId();
//    }
//
//    public EntityTtn findTtnId(Integer id){
//        return repository.findEntityTtnId(id);
//    }
//
//    public EntityTtn findTtnByName(String name){
//        return repository.findEntityTtnId(repository.getIdEntityByName(name));
//    }
//
//    public List<EntityTtn> findAllTtn(){
//        return repository.findAllEntityTtn();
//    }
//
//    public EntityTtn updateListOrderTtn(EntityTtn entityTtn){
//        entityTtn.setOrder(orderTtnService.createListOrderService());
//        return entityTtn;
//    }
//
//    public Integer deleteTtn(String name){
//        Integer id = repository.getIdEntityByName(name);
//        boolean boolDelete = repository.deleteEntityTtn(id);
//        if (boolDelete){
//            System.out.println("delete ttn service ok: "+id);
//            return id;
//        }
//        return null;
//    }
}
