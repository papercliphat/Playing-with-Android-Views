package com.robosto.robosto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class HistoryActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        Spinner spinner = (Spinner) findViewById(R.id.spinner_history);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.spinner_history, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);

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