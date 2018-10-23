package dragon;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Dragon {
    private String name;
    private String rank;
    private String father;
    private int age;
    private int resistance;
    private int volocity;

    
    public Dragon() {
    }
    public Dragon(String name, String rank, String father, int age, int resistance, int velocity) {
        this.name = name;
        this.rank = rank;
        this.father = father;
        this.age = age;
        this.resistance = resistance;
        this.volocity = velocity;
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
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getResistance() {
        return resistance;
    }
    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public int getVolocity() {
        return volocity;
    }
    public void setVolocity(int volocity) {
        this.volocity = volocity;
    }   
}