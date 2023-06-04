package com.myproject.project_ttn_alt.validation;

import com.myproject.project_ttn_alt.entityTtn.EntityTtn;

public class TtnNameValidationRule implements TtnValidationRule {
    @Override
    public void validate(EntityTtn entityTtn) {
        if (entityTtn.getName() == null) {
            throw new TtnValidationException("Name must be not null");
        }
    }
}

