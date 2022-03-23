package com.yelp_camp.base;

public class PageObjects {

    public void waitInSeconds(int seconds){
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
