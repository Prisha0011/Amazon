package StepDefinition;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageStep {
	public static String parentid;
	public static Set<String> allwindow;
	
	
	@Given("User open the appllication")
	public void user_open_the_appllication() {
		
		BaseClass.initialization();
	}

	@When("user search iphone product and click on Iphone15 Pro Max")
	public void user_search_iphone_product_and_click_on_iphone15_pro_max() {


        driver.findElement(By.id("twotabsearchtextbox")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone15ProMax");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

	@Then("User Select Iphone15 Pro Max Natural titanium")
	public void user_select_iphone15_pro_max_natural_titanium() {
	   
	}

	@Then("User Captured the price of the iphone")
	public void user_captured_the_price_of_the_iphone() {
	    
	}

	@Then("Click on add to cart and then click on proceed to checkout")
	public void click_on_add_to_cart_and_then_click_on_proceed_to_checkout() {
	    
	}

	@Then("Click on sign in button")
	public void click_on_sign_in_button() {
	   
	}

	@Then("user enter {string},{string}")
	public void user_enter(String string, String string2) {
	    
	}

	@Then("click on ok")
	public void click_on_ok() {
	   
	}
}
