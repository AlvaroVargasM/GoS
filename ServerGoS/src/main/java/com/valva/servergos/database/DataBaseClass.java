package com.valva.servergos.database;

import com.valva.servergos.model.Dragon;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author valva
 */
public class DataBaseClass {
    
    private static Map <Long, Dragon> dragons = new HashMap<>();
    
    public static Map <Long, Dragon> getDragons(){
        return dragons;
    }    
}
