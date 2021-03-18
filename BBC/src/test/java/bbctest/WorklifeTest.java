package bbctest;

import bbc.Registration;
import bbc.Worklife;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WorklifeTest extends WebAPI {
    Worklife worklife;

    @BeforeMethod
    public void initialization() {
        worklife = PageFactory.initElements(driver, Worklife.class);
    }
}

//@Test


