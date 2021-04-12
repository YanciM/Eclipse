package com.class27.Demo1;

abstract class Phone {

        void makeCalls() {
            System.out.println("Calling");
        }

        void sendText() {
            System.out.println("Sending text");
        }

        abstract void displayPictures();

        abstract void unlockPhone();
    }
    class Iphone extends Phone {

        void displayPictures(){
            System.out.println("Iphone uses photo app to display pictures");
        }
        void unlockPhone(){
            System.out.println("Iphone users can unlock the phone by faceID");
        }
    }
    class Samsung extends Phone{

        /*@Override
        void makeCalls() {
            System.out.println("Calling from samsung");
        }*/

        void displayPictures(){
            System.out.println("Can unlock with face ID and fingerprint");
        }
        void unlockPhone(){
            System.out.println("Use the gallery app to display the pictures");
        }
}

