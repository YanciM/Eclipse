package com.class32.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo1 {
    public static void main(String[] args) throws IOException {

        String path="C:\\Users\\yanci\\IdeaProjects\\Eclipse\\Files\\Configuration.properties";
        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.get("URL"));
        System.out.println(properties.get("userName"));
        int iterations= Integer.parseInt(properties.getProperty("loop"));
        for(int i=0; i<iterations;i++){
            System.out.println("Dynamic program");
        }

        FileOutputStream fileOutputStream=new FileOutputStream(path);
        properties.setProperty("name","Bella");
        properties.store(fileOutputStream,"Added new property in the file");


    }
}