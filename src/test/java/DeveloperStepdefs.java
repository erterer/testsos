/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sven
 */
public class DeveloperStepdefs {
    
    public DeveloperStepdefs() {
    }
    
    private Developer sut;
    private String result;
    
    public DeveloperStepdefs() {
        Given("^I am a java developer$", () -> {
        sut = new Developer();
        });
        When("^I write code$", () -> {
        result = sut.writeCode();
        });
        Then("^I want it tested$", () -> {
        Assert.assertEquals("Code, code, code, code, code, code, code", result);
        });
    }
}
