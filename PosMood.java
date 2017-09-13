package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Simone on 2017/9/12.
 */

public class PosMood extends Mood {

    public PosMood(String mood) {
        super(mood);
    }
    public PosMood(String mood, Date date){
        super(mood, date);
    }
//    @Override
//    public Boolean isPosMood(){
//        return Boolean.TRUE;
//    }
}
