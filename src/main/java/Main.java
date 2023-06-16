import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Алекс\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://novate.ru/"); // открыть страницу

        WebElement input = driver.findElement(By.id("search")); // найти элемент по id: нашли инпут
        input.sendKeys("интерьер"); // вписываем запрос
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"search-form\"]/input[2]")); // найти элемент по xpath: нашли кнопку
        searchButton.click(); // кликнули на кнопку

        driver.quit(); // закрыть браузер
    }
}
