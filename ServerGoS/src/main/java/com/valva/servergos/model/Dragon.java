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

    // Constructors
    public Dragon(){}
    public Dragon(long id, String name, String father) {
        this.id = id;
        this.name = name;
        this.father = father;
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
}