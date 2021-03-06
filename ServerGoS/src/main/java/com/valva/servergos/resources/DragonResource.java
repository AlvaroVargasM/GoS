package com.valva.servergos.resources;

import com.valva.servergos.models.Dragon;
import com.valva.servergos.services.DragonService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author valva
 */

@Path ("/Dragons")
@Consumes (MediaType.APPLICATION_XML)
@Produces (MediaType.APPLICATION_XML)
public class DragonResource {
    
    DragonService dragonService = new DragonService();
    
    @GET
    public List<Dragon> getDragons(){
        return dragonService.getAllDragons();
    }
    
    @POST       
    public Dragon addDragon(Dragon dragon){
        return dragonService.addDragon(dragon);
    }
    
    @PUT
    @Path("/{dragonId}")
    public Dragon updateDragon(@PathParam("dragonId") int id, Dragon dragon){
        dragon.setId(id);
        return dragonService.updateDragon(dragon);
    }
    
    @DELETE
    @Path("/{dragonId}")    
     public void deleteDragon(@PathParam("dragonId") int id){
        dragonService.removeDragon(id);
     }
    
    
    @GET
    @Path("/{dragonId}")
    public Dragon getDragon(@PathParam("dragonId") int id){
        return dragonService.getDragon(id);
    }        
}