package com.myproject.project_ttn_alt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class FindAllTtnResponse {
    private List<TtnDTO> allListTtn;
}
