package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintDropDownOption{
	public static void main(String[] args) {
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		WebElement ele=driver.findElement(By.xpath("//select[@title='Month']"));
		Select option=new Select(ele);
		List<WebElement>options=option.getOptions();
		for(int i=0;i<options.size();i++) {
			String text=options.get(i).getText();
			System.out.println(text);
		}	
	}
}
