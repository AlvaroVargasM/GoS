package com.valva.servergos.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * This class is the model of dragon, it can be converted into XML.
 * @author valva
 */

@XmlRootElement
public class Dragon {
    
    // Atributes
    private long id;
    private String name;
    private String father;
    private String rank;
    private int speed;
    private int resistence;
    private int age;

    // Constructors
    public Dragon(){}
    public Dragon(long id, String name, String father, String rank, int speed, int resistence, int age) {
        this.id = id;
        this.name = name;
        this.father = father;
        this.rank = rank;
        this.speed = speed;
        this.resistence = resistence;
        this.age = age;
    }
    
    // Getters and setters
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getFather() {
        return father;
    }
    public void setFather(String father) {
        this.father = father;
    }

    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getResistence() {
        return resistence;
    }
    public void setResistence(int resistence) {
        this.resistence = resistence;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }    
}