package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Simone on 2017/9/12.
 */

abstract class Tweet {
    private String message;
    //protected
    private Date date;
    //not classes: int
    public Tweet(String message){
        //constructer
        this. message = message;
        this.date = new Date();
    }
    public Tweet(String message, Date date){
        this. message = message;
        this.date = date;
    }
    public void setmessage (String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        }else{
        this.message = message;}
    }

    public abstract Boolean isImportant();

    public String getmessage(){
        return this.message;
    }
    public Date getDate(){
        return date;
    }
    public void setDate(){
    }
}
