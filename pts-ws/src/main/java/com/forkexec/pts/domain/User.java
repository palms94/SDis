package com.forkexec.pts.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

public class User {

    private String userEmail;
    private int ID;
    private int userPoints;

    public User(String userEmail){
        this.userEmail = userEmail;

    }

    public User(String userEmail, int userID){
        this.userEmail = userEmail;
        this.ID = userID;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public int getUserId() {
        return ID;
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
        builder.append(", id=").append(ID);
        builder.append(", pontos=").append(userPoints);
        builder.append("]");
        return builder.toString();
    }





}