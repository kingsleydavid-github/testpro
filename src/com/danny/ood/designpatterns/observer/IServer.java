package com.danny.ood.designpatterns.observer;

public abstract class IServer {

    public abstract void notifyUsers();
    public abstract void addUser(IUser user);
    public abstract void removeUser(IUser user);
    
}
