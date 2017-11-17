package com.example.todolistapplication;

import android.icu.lang.UCharacter;

import java.util.Date;
import java.util.UUID;

/**
 * Created by dean on 16/11/17.
 */

public class Todo {
    private UUID mId;
    private String mTitle;
    private String mDetail;
    private Date mDate;
    private boolean mIsComplete;


    public void setId(UUID mId) {
        this.mId = mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getDetail() {
        return mDetail;
    }

    public void setDetail(String mDetail) {
        this.mDetail = mDetail;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

    public void setComplete(boolean mIsComplete) {
        this.mIsComplete = mIsComplete;
    }

    public boolean IsComplete() {
        return mIsComplete;
    }


    public Todo() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public Date getDate() {
        return mDate;
    }
}