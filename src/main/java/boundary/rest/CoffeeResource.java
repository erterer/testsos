/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundary.rest;

import domain.Coffee;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import service.CoffeeService;
 

/**
 *
 * @author 878550
 */
@Path("coffees")
@Stateless
public class CoffeeResource {
    
  
    @Inject
    CoffeeService coffeeService;

    @GET
    public List<Coffee> AllCoffee() {
        return coffeeService.allCoffee();
    }  
    
    @GET
    @Path("surprice")
    public Coffee getSomeCoffee() {
//        return new Coffee("dd","sdfsd");
        return coffeeService.allCoffee().get(0);
    }  
   
    @GET
    @Path("{id}")
    public Coffee getACoffee(@PathParam("id") Long id) {
        return coffeeService.findCoffee(id);
    }  
    
}
