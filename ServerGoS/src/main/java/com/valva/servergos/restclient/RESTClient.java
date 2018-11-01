package com.valva.servergos.restclient;

import com.valva.servergos.model.Dragon;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

/**
 *
 * @author valva
 */
public class RESTClient {
    
    public static void main (String[] args){
        Client client = ClientBuilder.newClient();
      
        Response response = client.target("http://localhost:8080/ServerGoS/webapi/dragons").request().get();
        Dragon dragon = response.readEntity(Dragon.class);
        System.out.println(dragon.getFather());
        
    }
}