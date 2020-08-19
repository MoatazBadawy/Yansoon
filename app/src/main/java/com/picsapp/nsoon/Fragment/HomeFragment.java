package com.picsapp.nsoon.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

import com.picsapp.nsoon.Adapter.IOnBackPressed;
import com.picsapp.nsoon.R;

import java.util.Objects;

public class HomeFragment extends Fragment implements IOnBackPressed {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // to get the view"Layout"
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        // return the view "Layout"
        return rootView;
    }

    //exit the app when press back
    @Override
    public boolean onBackPressed() {
        //exit the app when press back
        Objects.requireNonNull(getActivity()).moveTaskToBack(true);
        getActivity().finish();
        return true;
    }
}
