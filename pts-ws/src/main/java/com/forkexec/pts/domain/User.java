package com.forkexec.pts.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

public class User {

    private String userEmail;
    private String userId;
    private int userPoints;

    public User(String userEmail){
        this.userEmail = userEmail;

    }

    public User(String userEmail, String userID){
        this.userEmail = userEmail;
        this.userId = userID;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserId() {
        return userId;
    }

    public int getUserPoints(){
        return userPoints;
    }


    public boolean checkEmail(String userEmail) {

        String validEmail = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
        Pattern pat = Pattern.compile(validEmail);

            if (userEmail == null)
                return false;
            return pat.matcher(userEmail).matches();
        }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[ email").append(userEmail);
        builder.append(", id=").append(userId);
        builder.append(", pontos=").append(userPoints);
        builder.append("]");
        return builder.toString();
    }





}