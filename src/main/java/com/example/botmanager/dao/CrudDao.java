package com.example.botmanager.dao;

import com.example.botmanager.domain.City;
import com.example.botmanager.exception.NoSuchCityException;

/**
 * @author Alexander Lomat
 * @version 0.0.4
 * DAO for accessing Telegram request to DB (interface)
 */


public interface CrudDao {
    City findByName(String name) throws NoSuchCityException;
    void save(City city);
    void update(City city);
    void delete(City city);
}
