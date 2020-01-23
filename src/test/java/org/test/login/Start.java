package org.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Start extends BaseClass {
	public static void main(String[] args) throws Throwable {
		
		//Launch Browser
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\MASARUR BEGUM\\firstproject\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			//Maximize
			driver.manage().deleteAllCookies();
			
			driver.get("https://www.newlook.com/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			
			WebElement popClose = driver.findElement(By.xpath("//button[@class='modal__close']"));
			popClose.click();

			Thread.sleep(2000);
			
			WebElement women = driver.findElement(By.xpath("(//a[@class='main-navigation__primary-menu-link ng-scope'])[1]"));
	        Actions a=new Actions(driver);
        	a.moveToElement(women).perform();
	
	        WebElement clothing = driver.findElement(By.xpath("(//a[text()='Clothing'])[1]"));
	        a.moveToElement(clothing).perform();
        	
	        Thread.sleep(3000);
	
	        WebElement dresses = driver.findElement(By.xpath("(//span[@class='ng-binding ng-scope'])[3]"));
			dresses.click();
			
			Thread.sleep(5000);
			
			WebElement popCl2 = driver.findElement(By.xpath("//div[@class='box box3']"));
			popCl2.click();
			
			WebElement scrollDress = driver.findElement(By.xpath("//a[text()='Brown Leopard Print Soft Touch Skater Dress']"));
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)",scrollDress);
			Thread.sleep(3000);
			
     		WebElement btnDress = driver.findElement(By.xpath("//a[text()='Navy Satin Puff Long Sleeve Mini Dress']"));			
     		btnDress.click();
     		
     		Thread.sleep(2000);
     		
     		WebElement selectSize = driver.findElement(By.xpath("//select[@data-ng-model='productInfo.selectedSize']"));
     		Select s2 = new Select(selectSize);
			s2.selectByValue("object:130");
			
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("(//button[@data-translate='product.addToBag'])[1]")).click();
			Thread.sleep(2000);
			
     		WebElement addbag = driver.findElement(By.xpath("(//button[text()='ADD TO BAG'])[1]"));
     		addbag.click();
			
			Thread.sleep(3000);
			
			WebElement scrollDown1 = driver.findElement(By.xpath("//div[@class='product-sizes__size-chart ng-scope']"));
			JavascriptExecutor js1= (JavascriptExecutor)driver;
			js1.executeScript("arguments[0].scrollIntoView(true)",scrollDown1);
			
			Thread.sleep(3000);
		
			WebElement checkOut = driver.findElement(By.xpath("//a[text()='View Bag & Checkout']"));
			checkOut.click();
			
			Thread.sleep(2000);
			
			WebElement scrollDown2 = driver.findElement(By.xpath("//span[text()='(6474890)']"));
			JavascriptExecutor js2= (JavascriptExecutor)driver;
			js2.executeScript("arguments[0].scrollIntoView(true)",scrollDown2);
			
			Thread.sleep(2000);
			WebElement seCheckOut = driver.findElement(By.xpath("(//a[text()='SECURE CHECKOUT'])[2]"));
			seCheckOut.click();
			
			Thread.sleep(2000);
			WebElement guestLogin = driver.findElement(By.xpath("//input[@id='email']"));
			guestLogin.sendKeys(excelRead(1, 0));
			
			Thread.sleep(2000);
			WebElement guestCheckOut = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			guestCheckOut.click();
			
			Thread.sleep(2000);
			WebElement btnDelivery = driver.findElement(By.xpath("//div[@class='tab-text__checkout tab-text__checkout--delivery']"));
			btnDelivery.click();
			
			Thread.sleep(2000);
			WebElement btnTitle = driver.findElement(By.xpath("//select[@id='titleCode']"));
			btnTitle.click();
			
			Select s=new Select(btnTitle);
			s.selectByValue("string:miss");
			
			WebElement txtFirstName = driver.findElement(By.xpath("//input[@id='firstName']"));
			txtFirstName.click();
			txtFirstName.sendKeys(excelRead(1, 1));
			
			WebElement txtLastName = driver.findElement(By.xpath("//input[@id='lastName']"));
			txtLastName.click();
			txtLastName.sendKeys(excelRead(1, 2));
			
			WebElement btnEnterManual = driver.findElement(By.xpath("//a[@class='button-link ng-scope']"));
			btnEnterManual.click();
			
			WebElement txtAdd1 = driver.findElement(By.xpath("//input[@id='line1']"));
			txtAdd1.click();
			txtAdd1.sendKeys(excelRead(1, 3));
			
			WebElement txtAdd2 = driver.findElement(By.xpath("//input[@id='line2']"));
			txtAdd2.click();
			txtAdd2.sendKeys(excelRead(1, 4));
			
			WebElement txtTown = driver.findElement(By.xpath("//input[@id='town']"));
			txtTown.click();
			txtTown.sendKeys(excelRead(1, 5));
			
			WebElement txtCountry = driver.findElement(By.xpath("//input[@id='county']"));
			txtCountry.click();
			txtCountry.sendKeys(excelRead(1, 6));
			
			WebElement txtZip = driver.findElement(By.xpath("//input[@id='postalCode']"));
			txtZip.click();
			txtZip.sendKeys(excelRead(1, 7));
			
			WebElement txtSub = driver.findElement(By.xpath("//button[@name='useAddress']"));
			txtSub.click();
			
			Thread.sleep(4000);
			
			WebElement txtTel = driver.findElement(By.xpath("//input[@type='tel']"));
			txtTel.click();
			txtTel.sendKeys(excelRead(1, 8));
			
			Thread.sleep(2000);
			WebElement btnCont = driver.findElement(By.xpath("//button[@data-ng-click='continueToPayment();']"));
			btnCont.click();
			
			Thread.sleep(2000);
			WebElement btnCard = driver.findElement(By.xpath("(//button[@data-ng-click='selectTab(tab)'])[1]"));
			btnCard.click();
			
			Thread.sleep(2000);
			WebElement btnCardV = driver.findElement(By.xpath("//select[@name='card_type']"));
			btnCardV.click();
			
			Select s1=new Select(btnCardV);
			s1.selectByValue("001");
			
			Thread.sleep(2000);
			WebElement btnCardNo = driver.findElement(By.xpath("//input[@id='card_number']"));
			btnCardNo.click();
			btnCardNo.sendKeys(excelRead(1, 9));
			
			Thread.sleep(2000);
			WebElement btnMonth = driver.findElement(By.xpath("//select[@id='card_expiry_month']"));
			btnMonth.click();
			Select s3=new Select(btnMonth);
			s3.selectByValue("string:06");
			
			Thread.sleep(2000);
			WebElement btnYear = driver.findElement(By.xpath("//select[@id='card_expiry_year']"));
			btnYear.click();
			Select s4=new Select(btnYear);
			s4.selectByValue("number:2024");
		
			Thread.sleep(2000);
			WebElement btnSubmit = driver.findElement(By.xpath("//button[@name='submit']"));
			btnSubmit.click();
			
			//Excel write
			WebElement proName=driver.findElement(By.xpath("//h5[text()='Navy Satin Puff Long Sleeve Mini Dress']"));
			String text = proName.getText();
			writeExcel(1,0,text);
			
			
			
			
			
			
			
			
			
	}
}
