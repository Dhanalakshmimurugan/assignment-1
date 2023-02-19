package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		WebElement ele=driver.findElement(By.xpath("//select[@title='Month']"));
		Select option=new Select(ele);
		List<WebElement>options=option.getOptions();
		int size=options.size();
		option.selectByIndex(size-6);
		System.out.println(size-6);
		
		
	}

}
