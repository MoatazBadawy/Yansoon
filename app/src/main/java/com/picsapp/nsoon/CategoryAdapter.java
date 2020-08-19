package com.picsapp.nsoon;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.picsapp.nsoon.Fragment.DiscoverFragment;


/**
 * {@link CategoryAdapter} is a {@link FragmentStatePagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link } objects.
 */
public class CategoryAdapter extends FragmentStatePagerAdapter {

    /** Context of the app */
    private DiscoverFragment mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *  @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     */
    public CategoryAdapter(DiscoverFragment context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PlacesDisFragment();
        }

        else if (position == 1) {
            return new ResturantsDisFragment();
        }

        else if (position == 2) {
            return new PhotosDisFragment();
        }

        else {
            return new PhotosDisFragment();
        }
    }

    // each tab title
    // to shows the names for each fragment on tab title
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_places);
        }

        else if (position == 1) {
            return mContext.getString(R.string.category_resturants);
        }

        else if (position == 2) {
            return mContext.getString(R.string.category_photos2);
        }


        else {
            return mContext.getString(R.string.category_photos);
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

}