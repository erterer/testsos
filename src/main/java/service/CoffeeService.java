/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.CoffeeDao;
import domain.Coffee;
import java.util.List;
import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import util.CoffeeEvent;

@Stateless
public class CoffeeService {

    @Inject
    Event<CoffeeEvent> coffeeEvent;

    @Inject
    CoffeeDao coffeeDao;

    public List<Coffee> allCoffee() {
        CoffeeEvent payLoad = new CoffeeEvent("all");
        coffeeEvent.fire(payLoad);
        return coffeeDao.allCoffee();
    }

    public Coffee findCoffee(Long id) {
        return coffeeDao.find(id);
    }
}
