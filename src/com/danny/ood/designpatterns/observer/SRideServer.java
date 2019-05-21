package com.danny.ood.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class SRideServer extends IServer {

    private List<IUser> users = new ArrayList<>();
    private String message = "Test Message"; 
    
    public String getMessage()
    {
        return message;
    }
    
    public void setMessage(String message)
    {
        this.message = message;
    }
    
    public void notifyUsers()
    {
        users.stream().forEach(user -> {
            user.update(this);
        });
        
    }

    public void addUser(IUser user)
    {
        users.add(user);
    }

    public void removeUser(IUser user)
    {
        users.remove(user);
    }

}
