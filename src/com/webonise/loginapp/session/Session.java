package com.webonise.loginapp.session;

import java.util.Date;

/**
 * Created by mukuls-webonise on 9/8/16.
 */
public class Session {

    private Date createdAt;
    private Date validTill;
    private String sessionToken;

    public Session(String sessionToken, Date validTill) {
        this.sessionToken = sessionToken;
        this.createdAt = new Date();
        this.validTill = validTill;
    }

    public void clear() {
        this.sessionToken = null;
        this.createdAt = null;
        this.validTill = null;
    }
}
