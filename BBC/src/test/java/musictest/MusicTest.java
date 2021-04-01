package musictest;

import common.WebAPI;
import music.Music;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static music.MusicWebElement.*;

public class MusicTest extends WebAPI {

    Music music;

    @BeforeMethod
    public void init() {
        music = PageFactory.initElements(driver, Music.class);

    }

    @Test
    public void headerTest() { music.openDropDown();
       assertEqualByXpath(musicTab, "Music");

    }


    @Test
    public void urlTest() {
        music.musicPage();
        String actualText = driver.getCurrentUrl();
        Assert.assertEquals(actualText, bbcMusicUrl, "Test failed");

    }

    @Test
    public void logoTest() {
        music.musicPage();
        assertEqualByXpath(musicLogo, "Music");

    }

    @Test
    public void titleTest() {
        music.musicPage();
        String expectedText = "Music - BBC Culture";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Test failed");

    }




}
