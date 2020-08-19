package com.picsapp.nsoon;

public class ListDetails {

    // Name of place
    private int mPlaceName;

    // Details
    private int mDetails;

    // Drawable resource ID for image
    private int mImageResourceId;

    // Drawable resource ID for review image "star 1"
    private int mImageReviewResourceId;

    // Drawable resource ID for review image "star 2"
    private int mImageReview2ResourceId;

    // Drawable resource ID for review image "star 3"
    private int mImageReview3ResourceId;

    // Drawable resource ID for review image "star 4"
    private int mImageReview4ResourceId;

    // Drawable resource ID for review image "star 5"
    private int mImageReview5ResourceId;


    /*
     * Create a new ListDetails object.
     * @param vPlaceName is the name of the place
     * @param vDetails is the details of the place "can be any type of details"
     * @param vImageReviewResourceId is drawable reference ID that corresponds to the Android version
     * @param vImageResourceId is drawable reference ID that corresponds to the Android version
     * */
    public ListDetails (int vPlaceName, int vDetails, int vImageResourceId,
                        int vImageReviewResourceId , int vImageReview2ResourceId ,
                        int vImageReview3ResourceId , int vImageReview4ResourceId , int vImageReview5ResourceId)
    {
        mPlaceName = vPlaceName;
        mDetails = vDetails;
        mImageResourceId = vImageResourceId;
        mImageReviewResourceId = vImageReviewResourceId;
        mImageReview2ResourceId = vImageReview2ResourceId;
        mImageReview3ResourceId = vImageReview3ResourceId;
        mImageReview4ResourceId = vImageReview4ResourceId;
        mImageReview5ResourceId = vImageReview5ResourceId;
    }

    // get the place name
    public int getPlaceName() {
        return mPlaceName;
    }

    // get the details
    public int getDetails() {
        return mDetails;
    }

    // get image of the place resource id
    public int getImageResourceId() {
        return mImageResourceId;
    }

    // get image of the Review "star 1" resource id
    public int getReviewResourceId() {
        return mImageReviewResourceId;
    }

    // get image of the Review "star 2" resource id
    public int getReview2ResourceId() {
        return mImageReview2ResourceId;
    }

    // get image of the Review "star 3" resource id
    public int getReview3ResourceId() {
        return mImageReview3ResourceId;
    }

    // get image of the Review "star 4" resource id
    public int getReview4ResourceId() {
        return mImageReview4ResourceId;
    }

    // get image of the Review "star 5" resource id
    public int getReview5ResourceId() {
        return mImageReview5ResourceId;
    }

}
