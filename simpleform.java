package POM;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class simpleform {

    WebDriver driver;

    @Given("I open the Simple Form page")
    public void i_open_the_simple_form_page() {
        driver = new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/simple-form");
    }

    @And("I enter {string} in the first input field")
    public void i_enter_in_the_first_input_field(String value) {
        driver.findElement(By.id("First Name")).sendKeys(value);
    }

    @And("I enter {string} in the second input field")
    public void i_enter_in_the_second_input_field(String value) {
        driver.findElement(By.id("lastName")).sendKeys(value);
    }

    @And("I enter a thord inpud field")
    public void I_enter_a_third_inpud_field(String value) {
        driver.findElement(By.xpath("email")).sendKeys(value);
    }

    @And("I enter a fouth inpud field")
    public void  I_enter_a_fourth_inpud_field(String value) {
        driver.findElement(By.xpath("mobilenumber")).sendKeys(value);
    }
    @And("I enter a 5th inpud field")
    public void  I_enter_a_fifth_inpud_field(String value) {
        driver.findElement(By.xpath("email")).sendKeys(value);
    }
    @And("I enter a six inpud field")
    public void  I_enter_a_Sixth_inpud_field(String value) {
        driver.findElement(By.xpath("message")).sendKeys(value);
    }
    @Then("the result should be {string}")
    public void the_result_should_be(String expectedResult) {
        String result = driver.findElement(By.cssSelector("input[value='submit']")).getText();
        //Assert.assertEquals(e, expectedResult);
        //driver.quit();
    }
}
