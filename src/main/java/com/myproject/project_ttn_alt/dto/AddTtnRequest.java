package com.myproject.project_ttn_alt.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class AddTtnRequest {
    private String name;
    private String address;
    private List<Integer> order;
}
