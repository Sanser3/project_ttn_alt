package com.myproject.project_ttn_alt.core.cervice;

import com.myproject.project_ttn_alt.core.validation.ValidationRule;
import com.myproject.project_ttn_alt.entityTtn.EntityTtn;
import com.myproject.project_ttn_alt.repository.ArrayListTtnRepository;
import com.myproject.project_ttn_alt.repository.TtnRepository;
import com.myproject.project_ttn_alt.core.validation.ValidationService;
import com.myproject.project_ttn_alt.dto.AddTtnRequest;
import com.myproject.project_ttn_alt.dto.AddTtnResponse;

import java.util.ArrayList;
import java.util.List;

public class AddTtnService {

    private final TtnRepository repository;

    public AddTtnService(TtnRepository repository) {
        this.repository = repository;
    }

    private final List<ValidationRule> validationRuleList = new ArrayList<>();
    private final ValidationService validationService = new ValidationService(validationRuleList);

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
        entity.setAddress(request.getAddress());
        entity.setOrder(request.getOrder());
        return entity;
    }

}
