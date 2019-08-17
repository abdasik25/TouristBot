package com.example.botmanager.repository;

import com.example.botmanager.domain.City;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * @author Alexander Lomat
 * @version 0.0.4
 * Repository class for Spring
 */


public interface CityRepository extends CrudRepository<City, Integer> {

    @Transactional
    City findByName(String name);

    void deleteByName(String name);

}