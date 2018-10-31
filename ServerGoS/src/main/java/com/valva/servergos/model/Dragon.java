/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valva.servergos.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author valva
 */

@XmlRootElement
public class Dragon {
    private long id;
    private String name;
    private String father;

    public Dragon(){}
    
    public Dragon(long id, String name, String father) {
        this.id = id;
        this.name = name;
        this.father = father;
    }
    
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