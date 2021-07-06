package KivernoStepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class StepDefination {
	WebDriver driver;

	@Before
	public void Browser_setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lakhan\\SiA-Digital\\KivernoCMS\\Browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@After
	public void close() {
		//		driver.close();
	}

	@Given("User Launch browser and Enter url")
	public void user_launch_browser_and_enter_url() {
		driver.get("https://www.kiverno.com/");
		Assert.assertEquals(driver.getTitle(), "Kiverno");
		System.out.println( driver.getTitle());
	}

	@Then("User enter username and password")
	public void user_enter_username_as_and_password_as() throws InterruptedException {
		Thread.sleep(2000);
		WebElement usernamepath = driver.findElement(By.xpath("//input[@id='mat-input-0']"));
		usernamepath.sendKeys("Testassessee");

		Thread.sleep(2000);
		WebElement passwordpath = driver.findElement(By.xpath("//input[@id='mat-input-1']"));
		passwordpath.sendKeys("123");
	}

	@Then("Click on loginSubmit button")
	public void click_on_login_submit_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("Select model and brands")
	public void select_model_and_brands()throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Marketing Model')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Testing Assessment']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Testing Assessment')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Marketing Model']")).click();
	}

	@Then("User open calendar and open date")
	public void user_open_calendar_and_open_date() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='mat-select-value']//span[contains(text(),'Select Brand/Therapy Area')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("mat-option-text")).click();
		//	driver.findElement(By.xpath("//span[contains(text(),'Choose a D')]")).sendKeys("7/5/2021");
		Thread.sleep(1000);
	}

	@Then("click on reset button")
	public void click_on_reset_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'RESET')]")).click();
		Thread.sleep(2000);
	}

	@Then("Click on Score History")
	public void click_on_score_history() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("Score Histo")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Marketing Model')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Testing Assessment']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Testing Assessment')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Marketing Model']")).click();
	}
	@Then("User checks score history of Self Review and according dates")
	public void user_checks_score_history_of_self_review_and_according_dates() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-form-field[@id='step16']//div[@class='mat-form-field-infix']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Self review']")).click();
		Thread.sleep(2000);
		//	driver.findElement(By.xpath("//i[contains(text(),'file_copy')]")).click();
	}
	@Then("Clicks on Download PDF button of self Review")
	public void clicks_on_download_pdf_button_of_self_review() throws InterruptedException {
		Thread.sleep(2000);

		//	driver.findElement(By.xpath("//button[@id='step21']")).click();
	}
	@Then("Checks Score history of independent internal and according dates")
	public void checks_score_history_of_independent_internal_and_according_dates() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-form-field[@id='step16']//div[@class='mat-form-field-infix']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Independent Internal']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'02/25/2021')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'02/24/2021')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'02/16/2021')]")).click();
	}
	@Then("Clicks on Download PDF button of independent internal")
	public void clicks_on_download_pdf_button_of_independent_internal() throws InterruptedException {
		Thread.sleep(2000);
		//	driver.findElement(By.xpath("//span[normalize-space()='PDF']")).click();


	}
	@Then("Checks Score history of External internal and according dates")
	public void checks_score_history_of_external_internal_and_according_dates() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-form-field[@id='step16']//div[@class='mat-form-field-infix']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Independent External']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'01/12/2021')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'01/10/2021')]")).click();
	}

	@Then("Clicks on Download PDF button of External internal")
	public void clicks_on_download_pdf_button_of_external_internal() {

	}
	@Then("Clicks on Form Records")
	public void clicks_on_form_records() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Form Records']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[7]/mat-icon[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Back')]")).click();
	}
	@Then("Clicks on Excel button")
	public void clicks_on_excel_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Excel')]")).click();
	}
	@Then("User clicks on Report button from Non-Manager")
	public void user_clicks_on_report_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Report']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Development Opportunities')]")).click();	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Charts')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Previous']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Previous']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Previous']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Previous']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Previous']")).click();
		Thread.sleep(3000);	
		driver.findElement(By.className("highcharts-button-symbol")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='Download PNG image']")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("highcharts-button-symbol")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='Download PDF document']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Change Overtime')]")).click();
		Thread.sleep(2000);
	}

	@Then("Select values from filter and generate report")
	public void select_values_from_filter_and_generate_report() throws InterruptedException{
		//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//		driver.findElement(By.xpath("//a[normalize-space()='Report']")).click();
		//		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-form-field[@id='step28']//div[@class='mat-form-field-infix']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'test_brand')]")).click();
		driver.findElement(By.xpath("//html")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-form-field[@id='step31']//div[@class='mat-form-field-infix']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Self Review')]")).click();
		driver.findElement(By.xpath("//html")).click();
		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//mat-form-field[@id='step32']//div[@class='mat-form-field-infix']")).sendKeys("7/6/2021");
		//		Thread.sleep(3000);
		//		JavascriptExecutor jsaa = (JavascriptExecutor)driver; 
		//		WebElement aaa=driver.findElement(By.xpath("//mat-form-field[@id='step33']//div[@class='mat-form-field-infix']"));
		//		aaa.sendKeys("7/6/2021");
		driver.findElement(By.xpath("//span[normalize-space()='Generate']")).click();
	}

	@Then("Click on compare and compare data with other clients")
	public void click_on_compare_and_compare_data_with_other_clients()  throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor jsa = (JavascriptExecutor)driver; 
		WebElement aa=driver.findElement(By.xpath("//mat-panel-title[normalize-space()='Comparator']"));
		aa.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-form-field[@id='step35']//div[@class='mat-form-field-infix']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ng-star-inserted'][normalize-space()='Client1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//html")).click();
		driver.findElement(By.xpath("//mat-form-field[@id='step36']//div[@class='mat-form-field-infix']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ng-star-inserted'][normalize-space()='Model1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//html")).click();

	}

	@Then("User comes on home and Logout")
	public void user_comes_on_home_and_logout() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-icon[normalize-space()='home']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-icon[normalize-space()='power_settings_new']")).click();
	}

	// Non - Manager

	@Given("User Launch browser and Enter url on Manager Dashboard")
	public void user_launch_browser_and_enter_url_on_manager_dashboard() {
		driver.get("https://kiverno.com/");
		Assert.assertEquals(driver.getTitle(), "Kiverno");
		System.out.println( driver.getTitle());
	}

	@Then("User enter username and password on Manager Dashboard")
	public void user_enter_username_as_and_password_as_on_manager_dashboard() throws InterruptedException {
		Thread.sleep(2000);
		WebElement usernamepath = driver.findElement(By.xpath("//input[@id='mat-input-0']"));
		usernamepath.sendKeys("Testassessor");

		Thread.sleep(2000);
		WebElement passwordpath = driver.findElement(By.xpath("//input[@id='mat-input-1']"));
		passwordpath.sendKeys("123");
	}
	@Then("Click on Submit button")
	public void click_on_submit_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("Select model and brands on Managder Dashboard")
	public void select_model_and_brands_on_managder_dashboard() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Marketing Model')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Testing Assessment']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Testing Assessment')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Marketing Model']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='mat-select-value']//span[contains(text(),'Select Brand/Therapy Area')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("mat-option-text")).click();
		
	}
	
	@Then("Select individual\\(Non-manager) and method")
	public void select_individual_non_manager_and_method() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Select Individual')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Ritick gautam']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Select Review Method')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Self Review']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(text(),'Self Review')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Independent Internal']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(text(),'Independent Internal')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Independent External']")).click();
		Thread.sleep(2000);
	}

	@Then("User open calendar and open date of Manager Dashboard")
	public void user_open_calendar_and_open_date_of_manager_dashboard() throws InterruptedException {
		//		driver.findElement(By.xpath("//div[@class='cdk-overlay-backdrop mat-overlay-transparent-backdrop cdk-overlay-backdrop-showing']")).click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//div[@class='mat-calendar-body-cell-content mat-calendar-body-today']")).click();
	}

	@Then("click on reset button of Manager Dashboard")
	public void click_on_reset_button_of_manager_dashboard() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'RESET')]")).click();
		Thread.sleep(2000);
	}

	@Then("Click on Score History of Manager Dashboard")
	public void click_on_score_history_of_manager_dashboard() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[normalize-space()='Score History']")).click();
	}
	
	@Then("Select Model and Individual\\(Non-manager)")
	public void select_model_and_individual_non_manager()throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Marketing Model')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Testing Assessment']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Testing Assessment')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Marketing Model']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Rishabh Johnson')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Ritick gautam']")).click();
		Thread.sleep(2000);
	}

	@Then("User checks score history of Self Review and according dates of Manager Dashboard")
	public void user_checks_score_history_of_self_review_and_according_dates_of_manager_dashboard() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-form-field[@id='step16']//div[@class='mat-form-field-infix']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Self review']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'03/18/2021')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'02/25/2021')]")).click();
	}
	@Then("Clicks on Download PDF button of self Review of Manager Dashboard")
	public void clicks_on_download_pdf_button_of_self_review_of_manager_dashboard() throws InterruptedException {

	}
	@Then("Checks Score history of independent internal and according dates of Manager Dashboard")
	public void checks_score_history_of_independent_internal_and_according_dates_of_manager_dashboard() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-form-field[@id='step16']//div[@class='mat-form-field-infix']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Independent Internal']")).click();
		Thread.sleep(2000);

	}
	@Then("Clicks on Download PDF button of independent internal of Manager Dashboard")
	public void clicks_on_download_pdf_button_of_independent_internal_of_manager_dashboard() {

	}
	@Then("Checks Score history of External internal and according dates of Manager Dashboard")
	public void checks_score_history_of_external_internal_and_according_dates_of_manager_dashboard() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-form-field[@id='step16']//div[@class='mat-form-field-infix']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Independent External']")).click();
	}
	@Then("Clicks on Download PDF button of External internal of Manager Dashboard")
	public void clicks_on_download_pdf_button_of_external_internal_of_manager_dashboard() {

	}
	@Then("Clicks on Form Records of Manager Dashboard")
	public void clicks_on_form_records_of_manager_dashboard() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Form Records']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[7]/mat-icon[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Back')]")).click();

	}
	@Then("Clicks on Excel button of Manager Dashboard")
	public void clicks_on_excel_button_of_manager_dashboard() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='step24']")).click();
	}
	@Then("User clicks on Report button of Manager Dashboard")
	public void user_clicks_on_report_button_of_manager_dashboard() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Report']")).click();
		
	}
	
	@Then("Select Development and check report")
	public void select_development_and_check_report() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Development Opportunities')]")).click();	
	}
	@Then("Select Charts and check graphs according Elements")
	public void select_charts_and_check_graphs_according_elements() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Charts')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Previous']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Previous']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Previous']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Previous']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Previous']")).click();
		Thread.sleep(3000);	
		driver.findElement(By.className("highcharts-button-symbol")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='Download PNG image']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Change Overtime')]")).click();
	}
	@Then("User fill details in filter and generate graph")
	public void user_fill_details_in_filter_and_generate_graph() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-form-field[@id='step27']//div[@class='mat-form-field-infix']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Rishabh Johnson')]")).click();
		driver.findElement(By.xpath("//html")).click();
		driver.findElement(By.xpath("//mat-form-field[@id='step28']//div[@class='mat-form-field-infix']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'test_brand')]")).click();
		driver.findElement(By.xpath("//html")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-form-field[@id='step29']//div[@class='mat-form-field-infix']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'IT professionals')]")).click();
		driver.findElement(By.xpath("//html")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-form-field[@id='step30']//div[@class='mat-form-field-infix']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'1-4 Years')]")).click();
		driver.findElement(By.xpath("//html")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-form-field[@id='step31']//div[@class='mat-form-field-infix']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Self Review')]")).click();
		driver.findElement(By.xpath("//html")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Generate']")).click();
		
	}
	@Then("User click on comparator and choose required fileds")
	public void user_click_on_comparator_and_choose_required_fileds() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor jsa = (JavascriptExecutor)driver; 
		WebElement aa=driver.findElement(By.xpath("//mat-panel-title[normalize-space()='Comparator']"));
		aa.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-form-field[@id='step35']//div[@class='mat-form-field-infix']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ng-star-inserted'][normalize-space()='Client1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//html")).click();
		driver.findElement(By.xpath("//mat-form-field[@id='step36']//div[@class='mat-form-field-infix']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ng-star-inserted'][normalize-space()='Model1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//html")).click();

	}
	@Then("Generate Reports")
	public void generate_reports() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Generate']")).click();
		
	}

	@Then("User comes on home and Logout from Manager Dashboard")
	public void user_comes_on_home_and_logout_from_manager_dashboard() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-icon[normalize-space()='home']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-icon[normalize-space()='power_settings_new']")).click();

	}
	

	





}
