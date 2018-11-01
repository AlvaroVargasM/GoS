package com.valva.servergos.resources;

import com.valva.servergos.model.Dragon;
import com.valva.servergos.service.DragonService;
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
 * This class manages the dragon resource and contains the HTTP methods to 
 * interact with its service.
 * @author valva
 */
@Path ("/dragons")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class DragonResource {
    
    DragonService dragonService = new DragonService();
    
    @GET
    public List<Dragon> getDragons(){
        System.out.println("All dragons were consulted");
        return dragonService.getAllDragons();
    }
    
    @POST       
    public Dragon addDragon(Dragon dragon){
        System.out.println("A new dragon was added");
        return dragonService.addDragon(dragon);
    }
    
    @PUT
    @Path("/{dragonId}")
    public Dragon updateDragon(@PathParam("dragonId") long id, Dragon dragon){
        System.out.println("The dragon number "+id+" was updated");
        dragon.setId(id);
        return dragonService.updateDragon(dragon);
    }
    
    @DELETE
    @Path("/{dragonId}")    
     public void deleteDragon(@PathParam("dragonId") long id){
        System.out.println("The dragon number "+id+" was deleted"); 
        dragonService.removeDragon(id);
     }
    
    @GET
    @Path("/{dragonId}")
    public Dragon getDragon(@PathParam("dragonId") long id){
        System.out.println("The dragon number "+id+" was consulted");
        return dragonService.getDragon(id);
    }        
}