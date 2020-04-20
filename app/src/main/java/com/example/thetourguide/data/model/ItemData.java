package com.example.thetourguide.data.model;

public class ItemData {
    private String mTitle,mAddress,mDescription;
    private int mImage;

    public ItemData(String mTitle, String mAddress, String mDescription, int mImage) {
        this.mTitle = mTitle;
        this.mAddress = mAddress;
        this.mDescription = mDescription;
        this.mImage = mImage;
    }

    public ItemData(String mTitle, String mAddress, int mImage) {
        this.mTitle = mTitle;
        this.mAddress = mAddress;
        this.mImage = mImage;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public int getImage() {
        return mImage;
    }

    public void setImage(int mImage) {
        this.mImage = mImage;
    }
}
