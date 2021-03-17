package bbcheaderreel;

import common.WebAPI;

import static bbcheaderreel.bbcWebelements.*;

public class Reel extends WebAPI {

    public void reeltab(){
        clickByXpath(reelLocator);
    }

    public void editorsPick(){
        reeltab();
        windowHalfPageScroll();
        clickByCss(editorsPickVideo);
    }

    public void playlists(){
        reeltab();
        clickByXpath(playlistButton);
        clickByCss(playlistTitle);
    }

    public void longShots(){
        reeltab();
        clickByXpath(longShotsButton);
        windowHalfPageScroll();
        clickByXpath(longShotNewLink);
    }





























}
