package com.valva.servergos.models;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author valva
 */
@XmlRootElement
public class Dragon {
    
    //Atributes
    private int id;
    private int resistance;
    private int speed;
    private int age;
    private String name;
    private String rank;
    private String father;
    
    //Constructors
    public Dragon() {}
    public Dragon(int id, int resistance, int speed, int age, String name, String rank, String father) {
        this.id = id;
        this.resistance = resistance;
        this.speed = speed;
        this.age = age;
        this.name = name;
        this.rank = rank;
        this.father = father;
    }
    
    //Getters and setters
    public long getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
        
    public int getResistance() {
        return resistance;
    }
    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getFather() {
        return father;
    }
    public void setFather(String father) {
        this.father = father;
    }  
}