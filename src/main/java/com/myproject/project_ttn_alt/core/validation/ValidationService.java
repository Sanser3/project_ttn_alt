package com.myproject.project_ttn_alt.core.validation;

import com.myproject.project_ttn_alt.dto.AddTtnRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ValidationService {
    private final List<ValidationRule> validationRules;

    public ValidationService(List<ValidationRule> validationRules) {
        this.validationRules = validationRules;
    }

    public List<CoreError> validate(AddTtnRequest request){
        List<CoreError> errors = new ArrayList<>();
        if (request == null){
            errors.add(new CoreError("Must not be null"));
            return errors;
        }
        return validationRules.stream()
                .map(rule -> validate(rule, request))
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    private CoreError validate(ValidationRule rule, AddTtnRequest request){
        try {
            rule.validate(request);

        } catch (ValidationException e){
            return new CoreError(e.getMessage());
        }
        return null;
    }
}
