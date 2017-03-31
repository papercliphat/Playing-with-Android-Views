package com.robosto.robosto;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;


public class BrowseActivity extends AppCompatActivity {

    private View content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);

     //   initFab();

    }

    //public void initFab() {
    //    findViewById(R.id.fab).setOnClickListener(new View.OnClickListener() {
     //       @Override
     //       public void onClick(View v) {
     //           Snackbar.make(content, "FAB Clicked", Snackbar.LENGTH_SHORT).show();
     //       }
     //   });
    //}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_person:
                goProfile();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }



    public void goProfile() {
        Intent intent = new Intent(this, ProfileActivity.class);

        startActivity(intent);
    }

    public void goBrowse() {
        Intent intent = new Intent(this, BrowseActivity.class);

        startActivity(intent);
    }
}
