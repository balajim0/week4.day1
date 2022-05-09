package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Setup driver
		WebDriverManager.chromedriver().setup();
		// start Chrome Driver
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Launch browser
		driver.get("https://html.com/tags/table/");
		// Table Element
		WebElement elementTable = driver.findElement(By.className("attributes-list"));

		List<WebElement> rows = elementTable.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		//table header
		System.out.println(elementTable.findElement(By.xpath("//tr[1]")).getText());
		//first row with Lib
		System.out.println(elementTable.findElement(By.xpath("//tbody/tr[1]")).getText());
		//second row with Lib
		System.out.println(elementTable.findElement(By.xpath("//tbody/tr[2]")).getText());

	}

}
