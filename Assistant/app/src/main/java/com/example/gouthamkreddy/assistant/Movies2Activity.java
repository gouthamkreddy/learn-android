package com.example.gouthamkreddy.assistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Movies2Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies2);

        Intent intent = getIntent();

        Button buttonNellore = (Button) findViewById(R.id.buttonNellore);
        buttonNellore.setOnClickListener(this);
        Button buttonKanpur = (Button) findViewById(R.id.buttonKanpur);
        buttonKanpur.setOnClickListener(this);
        Button buttonBangalore = (Button) findViewById(R.id.buttonBangalore);
        buttonNellore.setOnClickListener(this);
        Button buttonGo = (Button) findViewById(R.id.buttonGo);
        buttonGo.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            Intent intentMoviesList = new Intent(Movies2Activity.this, Movies2Activity.class);

            case R.id.buttonNellore:
                String message = "Nellore";

            case R.id.buttonKanpur:
                String message = "Kanpur"

            case R.id.buttonBangalore:
                String message = "Bangalore"

            case R.id.buttonGo:
                EditText editText = (EditText) findViewById(R.id.edit_message);
                String message = editText.getText().toString();
                intent.putExtra(EXTRA_MESSAGE, message);

            default:
                break;

            intentMoviesList.putExtra(EXTRA_MESSAGE, message);
            startActivity(intentMovies);
            break;
        }
    }
}
