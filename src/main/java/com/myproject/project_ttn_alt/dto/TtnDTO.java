package com.myproject.project_ttn_alt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class TtnDTO {
    private Integer id;
    private String name;
    private String address;
    private List<Integer> order;
}
