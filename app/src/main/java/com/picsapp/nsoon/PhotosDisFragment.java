package com.picsapp.nsoon;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

public class PhotosDisFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_photos_discover, container, false);

        // Create an ArrayList of ListPhotos objects
        ArrayList<ListPhotos> ListPhotos = new ArrayList<ListPhotos>();
        //Photo 1
        ListPhotos.add(new ListPhotos(R.drawable.p1));
        //Photo 2
        ListPhotos.add(new ListPhotos(R.drawable.p2));
        //Photo 3
        ListPhotos.add(new ListPhotos(R.drawable.p3));
        //Photo 4
        ListPhotos.add(new ListPhotos(R.drawable.p4));
        //Photo 5
        ListPhotos.add(new ListPhotos(R.drawable.p5));
        //Photo 6
        ListPhotos.add(new ListPhotos(R.drawable.p6));
        //Photo 7
        ListPhotos.add(new ListPhotos(R.drawable.p7));
        //Photo 8
        ListPhotos.add(new ListPhotos(R.drawable.p8));
        //Photo 9
        ListPhotos.add(new ListPhotos(R.drawable.p9));
        //Photo 10
        ListPhotos.add(new ListPhotos(R.drawable.p10));
        //Photo 11
        ListPhotos.add(new ListPhotos(R.drawable.p11));


        /**
         * Create an {@link ListPhotos, whose data source is a list of
         * {@link ListPhotos}s. The adapter knows how to create list item views for each item in the list.
         */
        ListPhotosAdapter flavorAdapter = new ListPhotosAdapter(getActivity(), ListPhotos);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = rootView.findViewById(R.id.listview_photos);
        listView.setAdapter(flavorAdapter);

        return rootView;
    }

}
