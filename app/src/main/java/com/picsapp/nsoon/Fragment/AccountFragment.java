package com.picsapp.nsoon.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import androidx.fragment.app.Fragment;

import com.picsapp.nsoon.Adapter.IOnBackPressed;
import com.picsapp.nsoon.R;

public class AccountFragment extends Fragment implements IOnBackPressed {

    Button btn1, btn2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // to get the view"Layout"
        View rootView = inflater.inflate(R.layout.fragment_account, container, false);

        // toast message for button 1
        btn1 = rootView.findViewById(R.id.button_login_google);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Toast.makeText(getActivity(), R.string.Toast , Toast.LENGTH_LONG).show();
            }
        });

        // toast message for button 2
        btn2 = rootView.findViewById(R.id.button_login_facebook);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Toast.makeText(getActivity(), R.string.Toast, Toast.LENGTH_LONG).show();
            }
        });


        // return the view "Layout"
        return rootView;
    }

    //back to first fragment when press back
    @Override
    public boolean onBackPressed() {
        //do what you want
        HomeFragment nextFrag = new HomeFragment();
        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_layout, nextFrag, "findThisFragment")
                .addToBackStack(null)
                .commit();

        return true;
    }
}
