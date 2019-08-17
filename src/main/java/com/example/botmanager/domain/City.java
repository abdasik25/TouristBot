package com.example.botmanager.domain;

import javax.persistence.*;

/**
 * @author Alexander Lomat
 * @version 0.0.4
 * Entity class
 */


@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(unique = true)
    private String name;

    @Column(length = 1000)
    private String info;

    public City() {
    }

    public City(String name, String info) {
        this.name = name;
        this.info = info;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nCity: \n")
                .append("Id:  ").append(getId())
                .append("\nName:  ").append(getName())
                .append("\nInfo: ").append(getInfo());
        return stringBuilder.toString();
    }
}