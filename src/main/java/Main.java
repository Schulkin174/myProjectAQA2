import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Алекс\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // создаем неявное ожидание, т.е. общее ожидание


        driver.get("https://www.avito.ru/chelyabinsk/transport"); // открыть страницу

        WebElement findElement = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div[2]/div[1]/div[1]/ul/li/ul/li[1]/div/a"));
        // поиск элемента
        String par = findElement.getAttribute("href"); // указываем какой аттрибут нам необходим, напр, ссылка и забираем (get) инфу
        // String par = findElement.getText(); // при необходимосты вывести текст
        // String par = findElement.getCssValue("display"); // пример для стилей css
        System.out.println(par); // выводим инфу в консоль
    }
}
