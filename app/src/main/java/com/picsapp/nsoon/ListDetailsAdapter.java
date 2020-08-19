package com.picsapp.nsoon;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


/*
 * {@link ListDetailsAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link ListDetails} objects.
 * */
public class ListDetailsAdapter extends ArrayAdapter<ListDetails> {

    private static final String LOG_TAG = ListDetailsAdapter.class.getSimpleName();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param ListDetails A List of songListDetail objects to display in a list
     */
    public ListDetailsAdapter(Activity context, ArrayList<ListDetails> ListDetails) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, ListDetails);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }

        // Get the {@link ListDetails} object located at this position in the list
        ListDetails currentListDetails = getItem(position);

        // Find the TextView in the list_items.xml layout with the ID version_name
        TextView PlaceNameTextView = listItemView.findViewById(R.id.text_place_name);
        // Get the version name from the current songListDetail object and
        // set this text on the place name TextView
        PlaceNameTextView.setText(currentListDetails.getPlaceName());

        // Find the TextView in the list_items.xml layout with the ID version_number
        TextView PlaceDetailTextView = listItemView.findViewById(R.id.text_place_detail);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the place detail TextView
        PlaceDetailTextView.setText(currentListDetails.getDetails());

        // Find the ImageView in the list_items.xml layout with the ID list_item_icon
        ImageView iconView = listItemView.findViewById(R.id.image_place);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        iconView.setImageResource(currentListDetails.getImageResourceId());


        // Find the ImageView in the list_items.xml layout with the ID Menu
        ImageView StarView1 = listItemView.findViewById(R.id.image_review1);
        // Get the image resource ID from the current SongListDetail object and
        // set the image to StarView1
        StarView1.setImageResource(currentListDetails.getReviewResourceId());

        ImageView StarView2 = listItemView.findViewById(R.id.image_review2);
        // Get the image resource ID from the current SongListDetail object and
        // set the image to StarView2
        StarView2.setImageResource(currentListDetails.getReview2ResourceId());

        ImageView StarView3 = listItemView.findViewById(R.id.image_review3);
        // Get the image resource ID from the current SongListDetail object and
        // set the image to StarView3
        StarView3.setImageResource(currentListDetails.getReview3ResourceId());

        ImageView StarView4 = listItemView.findViewById(R.id.image_review4);
        // Get the image resource ID from the current SongListDetail object and
        // set the image to StarView4
        StarView4.setImageResource(currentListDetails.getReview4ResourceId());

        ImageView StarView5 = listItemView.findViewById(R.id.image_review5);
        // Get the image resource ID from the current SongListDetail object and
        // set the image to StarView5
        StarView5.setImageResource(currentListDetails.getReview5ResourceId());


        // Return the whole list item layout (containing 2 TextViews and an 7 ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
