package com.myproject.project_ttn_alt.dto;

import com.myproject.project_ttn_alt.core.validation.CoreError;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class AddTtnResponse {
    private Integer createdTtnId;
    private List<CoreError> errors;
}
