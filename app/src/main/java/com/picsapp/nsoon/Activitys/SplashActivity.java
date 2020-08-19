package com.picsapp.nsoon.Activitys;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.picsapp.nsoon.R;

/*
 * This class for display Splash screen
 */
public class SplashActivity extends AppCompatActivity {

    // make variable to set times
    // time of display
    int SPLASH_TIME = 3000; //This is 3 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach);

        // Hide status bar
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //make an Animation for the ImageView
        ImageView image = findViewById(R.id.first_image);
        Animation animation = AnimationUtils.loadAnimation(SplashActivity.this, R.anim.animation_splach);
        image.setAnimation(animation);

        // code to start timer and take action after the timer ends
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // do any action here.
                // now we are moving to next page
                Intent mySuperIntent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(mySuperIntent);

                // this 'finish()' is for exiting the app when back button pressed from Home page which is MainActivity
                finish();
            }
        }, SPLASH_TIME);
    }
}