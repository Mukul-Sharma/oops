package com.webonise.loginapp.login.social.facebook;

import com.webonise.loginapp.login.LoginProvider;
import com.webonise.loginapp.session.Session;

import java.util.Calendar;

/**
 * Created by mukuls-webonise on 9/8/16.
 */
public class FacebookLoginProvider implements LoginProvider {

    @Override
    public Session login(String username, String[] pass) {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DAY_OF_MONTH, 7);
        return new Session("random_facebook_token", c.getTime());
    }

    @Override
    public String toString() {
        return "FacebookLoginProvider";
    }
}
