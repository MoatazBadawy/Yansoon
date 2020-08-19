package com.picsapp.nsoon.Activitys;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;
import com.picsapp.nsoon.Adapter.IOnBackPressed;
import com.picsapp.nsoon.Fragment.AccountFragment;
import com.picsapp.nsoon.Fragment.DiscoverFragment;
import com.picsapp.nsoon.Fragment.HomeFragment;
import com.picsapp.nsoon.Fragment.WorldFragment;
import com.picsapp.nsoon.R;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    ChipNavigationBar bottomNav;
    FragmentManager fragmentManager;

    @RequiresApi(api = Build.VERSION_CODES.N_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //make the status bar white with black icons
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        /* To create and display menu options after Long press on app icon */
        ShortcutManager shortcutManager = getSystemService(ShortcutManager.class);
        ShortcutInfo shortcut = new ShortcutInfo.Builder(MainActivity.this, "id1")
                .setShortLabel("instagram")
                .setLongLabel("instagram")
                .setIcon(Icon.createWithResource(MainActivity.this, R.drawable.instagram))
                .setIntent(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/thecoderui/")))
                .build();
        shortcutManager.setDynamicShortcuts(Arrays.asList(shortcut));

        bottomNav = findViewById(R.id.bottom_navigation);
        if (savedInstanceState == null) {
            bottomNav.setItemSelected(R.id.item1, true);
            fragmentManager = getSupportFragmentManager();
            HomeFragment homeFragment = new HomeFragment();
            fragmentManager.beginTransaction()
                    .replace(R.id.fragment_layout, homeFragment)
                    .commit();
        }

        bottomNav.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int id) {
                Fragment fragment = null;
                switch (id) {
                    case R.id.item1:
                        fragment = new HomeFragment();
                        break;
                    case R.id.item2:
                        fragment = new WorldFragment();
                        break;
                    case R.id.item3:
                        fragment = new DiscoverFragment();
                        break;
                    case R.id.item4:
                        fragment = new AccountFragment();
                        break;
                }

                if (fragment != null) {
                    fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction()
                            .replace(R.id.fragment_layout, fragment)
                            .commit();
                } else {
                    Log.e(TAG, "Error in creating fragment");
                }
            }
        });
    }

    //to select the right bottom navigation when press back
    public static void setHomeItem(Activity activity) {
        ChipNavigationBar bottomNavigationView = activity.findViewById(R.id.bottom_navigation);
        bottomNavigationView.setItemSelected(R.id.item1,true);
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed(); delete this line
        // and start your fragment:
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fragment_layout);
        if (!(fragment instanceof IOnBackPressed) || !((IOnBackPressed) fragment).onBackPressed()) {
            super.onBackPressed();
        }

        //to select the right bottom navigation when press back
        ChipNavigationBar bottomNavigationView = findViewById(R.id.bottom_navigation);
        int seletedItemId = bottomNavigationView.getSelectedItemId();
        if (R.id.item1 != seletedItemId) {
            setHomeItem(MainActivity.this);
        } else {
            super.onBackPressed();
        }
    }
}
