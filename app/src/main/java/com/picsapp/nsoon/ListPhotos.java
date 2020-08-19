package com.picsapp.nsoon;

public class ListPhotos {


    // Drawable resource ID for image
    private int mImageResourceId;


    /*
     * Create a new ListDetails object.
     * @param vImageResourceId is drawable reference ID that corresponds to the Android version
     * */
    public ListPhotos(int vImageResourceId)
    {
        mImageResourceId = vImageResourceId;
    }

    // get image of the place resource id
    public int getImageResourceId() {
        return mImageResourceId;
    }
}
