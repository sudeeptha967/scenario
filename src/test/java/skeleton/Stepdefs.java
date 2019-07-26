package skeleton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Stepdefs {
	static WebDriver driver;
	@When("open home page")
	public void open_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selium 3.0\\Selium 3.0\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
	}

	@When("enter the username {string}")
	public void enter_the_username(String uname) {
		
		driver.findElement(By.name("userName")).sendKeys(uname);
		//driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[2]")).click();
		}
	@When("enter the firstName")
	public void enter_the_firstname() {
		driver.findElement(By.name("firstName")).sendKeys("mercury");
	}
	@When("enter the lastname")
	public void enter_the_lastname() {
		driver.findElement(By.name("lastName")).sendKeys("mercur");
	}
	@When("enter the password")
	public void enter_the_password() {
		  driver.findElement(By.id("password")).sendKeys("123welcome");
	}
	@When("enter the confirm password")
	public void enter_the_confirm_password() {
		  driver.findElement(By.id("pass_confirmation")).sendKeys("123welcome");
	}
	@When("enter the gender")
	public void enter_the_gender() {
	    List <WebElement> d=driver.findElements(By.name("gender"));
	    d.get(0).click();
	}
	@When("enter the email")
	public void enter_the_email() {
		  driver.findElement(By.name("emailAddress")).sendKeys("wel@gmail.com");
	}

	@When("enter the mobile no")
	public void enter_the_mobile_no() {
		 driver.findElement(By.name("mobileNumber")).sendKeys("9867433456");
	}

	@When("enter	the date of birth")
	public void enter_the_date_of_birth() {
		 driver.findElement(By.name("dob")).sendKeys("04/29/1996");
	}

	@When("enter the address")
	public void enter_the_address() {
		driver.findElement(By.name("address")).sendKeys("1019,lakshmi nagar");
	}

	@When("enter the security question")
	public void enter_the_security_question() {
		WebElement dropdown=driver.findElement(By.name("securityQuestion"));
		Select s=new Select(dropdown);
		s.selectByVisibleText("What is your Birth Place?");
	}

	@When("enter the answer")
	public void enter_the_answer() {
		driver.findElement(By.name("answer")).sendKeys("chennai");
	}
	@Then("click register")
	public void click_register() {
		driver.findElement(By.name("Submit")).click();
	}
	@When("enter name {string}")
	public void enter_username(String uname) {
	 driver.findElement(By.name("userName")).sendKeys(uname);
	}
	@When("enter password {string}")
	public void enter_password(String pswd) {
	 driver.findElement(By.name("password")).sendKeys(pswd);
	}
	@And("enter login button")
	public void enter_button() {
		 driver.findElement(By.name("Login")).click();
		}

	@Given("search the particular product")
	public void search_the_particular_product() throws InterruptedException {
		WebElement  search = driver.findElement(By.xpath("//*[@id=\"myInput\"]"));//By.xpath("//*[@id=\"myInput\"]")"fa fa-search"
		Actions a =new Actions(driver);
		a.sendKeys(search,"headphone").build().perform();
		Thread.sleep(2000);
		a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

	@Given("try to proceed to payment without adding any item in the cart")
	public void try_to_proceed_to_payment_without_adding_any_item_in_the_cart() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		driver.findElement(By.partialLinkText("Cart")).click();
		driver.findElement(By.xpath("//*[@id=\"cart\"]/tbody/tr/td[5]/form/input[2]")).click();//.cssSelector("btn btn-danger btn-sm")
	}
}
