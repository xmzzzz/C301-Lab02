package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Simone on 2017/9/12.
 */

public class ImportantTweet extends Tweet implements InterfaceTwetable{
    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    public ImportantTweet(String message){
        super(message);
    }
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
