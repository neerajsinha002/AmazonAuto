package applicationPages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class LoginPage extends PageObject
{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public static HashMap<String, String> pageMap;
    static{
        pageMap= new HashMap<String, String>();
        pageMap.put("", "");
    }

}
