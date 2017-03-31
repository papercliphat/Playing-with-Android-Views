package com.robosto.robosto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


public class PostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
    }


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
            case R.id.action_browse:
                goHistory();
                return true;


            default:
                return super.onOptionsItemSelected(item);
        }

    }

    public void goProfile() {
        Intent intent = new Intent(this, ProfileActivity.class);

        startActivity(intent);
    }

    public void goHistory() {
        Intent intent = new Intent(this, HistoryActivity.class);

        startActivity(intent);
    }
}