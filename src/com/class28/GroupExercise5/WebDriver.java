package com.class28.GroupExercise5;

public interface WebDriver {
        void open();
        void close();
        String getTitle = null;
    }
    interface TakesScreenshot{
        void getScreenshot();
    }
    interface RemoteWebDriver extends WebDriver, TakesScreenshot{
        void navigate();
    }
    class ChromeDriver implements RemoteWebDriver {
        @Override
        public void open() {
        }
        @Override
        public void close() {
        }
        @Override
        public void getScreenshot() {
        }
        @Override
        public void navigate() {
        }
    }
    class FirefoxDriver implements RemoteWebDriver{
        @Override
        public void open() {
        }
        @Override
        public void close() {
        }
        @Override
        public void getScreenshot() {
        }
        @Override
        public void navigate() {
        }
    }
    class SafariDriver implements RemoteWebDriver {
        @Override
        public void open() {
        }
        @Override
        public void close() {
        }
        @Override
        public void getScreenshot() {
        }
        @Override
        public void navigate() {
        }
    }
