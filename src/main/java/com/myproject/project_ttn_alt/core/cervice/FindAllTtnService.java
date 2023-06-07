package com.myproject.project_ttn_alt.core.cervice;

import com.myproject.project_ttn_alt.dto.FindAllTtnResponse;
import com.myproject.project_ttn_alt.dto.TtnDTO;
import com.myproject.project_ttn_alt.entityTtn.EntityTtn;
import com.myproject.project_ttn_alt.repository.TtnRepository;

import java.util.List;
import java.util.stream.Collectors;

public class FindAllTtnService {

    private final TtnRepository repository;

    public FindAllTtnService(TtnRepository repository) {
        this.repository = repository;
    }

    public FindAllTtnResponse findAll(){
        List<TtnDTO> ttns = repository.findAll().stream()
                .map(this::convert)
                .collect(Collectors.toList());
        return new FindAllTtnResponse(ttns);
    }

    private TtnDTO convert(EntityTtn entityTtn){
        return new TtnDTO(entityTtn.getId(), entityTtn.getName(), entityTtn.getAddress(), entityTtn.getOrder());
    }
}
