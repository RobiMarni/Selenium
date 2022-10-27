import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class BrowserComands {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Korisnik\\Desktop\\Selenium2\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://amplitudo.me/";


        driver.get(url);
        System.out.println(driver.getTitle());
        String url2= driver.getCurrentUrl();
        //  String source = driver.getPageSource();
        // System.out.println(source);
        System.out.println(url);

        driver.navigate().to("http://google.com");
        driver.navigate().back();


        if (url.equals(url2)) {
            System.out.println("Isti");
        } else {
            System.out.println("nisu isti");
        }


        driver.quit();


    }
}