package com.example.michaeliverson.weekendwork;

import java.io.Serializable;

/**
 * Created by michaeliverson on 7/11/17.
 */

public class IvyPojo implements Serializable {
    private String Name;
    private Integer number;

    public IvyPojo()
    {
    }

    public IvyPojo(String name, Integer number)
    {
        this.Name = name;
        this.number = number;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
