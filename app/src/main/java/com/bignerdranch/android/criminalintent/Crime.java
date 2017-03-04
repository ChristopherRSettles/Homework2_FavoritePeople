package com.bignerdranch.android.criminalintent;

import java.util.UUID;

/**
 * Created by Chris on 3/4/2017.
 */

public class Crime {
    private UUID mID;

    public UUID getID() {
        return mID;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    private String mTitle;
}
