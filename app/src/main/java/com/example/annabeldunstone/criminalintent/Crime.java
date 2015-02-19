package com.example.annabeldunstone.criminalintent;

import java.util.UUID;

/**
 * Created by annabeldunstone on 2/19/15.
 */
public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime() {
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
