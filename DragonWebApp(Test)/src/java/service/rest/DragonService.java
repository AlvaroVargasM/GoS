package service.rest;

import dragon.Dragon;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path ("/Dragon")
public class DragonService {
     
    @GET
    @Produces (MediaType.APPLICATION_XML)
    public List <Dragon> getDragons(){
        List <Dragon> dragons = new ArrayList <Dragon>();
            dragons.add (new Dragon ("Fausto","Commander","Leroy",600,2,1));
            dragons.add (new Dragon ("Mark","Captain","Lis",800,3,5));
            
        return dragons;
    }
}