package com.picsapp.nsoon;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

public class PlacesDisFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_places_discover, container, false);

        // Create an ArrayList of ListDetails objects
        ArrayList<ListDetails> ListDetails = new ArrayList<ListDetails>();
        //Place 1
        ListDetails.add(new ListDetails(R.string.place_name1, R.string.details1, R.drawable.pyramids, 0,
                0,0,0,0));
        //Place 2
        ListDetails.add(new ListDetails(R.string.place_name2, R.string.details2, R.drawable.egyptian_museum, 0,
                0,0,0,0));
        //Place 3
        ListDetails.add(new ListDetails(R.string.place_name3, R.string.details3, R.drawable.khan_el_khalili, 0,
                0,0,0,0));
        //Place 4
        ListDetails.add(new ListDetails(R.string.place_name4, R.string.details4, R.drawable.salah, 0,
                0,0,0,0));
        //Place 5
        ListDetails.add(new ListDetails(R.string.place_name5, R.string.details5, R.drawable.cairo_tower, 0,
                0,0,0,0));
        //Place 6
        ListDetails.add(new ListDetails(R.string.place_name6, R.string.details6, R.drawable.al_azhar_mosque, 0,
                0,0,0,0));
        //Place 7
        ListDetails.add(new ListDetails(R.string.place_name7, R.string.details7, R.drawable.al_moez, 0,
                0,0,0,0));
        //Place 8
        ListDetails.add(new ListDetails(R.string.place_name8, R.string.details8, R.drawable.giza_zoo, 0,
                0,0,0,0));
        //Place 9
        ListDetails.add(new ListDetails(R.string.place_name9, R.string.details9, R.drawable.pharaonic_village, 0,
                0,0,0,0));
        //Place 10
        ListDetails.add(new ListDetails(R.string.place_name10, R.string.details10, R.drawable.coptic_museum, 0,
                0,0,0,0));

        /**
         * Create an {@link ListDetails}, whose data source is a list of
         * {@link ListDetails}s. The adapter knows how to create list item views for each item in the list.
         */
        ListDetailsAdapter flavorAdapter = new ListDetailsAdapter(getActivity(), ListDetails);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = rootView.findViewById(R.id.listview_places);
        listView.setAdapter(flavorAdapter);

        return rootView;
    }
}
