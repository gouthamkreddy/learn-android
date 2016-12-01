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
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Adapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        RelativeLayout Layout = (RelativeLayout) findViewById(R.id.form_layout);
        Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClickMovies(View v) {
                Intent intent = new Intent(MainActivity.this, Movies2Activity.class);
//                EditText editText = (EditText) findViewById(R.id.edit_message);
//                String message = editText.getText().toString();
//                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
            }

            @Override
            public void onClickTrains(View v) {
                Intent intent = new Intent(MainActivity.this, Movies2Activity.class);
                startActivity(intent);
            }
        });
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
