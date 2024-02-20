package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
        driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[contains(text(),'Fashion')]")).click();
        Thread.sleep(3000);
        String items = driver.findElement(By.xpath("//div[@class='length']/strong")).getText();
        
        System.out.println("No of results found "+items);
        List<WebElement> brand = driver.findElements(By.className("brand"));
        int size = brand.size();
        System.out.println("Total no of brands :" +size);
        System.out.println("The resultant brand name of the bags are ");
        for (WebElement i : brand) {
			System.out.println(i.getText());
		}
        List<WebElement> names = driver.findElements(By.className("nameCls"));
        System.out.println("The names of the bag displayed in the page are ");
        for (WebElement j : names) {
			System.out.println(j.getText());
		}
        
        
        
        
	}

}
