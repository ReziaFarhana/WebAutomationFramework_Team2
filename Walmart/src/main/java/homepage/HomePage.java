package homepage;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;

import static homepage.HomePageWebElements.*;

public class HomePage extends WebAPI {


    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,4000);");
    }
    public void helpCenterOption(){
        scrollDown();
       // JavascriptExecutor js = (JavascriptExecutor)driver;
       clickByLinkText(helpcenterlocator);
        //js.executeScript("arguements[0].scrollIntoView();", helpcenterlocator);


    }
}
