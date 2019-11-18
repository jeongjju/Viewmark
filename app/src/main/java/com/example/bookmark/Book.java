package com.example.bookmark;

import java.util.UUID;

public class Book {
    private UUID mId;
    private String mTitle;

    public UUID getId() {
        return mId;
    }
    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public Book(){
        mId = UUID.randomUUID();
    }
}
