package com.getout.kaylaecker.getout.Matches;

/**
 * Created by kaylaecker on 1/21/18.
 */

public class MatchesObject {
    private String userId;
    public MatchesObject (String userId){
        this.userId = userId;
    }

    public String getUserId(){
        return userId;
    }
    public void setUserID(String userID){
        this.userId = userId;
    }
}