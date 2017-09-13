package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Simone on 2017/9/12.
 */

abstract class Mood {
    private String mood;
    private Date date;

    public Mood(String mood, Date date) {
        this.mood = mood;
        this.date = date;
    }

    public Mood(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return this.mood;
    }
}

