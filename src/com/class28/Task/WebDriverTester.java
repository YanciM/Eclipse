package com.class28.Task;

public interface WebDriverTester {
    public static void main(String[] args) {

        WebDriver webDriver1=new ChromeDriver();
        webDriver1.openBrowser();
        webDriver1.closeBrowser();
        webDriver1.maximizeWindow();
        webDriver1.findElement();

        WebDriver webDriver2=new FireFox();
        webDriver2.openBrowser();
        webDriver2.closeBrowser();
        webDriver2.maximizeWindow();
        webDriver2.findElement();
    }
}
