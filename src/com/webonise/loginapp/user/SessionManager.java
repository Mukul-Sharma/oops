package com.webonise.loginapp.user;

import com.webonise.loginapp.login.LoginProvider;
import com.webonise.loginapp.session.Session;
import com.webonise.loginapp.user.User;

/**
 * Created by mukuls-webonise on 9/8/16.
 */
public class SessionManager {

    private LoginProvider loginProvider;
    private Session session;

    public SessionManager(LoginProvider loginProvider) {
        this.loginProvider = loginProvider;
    }

    public User login(String username, String[] pass) {
        this.session = loginProvider.login(username, pass);
        User user = new User(this);
        user.username = username;
        user.loginProvider = loginProvider.toString();
        return user;
    }

    public void logout() {
        session.clear();
        this.session = null;
    }
}
