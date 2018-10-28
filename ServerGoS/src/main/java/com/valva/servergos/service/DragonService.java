package com.valva.servergos.service;

import com.valva.servergos.database.DataBaseClass;
import com.valva.servergos.model.Dragon;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author valva
 */

public class DragonService {
    
    private Map <Long, Dragon> dragons = DataBaseClass.getDragons();
    
    public DragonService(){
        dragons.put(1L, new Dragon(1, "Smaug", "valva"));
        dragons.put(2L, new Dragon(2, "Bonfire", "valva"));
    }
    
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