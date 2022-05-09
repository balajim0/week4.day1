package week4.day1;


	import java.util.ArrayList;
	import java.util.Collection;
	import java.util.HashSet;
	import java.util.LinkedHashSet;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class RowCountColumnCount {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/tags/table/");
		
	WebElement elementTable = driver.findElement(By.className("attributes-list"));
	    
	    List<WebElement> rows = elementTable.findElements(By.tagName("tr"));
	    int size1 =rows.size();
	    System.out.println("Row count- "+size1);
	    // Iterate the rows to get the data
	    for (int i = 0; i < rows.size(); i++) {
	        // Cols inside the rows
	        List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
	        int size = cols.size();
	        //count of number of columns
	        if(size>0) {
	        	System.out.println( "column size- " +size);
	        	break;
	        }
}
	   // System.out.println();
	}
	}
