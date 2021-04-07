package com.class24.Demo5;

public class WebsiteTester {
    public static void main(String[] args) {

        WebDriver webDriver=new FireFox();
        webDriver.openWebsite();
        webDriver.signupWebsite();
        webDriver.downloadFileFromWebsite();
        webDriver.closeWebsite();

        WebDriver[] webDriverArray= {new GoogleChrome(),new FireFox()};
        for(WebDriver webdriver:webDriverArray){
            webDriver.openWebsite();
            webDriver.signupWebsite();
            webDriver.downloadFileFromWebsite();
            webDriver.closeWebsite();

        }

        /*FireFox fireFox=new FireFox();
        fireFox.openWebsite();
        fireFox.signupWebsite();
        fireFox.downloadFileFromWebsite();
        fireFox.closeWebsite();

        GoogleChrome googleChrome=new GoogleChrome();
        googleChrome.openWebsite();
        googleChrome.signupWebsite();
        googleChrome.downloadFileFromWebsite();
        googleChrome.closeWebsite();*/
    }
}
