package com.webonise.loginapp;

import com.webonise.loginapp.user.User;

/**
 * Created by mukuls-webonise on 9/8/16.
 */
public class App {

    private User user;

    public App(User user) {
        this.user = user;
        System.out.println("Houston, we have ignition");
    }

    public void onTapSignOut() {
        user.signOut();
        System.out.println("You look so pretty, but you're gone so soon");
    }

    public void run() {
        System.out.println("App is running");
    }
}
