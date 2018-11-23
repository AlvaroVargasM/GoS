package com.valva.servergos.services;

import com.valva.servergos.database.DataBaseClass;
import com.valva.servergos.models.Dragon;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author valva
 */

public class DragonService {
    
    private Map<Long, Dragon> dragons = DataBaseClass.getDragons();
    
    public DragonService(){
        dragons.put(1L, new Dragon(1, 3, 3, 999, "LordHelpMe", "Commander", "JesusCrist"));
    }
    
    public List<Dragon> getAllDragons() {
	return new ArrayList<Dragon>(dragons.values()); 
    }
    
    public Dragon getDragon(int id) {
	return dragons.get(id);	 
    }
    
    public Dragon addDragon (Dragon dragon){
        dragon.setId(dragons.size() + 1);
        dragons.put(dragon.getId(), dragon);
        return dragon;
    }
    
    public Dragon updateDragon(Dragon dragon) {
	if (dragon.getId() <= 0) {
            return null;
	}
	dragons.put(dragon.getId(), dragon);
	return dragon;
	}
	
    public Dragon removeDragon(long id) {
        return dragons.remove(id);
    }
}