package step_definitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = false, features = "classpath:features", 
format = { "pretty",
        "html:target/site/cucumber-pretty",
        "json:target/cucumber.json" }, 

       // tags = {"@quantity","@addcart"})
        tags = {"@DirectedtoDetailPage"})
public class RunCukesTest {
}
