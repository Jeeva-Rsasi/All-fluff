package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AmazonStepDef {
    WebDriver driver;
    @Given("user navigates to Amazon home page")
    public void navigate() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.kayak.com/");
       // driver.manage().timeouts().wait(1000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));


    }
    @When("user enter the {string}, {string}, {string} and {string} in search box.")
    public void enterFromTo(String src, String dest, String src_airport, String dst_airport){
        driver.findElement(By.xpath
                ("//div[@class='c_neb-item-close']/div/*[local-name()='svg']/*[local-name()='path']")).click();
        driver.findElement(By.xpath
                ("//input[@placeholder='From?']")).sendKeys(src);
        driver.findElement(By.xpath
                ("//div[contains(@class,'mod-spacing-base')]//ul/li//span[contains(normalize-space(),'"+src_airport+"')]")).click();
        driver.findElement
                (By.xpath("//input[contains(@aria-label,'Flight destination input')]")).sendKeys(dest);
        driver.findElement(By.xpath
                ("//div[contains(@class,'mod-spacing-base')]//ul/li//span[contains(normalize-space(),'"+dst_airport+"')]")).click();
    }
    @Then("verify the search result")
    public void validateItem(){

    }
}
