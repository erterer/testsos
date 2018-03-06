/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundary.rest;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import service.Monitor;

/**
 *
 * @author 878550
 */
@Path("monitor")
@Stateless
public class MonitorResource {
    
    @Inject
    Monitor monitor;
    
    @GET
    public Long getCount(){
        return monitor.getCount();
    }
    
    
}
