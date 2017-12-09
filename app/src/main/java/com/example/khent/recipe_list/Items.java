package com.example.khent.recipe_list;

/**
 * Created by khent on 12/8/2017.
 */

public class Items {

    private String title, shortdesc, fulldesc;



    public Items(String title, String shortdesc) {
        this.title = title;
        this.shortdesc = shortdesc;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setShortdesc(String shortdesc) {
        this.shortdesc = shortdesc;
    }

    public String getFulldesc() {
        return fulldesc;
    }

    public void setFulldesc(String fulldesc) {
        this.fulldesc = fulldesc;
    }

    public String getTitle() {

        return title;
    }

    public String getShortdesc() {
        return shortdesc;
    }
}
