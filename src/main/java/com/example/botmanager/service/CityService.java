package com.example.botmanager.service;

import com.example.botmanager.dao.CityDao;
import com.example.botmanager.domain.City;
import com.example.botmanager.exception.NoSuchCityException;

/**
 * @author Alexander Lomat
 * @version 0.0.4
 * Service for using CityDAO class for Telegram requests
 */


public class CityService {

    private CityDao cityDao;

    public CityService(){
        cityDao = new CityDao();
    }

    public  City findCityByName(String name) throws NoSuchCityException {
        return cityDao.findByName(name);
    }

    public void addCity(City city){
        cityDao.save(city);
    }

    public void updateCity(City city){
        cityDao.update(city);
    }

    public void deleteCity(City city){
        cityDao.delete(city);
    }
}
