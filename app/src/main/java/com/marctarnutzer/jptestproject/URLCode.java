package com.marctarnutzer.jptestproject;

import java.net.MalformedURLException;
import java.net.URL;

public class URLCode {

    public URL getURL() {
        try {
            URL url = new URL("http://someurl.com");
            return url;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return null;
    }

}
