package week3.day1.classroom;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSortNames {

	public static void main(String[] args) throws InterruptedException {
//		Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		
//		Launch the URL - https://erail.in/
		driver.get("https://erail.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		Uncheck the check box - sort on date
		WebElement date = driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']"));
		if(date.isSelected())
		{
			driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		}
		else
		{
			System.out.println("date sort not selected");
		}
		
//		clear and type in the source station 
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("TPJ",Keys.TAB);
		
//		clear and type in the destination station
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("MS",Keys.TAB);
		Thread.sleep(1000); 
//		Find all the train names using xpath and store it in a list
		List<WebElement> table = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr/td[2]"));
	
		
		List<String>train=new ArrayList<String>();
		for(WebElement col:table)
		{
			
			String TrainName = col.getText();
			
			System.out.println(TrainName);
			train.add(TrainName);
		}
		Collections.sort(train);
		System.out.println(train);
		driver.close();
//		Use Java Collections sort to sort it and then print it
		
		
	}

}
