package com.picsapp.nsoon;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

public class ResturantsDisFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_restaurants_discover, container, false);

        // Create an ArrayList of ListDetails objects
        ArrayList<ListDetails> ListDetails = new ArrayList<ListDetails>();
        //Restaurant 1
        ListDetails.add(new ListDetails(R.string.restaurant_name1, R.string.details2, R.drawable.pane_vino, R.drawable.review,
                R.drawable.review,R.drawable.review,R.drawable.review,0));
        //Restaurant 2
        ListDetails.add(new ListDetails(R.string.restaurant_name2, R.string.details4, R.drawable.koshary_abu__tareq, R.drawable.review,
                R.drawable.review,R.drawable.review,R.drawable.review,R.drawable.review));
        //Restaurant 3
        ListDetails.add(new ListDetails(R.string.restaurant_name3, R.string.details6, R.drawable.moataz_for_egyptian_food, R.drawable.review,
                R.drawable.review,R.drawable.review,R.drawable.review,0));
        //Restaurant 4
        ListDetails.add(new ListDetails(R.string.restaurant_name4, R.string.details8, R.drawable.original_konafa_restaurant, R.drawable.review,
                R.drawable.review,R.drawable.review,0,0));
        //Restaurant 5
        ListDetails.add(new ListDetails(R.string.restaurant_name5, R.string.details10, R.drawable.baha_nasseriya, R.drawable.review,
                R.drawable.review,R.drawable.review,R.drawable.review,0));
        //Restaurant 6
        ListDetails.add(new ListDetails(R.string.restaurant_name6, R.string.details1, R.drawable.recep_beans_and_falafel, R.drawable.review,
                R.drawable.review,R.drawable.review,R.drawable.review,0));
        //Restaurant 7
        ListDetails.add(new ListDetails(R.string.restaurant_name7, R.string.details3, R.drawable.revolving_restaurant, R.drawable.review,
                R.drawable.review,R.drawable.review,R.drawable.review,R.drawable.review));
        //Restaurant 8
        ListDetails.add(new ListDetails(R.string.restaurant_name8, R.string.details5, R.drawable.taboula, R.drawable.review,
                R.drawable.review,R.drawable.review,R.drawable.review,0));
        //Restaurant 9
        ListDetails.add(new ListDetails(R.string.restaurant_name9, R.string.details7, R.drawable.the_grill, R.drawable.review,
                R.drawable.review,R.drawable.review,R.drawable.review,0));
        //Restaurant 10
        ListDetails.add(new ListDetails(R.string.restaurant_name10, R.string.details9, R.drawable.zooba, R.drawable.review,
                R.drawable.review,R.drawable.review,R.drawable.review,0));

        /**
         * Create an {@link ListDetails}, whose data source is a list of
         * {@link ListDetails}s. The adapter knows how to create list item views for each item in the list.
         */
        ListDetailsAdapter flavorAdapter = new ListDetailsAdapter(getActivity(), ListDetails);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = rootView.findViewById(R.id.listview_restaurants);
        listView.setAdapter(flavorAdapter);

        return rootView;
    }
}
