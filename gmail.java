package practice3;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmail {
	
	
	public static void main(String [] args) throws InterruptedException //throws InterruptedException
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter email adress :");
		String email = "vishalqa4508@gmail.com";//scan.next();
		System.out.print("Enter password :");
		String password = "9935912981v";// scan.next();
		System.out.print("Enter message :");
		String sentMail = "blue";//scan.next();//"fkadfkhasdjfadskfj";
		System.setProperty("webdriver.chrome.driver", "D:\\Vishal\\back\\installed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com/");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
		driver.findElement(By.xpath("//div[@id='identifierNext']/content/span")).click();
		//wait
		WebDriverWait waitForPage = new WebDriverWait(driver,15000);
		waitForPage.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']")));
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		//next button
		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
		 
		
		waitForPage.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='COMPOSE']")));
		driver.findElement(By.xpath("//div[@jscontroller]/div/div/div/div/div")).click();
	
		waitForPage.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@name='to']")));
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys(sentMail);
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys(sentMail);
		driver.findElement(By.xpath("//div[@class='aDh']/table/tbody/tr/td[1]")).click();
		
		
		waitForPage.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='TK']/div[1]")));
		driver.findElement(By.xpath("//div[@class='TK']/div[1]")).click();
		
			Thread.sleep(10000);
		
		waitForPage.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Inbox')]")));
		driver.findElement(By.xpath("//div[@class='UI']/div/div/div[2]/div/table/tbody/tr[1]")).click();
		String recievedMail = driver.findElement(By.xpath("//div[@data-legacy-message-id]/div/div/div/div/div[1]")).getText();
		
		System.out.println("Sent mail :"+sentMail);
		System.out.println("Recieved mail :"+recievedMail);
		
		if(sentMail.equals(recievedMail)){
			System.out.println("success!");
			
		}
		else{
			System.out.println("failed!");
		}
		
		
		driver.navigate().back();

		    Thread.sleep(3000);
			List<WebElement> list = driver.findElements(By.xpath("//span[text()='"+sentMail+"']"));
			
			
			
		   // waitForPage.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='"+sentMail+"'])[1]")));
			
			for(int i=0;i<list.size();i++){
				list = driver.findElements(By.xpath("//span[text()='"+sentMail+"']"));
				for(int k=0;k<list.size();k++){
			System.out.println(list.get(k));
			}
			//waitForPage.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='"+sentMail+"']")));
			list.get(0).click();
			
			System.out.println("mail found");
		//	waitForPage.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-tooltip='Delete']")));
			
			 Thread.sleep(5000);
			
			driver.findElement(By.cssSelector("div[aria-label='Delete']>div>div")).click();
			System.out.println("mail deleted!");
			//driver.navigate().back();
			driver.findElement(By.xpath("//a[contains(text(),'Inbox')]")).click();

		    Thread.sleep(3000); 			
			
			
			}
		
		
		
		
		
		
		
		
		
		
	
		
		
	}
	

}
