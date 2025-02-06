package TestNG;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:\\Users\\Asus-2024\\eclipse-workspace\\AutomationSpt\\src\\test\\resources\\featuere", // Path to feature file
    glue = "C:\\Users\\Asus-2024\\eclipse-workspace\\AutomationSpt\\src\\test\\java\\POM\\simpleform.java", // Path to step definitions
    plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class simtest {
}

