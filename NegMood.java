package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Simone on 2017/9/12.
 */

public class NegMood extends Mood {
    public NegMood(String mood, Date date) {
        super(mood, date);
    }
    public NegMood(String mood){
        super(mood);
    }
//    @Override
//    public Boolean isPositive){
//        return Boolean.FALSE;
//    }
}
