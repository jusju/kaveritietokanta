package com.example.kaveritietokanta.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface KaveriRepository extends CrudRepository<Kaveri, Long> {

    List<Kaveri> findByNimi(String nimi);
    
}