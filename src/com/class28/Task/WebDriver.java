package com.class28.Task;

public interface WebDriver {

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Chrome driver opens browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Chrome driver closes browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Chrome driver maximizes window");
    }

    @Override
    public void findElement() {
        System.out.println("Element in Chrome found");
    }
}
class FireFox implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("FireFox opens browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("FireFox closes browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("FireFox maximizes window");
    }

    @Override
    public void findElement() {
        System.out.println("Element in FireFox found");
    }
    }

