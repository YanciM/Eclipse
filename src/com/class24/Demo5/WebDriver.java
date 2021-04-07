package com.class24.Demo5;

public class WebDriver {

    void openWebsite(){
        System.out.println("Opening the website ");
    }
    void closeWebsite(){
        System.out.println("Opening the website");
    }
    void loginWebsite(){
        System.out.println("Opening the website");
    }
    void signupWebsite(){
        System.out.println("Opening the website");
    }
    void downloadFileFromWebsite(){
        System.out.println("Opening the website");
    }
}

class GoogleChrome extends WebDriver{
    void openWebsite(){
        System.out.println("Opening the website in Google Chrome");
    }
    void closeWebsite(){
        System.out.println("Opening the website in Google Chrome");
    }
    void loginWebsite(){
        System.out.println("Opening the website in Google Chrome");
    }
    void signupWebsite(){
        System.out.println("Opening the website in Google Chrome");
    }
    void downloadFileFromWebsite(){
        System.out.println("Opening the website in Google Chrome");
    }
}

class FireFox extends WebDriver{
    void openWebsite(){
        System.out.println("Opening the website in FireFox");
    }
    void closeWebsite(){
        System.out.println("Opening the website in FireFox");
    }
    void loginWebsite(){
        System.out.println("Opening the website in FireFox");
    }
    void signupWebsite(){
        System.out.println("Opening the website in FireFox");
    }
    void downloadFileFromWebsite(){
        System.out.println("Opening the website in FireFox");
    }
}
