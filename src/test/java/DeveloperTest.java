/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.github.tomakehurst.wiremock.client.WireMock;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.containing;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author Sven
 */
public class DeveloperTest {
    
    public DeveloperTest() {
    }
    
    @Rule
    public WireMockRule wireMockRule = new WireMockRule(8888);
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testWriteCode() {
        Developer sut = new Developer();
        Assert.assertEquals("Code, code, code, code, code, code, code", sut.writeCode());
    }
    
    @Test
    public void testSend() {
    WireMock wiremock = new WireMock(8888);
    wiremock.register(post(urlEqualTo("/BigCompany"))
                .withRequestBody(containing("me"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withBody("0")));
        
    Company ordina = new Company(new JavaDeveloper("me"));
    ordina.send(new Contractor("BigCompany"));
        
    wiremock.verifyThat(WireMock.postRequestedFor(urlEqualTo("/BigCompany")));
    }
    
    @RunWith(Cucumber.class)
    public class TomatoTest {
        @Given("^I am a java developer$", () -> {
// Write code here that turns the phrase above into concrete actions
throw new PendingException();
});
When("^I write code$", () -> {
// Write code here that turns the phrase above into concrete actions
throw new PendingException();
});
Then("^I want it tested$", () -> {
// Write code here that turns the phrase above into concrete actions
throw new PendingException();
});
    }
}
