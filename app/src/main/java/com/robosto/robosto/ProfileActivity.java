package com.robosto.robosto;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.ScrollView;


public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Button btn_dialog_logout = (Button) findViewById(R.id.dialog_logout);
        btn_dialog_logout.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                logout();
            }
        });
    }

    public void logout(){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(ProfileActivity.this);

        //sets title for alertbox
        alertDialog.setTitle(R.string.text_logout);
        //alertbox msg
        alertDialog.setMessage(R.string.logout_joke);
        //icon for alertbox
        //alertDialog.setIcon(R.drawable.logout1);

        //when positive is clicked
        alertDialog.setPositiveButton(R.string.button_logout, new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int which) {
                finish();
                Toast.makeText(ProfileActivity.this, "Logged out", Toast.LENGTH_LONG).show();
            }
        });

        //when negative is clicked
        alertDialog.setNegativeButton(R.string.button_go_back, new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        alertDialog.show();
    }

        //below is as is, no changes, rewriting for dialog button
        //Button btn_popup_logout = (Button) findViewById(R.id.popup_logout);
        //btn_popup_logout.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View view) {
         //       startActivity(new Intent(ProfileActivity.this, LogoutActivity.class));
         //   }});
   // }
            //Open popup window
            //layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
            //ViewGroup container = (ViewGroup) layoutInflater.inflate(R.layout.popup_logout, null);
            //PopupWindow popupView = new PopupWindow(container,400,400,true);

            //PopupWindow.showAtLocation(btn_popup_logout, Gravity.NO_GRAVITY,500,500);

           // popupView.setOnTouchListener(new View.OnTouchListener(){
             //   @Override
             //           public boolean onTouch(View view, MotionEvent motionEvent) {
             //               popupWindow.dismiss();
            //                return true;
             //   }
            //});

            //Button btn_nowait = (Button)popupView.findViewById(R.id.nowait);
            //btn_nowait.setOnClickListener(new Button.OnClickListener() {

               //@Override
                 //public void onClick(View v) {

                 //    popupWindow.dismiss();
               //  }
             //});

            //  popupWindow.showAsDropDown(btn_popup_logout, -30, -30);
             // });
           // }


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
                    case R.id.action_browse:
                        goBrowse();
                        return true;

                    default:
                        return super.onOptionsItemSelected(item);
                }

            }


            // Button Navigations
            public void goLogin() {
                Intent intent = new Intent(this, LoginActivity.class);

                startActivity(intent);
            }

            public void goChange(View view) {
                Intent intent = new Intent(this, ChangeActivity.class);

                startActivity(intent);
            }


            public void goBrowse() {
                Intent intent = new Intent(this, BrowseActivity.class);

                startActivity(intent);
            }

            public void goHistory(View view) {
                Intent intent = new Intent(this, HistoryActivity.class);

                startActivity(intent);
            }

            public void goLogin(View view) {
                Intent intent = new Intent(this, LoginActivity.class);

                startActivity(intent);
            }

            public void goReorder(View view) {
                Intent intent = new Intent(this, ReorderActivity.class);

                startActivity(intent);
            }
        }
