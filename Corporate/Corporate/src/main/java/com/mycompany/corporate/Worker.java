
package com.mycompany.corporate;

public class Worker {
    private int id;
    private String name;
    private String surname;
    private String field;
    private String wage;

    public Worker(int id, String name, String surname, String field, String wage) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.field = field;
        this.wage = wage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }
    
    
}
