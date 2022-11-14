package stepdefnition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefnition {
	WebDriver driver;
@Given("homepage")
public void user_is_on_homepage() {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\kbnav\\Documents\\javaselenium\\geckodriver.exe");
	 driver=new FirefoxDriver();
	driver.get("https://www.rediff.com");
    
}

@When("Login Page")
public void user_navigates_to_login_page() {
   driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/p/a[1]")).click();// click on sign in
}
@And("enters {string} and {string}")
public void user_enters_and(String name, String pasword) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.findElement(By.xpath("//*[@id=\"login1\"]")).sendKeys(name);
	    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pasword);
	    driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div/input[2]")).click();
	}





@Then("message is displayed")
public void success_message_is_displayed() {
   System.out.println(driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[1]/b")).getText());
}

}
