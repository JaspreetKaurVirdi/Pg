package com.jaspreet.imageslider;

import android.graphics.Color;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    ImageView bookmark;
    boolean check = false;
    int images[] = {R.drawable.image_1, R.drawable.image_2, R.drawable.image_3, R.drawable.image_4};
    MyCustomAdapter myCustomPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bookmark = (ImageView)findViewById(R.id.bookmark);


        viewPager = (ViewPager) findViewById(R.id.viewPager);

        myCustomPagerAdapter = new MyCustomAdapter(MainActivity.this, images);
        viewPager.setAdapter(myCustomPagerAdapter);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);

        final MenuItem menuItem = menu.findItem(R.id.action_favorite);

        View actionView = MenuItemCompat.getActionView(menuItem);

        actionView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //onOptionsItemSelected(menuItem);
                check = true;
              bookmark.setBackgroundColor(Color.RED);
                Toast.makeText(MainActivity.this, "added to wishlist", Toast.LENGTH_SHORT).show();

            }
        });
        if (check == true) {
           bookmark.setBackgroundColor(Color.YELLOW);
           // bookmark.setBackgroundColor(Color.RED);
        }
        return true;
    }
}
