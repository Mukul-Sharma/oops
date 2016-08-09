package com.webonise.loginapp.login;

import com.webonise.loginapp.session.Session;

/**
 * Created by mukuls-webonise on 8/8/16.
 */
public interface LoginProvider {

    Session login(String username, String[] pass);

}
