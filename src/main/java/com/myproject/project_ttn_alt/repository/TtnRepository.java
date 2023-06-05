package com.myproject.project_ttn_alt.repository;

import com.myproject.project_ttn_alt.entityTtn.EntityTtn;

import java.util.List;
import java.util.Optional;

public interface TtnRepository {

    EntityTtn save(EntityTtn entityTtn);

    List<EntityTtn> findAll();

    Optional<EntityTtn> findById(Integer id);

}
