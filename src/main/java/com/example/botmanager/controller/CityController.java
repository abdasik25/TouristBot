package com.example.botmanager.controller;

import com.example.botmanager.domain.City;
import com.example.botmanager.repository.CityRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.transaction.Transactional;
import java.util.Map;

/**
 * @author Alexander Lomat
 * @version 0.0.4
 * Spring application controller class
 */


@Controller
@Transactional
public class CityController {

    @Autowired
    private CityRepository cityRepository;

    private static final Logger LOGGER = LogManager.getLogger();

    @GetMapping
    public String mainPage(Map<String, Object> model) {
        Iterable<City> messages = cityRepository.findAll();
        model.put("cities", messages);
        return "main";
    }

    @PostMapping("addCity")
    public String addCity(@RequestParam String name, @RequestParam String info, Map<String, Object> model) {
        City city = new City(name, info);
        cityRepository.save(city);
        LOGGER.info(city + "was added.");
        Iterable<City> messages = cityRepository.findAll();
        model.put("cities", messages);
        return "main";
    }

    @PostMapping("editCity")
    public String editCity(@RequestParam String name, @RequestParam String info, Map<String, Object> model) {
        City city = cityRepository.findByName(name);
        if (city != null) {
            city.setName(name);
            city.setInfo(info);
            cityRepository.save(city);
            LOGGER.info(city + "was edited.");
        }
        LOGGER.error("EDITING: There is no city named "+ name);
        Iterable<City> messages = cityRepository.findAll();
        model.put("cities", messages);
        return "main";
    }

    @PostMapping("deleteCity")
    public String deleteCity(@RequestParam String name, Map<String, Object> model) {
        cityRepository.deleteByName(name);
        LOGGER.error("DELETING: City named "+ name + " was deleted.");
        Iterable<City> messages = cityRepository.findAll();
        model.put("cities", messages);
        return "main";
    }


}