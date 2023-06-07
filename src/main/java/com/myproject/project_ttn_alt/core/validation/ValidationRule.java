package com.myproject.project_ttn_alt.core.validation;

import com.myproject.project_ttn_alt.dto.AddTtnRequest;

public interface ValidationRule {
    void validate(AddTtnRequest request);

}
