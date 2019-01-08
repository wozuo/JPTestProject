package com.marctarnutzer.jptestproject;

import java.net.MalformedURLException;
import java.net.URL;

public class PathCode {

    public void addPath() {
        URLCode urlCode = new URLCode();
        try {
            URL path = new URL(urlCode.getURL(), "/hello/world");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
