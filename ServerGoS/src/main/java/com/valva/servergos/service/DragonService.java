package com.valva.servergos.service;

import com.valva.servergos.database.DataBaseClass;
import com.valva.servergos.model.Dragon;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * This class manages the dragon model from the semi database
 * @author valva
 */

public class DragonService {
    
    private Map <Long, Dragon> dragons = DataBaseClass.getDragons();
    
    public DragonService(){
        dragons.put(1L, new Dragon(1, "Smaug", "Valva", "Captain", 1, 2, 100));
    }
    
    // Methods for using the dragon in the semi database
    public List<Dragon> getAllDragons(){
        return new ArrayList <Dragon> (dragons.values());
    }
    
    public Dragon getDragon(long id){
        return dragons.get(id);
    }
    
    public Dragon addDragon (Dragon dragon){
        dragon.setId(dragons.size() + 1);
        dragons.put(dragon.getId(), dragon);
        return dragon;
    }
    
    public Dragon updateDragon(Dragon dragon){
        if (dragon.getId() <= 0){
            return null;
        }
        dragons.put(dragon.getId(), dragon);
        return dragon;
    }
    
    public Dragon removeDragon(long id){
        return dragons.remove(id);
    }
}