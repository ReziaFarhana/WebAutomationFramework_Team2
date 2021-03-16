package testmoreoption;

import common.WebAPI;
import more.Music;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestMoreOptions extends WebAPI {

    Music music;
    @Test
    public void testMusic () {
        music= PageFactory.initElements(driver,Music.class);
        music.moreOption();
    }
    @Test
    public void testDisplayRemix () {
        music= PageFactory.initElements(driver,Music.class);
        music.textRemix();

    }


}
