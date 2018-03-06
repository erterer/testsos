package util;


import dao.CoffeeDao;
import domain.Coffee;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;


/**
 *
 * @author Hans
 */
@Startup
@Singleton
public class Init {

    @Inject
    CoffeeDao coffeeDao;

    @PostConstruct
    public void init() {
        System.out.println("init begin ......................................................");
        Coffee coffee = new Coffee("Arabica", "dark");
        Coffee coffee2 = new Coffee("Robusta","brown");
        coffeeDao.save(coffee);
        coffeeDao.save(coffee2);
    }

}
