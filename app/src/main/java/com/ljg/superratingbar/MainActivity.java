package com.ljg.superratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.Toast;

import com.ljg.ratingbarlib.SuperRatingBar;

public class MainActivity extends AppCompatActivity {


    private SuperRatingBar mRatingBars;
    private SuperRatingBar star_have_click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {

        mRatingBars = findViewById(R.id.star);
        star_have_click = findViewById(R.id.star_have_click);
    }

    private void initData() {
        // mRatingBar.setClickable(false);

        star_have_click.setOnRatingChangeListener(new SuperRatingBar.OnRatingChangeListener() {
            @Override
            public void onRatingChange(float ratingCount) {
                Toast.makeText(getApplicationContext(), ratingCount + "", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
