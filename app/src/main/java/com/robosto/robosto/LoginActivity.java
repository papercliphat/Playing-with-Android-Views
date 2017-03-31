package com.robosto.robosto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
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
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        int id = item.getItemId();
        // handle presses on the action bar items
        switch (id) {
            case R.id.action_person:
                goProfile();
                return true;
            case R.id.action_browse:
                goBrowse();
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

