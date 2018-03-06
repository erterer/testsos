/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.concurrent.atomic.AtomicLong;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.enterprise.event.Observes;
import util.CoffeeEvent;

/**
 *
 * @author 878550
 */

@Singleton
@Startup
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
public class Monitor {
    private AtomicLong counter = new AtomicLong(0L);
    
    public Long getCount(){
        return counter.longValue();
    }
    
    public void increase(@Observes CoffeeEvent ev){
        counter.getAndIncrement();
    }
    
            
}
