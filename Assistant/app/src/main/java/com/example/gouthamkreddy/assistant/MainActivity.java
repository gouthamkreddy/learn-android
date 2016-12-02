package com.example.gouthamkreddy.assistant;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
//import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.view.View.OnClickListener;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Adapter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.content.Context;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(this);
        ImageView ImageMovies = (ImageView) findViewById(R.id.imageViewMovies);
        ImageMovies.setOnClickListener(this);
        ImageView ImageTrains = (ImageView) findViewById(R.id.imageViewTrains);
        ImageTrains.setOnClickListener(this);
        ImageView ImageTranslate = (ImageView) findViewById(R.id.imageViewTranslate);
        ImageTranslate.setOnClickListener(this);
        ImageView ImageDictionary = (ImageView) findViewById(R.id.imageViewDictionary);
        ImageDictionary.setOnClickListener(this);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

//        ImageView ImageMovies = (ImageView) findViewById(R.id.form_layout);
//        ImageMovies.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClickMovies(View view) {
//                Intent intent = new Intent(MainActivity.this, Movies2Activity.class);
////                EditText editText = (EditText) findViewById(R.id.edit_message);
////                String message = editText.getText().toString();
////                intent.putExtra(EXTRA_MESSAGE, message);
//                startActivity(intent);
//            }
//        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.fab:
                ConnectivityManager connectivityManager
                        = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected())
                {
                    Snackbar.make(view, "Hi Goutham, You are connected to Network !", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
                else
                {
                    Snackbar.make(view, "Hi Goutham, You are not connected to Network !", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }

                break;

            case R.id.imageViewMovies:
                Intent intentMovies = new Intent(MainActivity.this, Movies2Activity.class);
                startActivity(intentMovies);
                break;

            case R.id.imageViewTrains:
                Intent intentTrains = new Intent(MainActivity.this, TrainsActivity.class);
                startActivity(intentTrains);
                break;

            case R.id.imageViewTranslate:
                Intent intentTranslate = new Intent(MainActivity.this, MoviesActivity.class);
                startActivity(intentTranslate);
                break;

            case R.id.imageViewDictionary:
                Intent intentDictionary = new Intent(MainActivity.this, Movies2Activity.class);
                startActivity(intentDictionary);
                break;

            default:
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }




}



//TextView view = (TextView) findViewById(R.id.textView1);
//view.setOnClickListener(new View.OnClickListener() {
//
//    @Override
//    public void onClick(View v) {
//
//        }
//
//        })
