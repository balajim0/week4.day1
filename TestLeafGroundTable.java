package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeafGroundTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Setup driver
		WebDriverManager.chromedriver().setup();
		// start Chrome Driver
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Launch browser
		driver.get("http://www.leafground.com/pages/table.html");
		// Table Element
		WebElement elementTable = driver.findElement(By.className("innerblock"));

		List<WebElement> rows = elementTable.findElements(By.tagName("tr"));
		// Get the count of number of rows
		System.out.println(rows.size());
		for (int i = 0; i < rows.size(); i++) {

			// Cols inside the rows
			List<WebElement> cols = rows.get(i).findElements(By.xpath("//tr[@class='even']"));
			int size = cols.size();
			// Get the count of number of columns
			if (size > 0) {
				System.out.println("column size- " + size);
				break;
			}

			// Get the progress value of 'Learn to interact with Elements'
			for (int j = 0; j < cols.size(); j++) {
				// System.out.println(cols.get(j).getText());
				String text = cols.get(j).getText();
				System.out.println(text);
			}

		}
		// Check the vital task for the least completed progress
		elementTable.findElement(By.xpath("//tr[6]/td[3]")).click();

	}
}
