package com.webonise.loginapp.user;

import com.webonise.loginapp.login.LoginProvider;
import com.webonise.loginapp.session.Session;
import com.webonise.loginapp.user.User;

/**
 * Created by mukuls-webonise on 9/8/16.
 */

//Session manager class, Responsibility is to manage user session
public class SessionManager {

    private LoginProvider loginProvider;
    private Session session;

    SessionManager(LoginProvider loginProvider) {
        this.loginProvider = loginProvider;
    }

    User login(String username, String[] pass) {
        this.session = loginProvider.login(username, pass);
        User user = new User(this);
        user.username = username;
        user.loginProvider = loginProvider.toString();
        return user;
    }

    void logout() {
        session.clear();
        this.session = null;
    }
}
