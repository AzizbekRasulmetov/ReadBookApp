package com.example.practice;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class SelfHelpActivity extends AppCompatActivity {

    private TextView title;
    private ImageView image;
    public static final String EXTRA_NAME = "extra";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_activity);

        title = (TextView) findViewById(R.id.title);
        image = (ImageView) findViewById(R.id.image);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        String extraName = getIntent().getStringExtra(EXTRA_NAME);

        if(extraName.equals(SelfHelpBook.SELF_HELP_BOOKS[0].toString())){
            image.setImageResource(R.drawable.thinkandgrowrich);
        }else if(extraName.equals(SelfHelpBook.SELF_HELP_BOOKS[1].toString())){
            image.setImageResource(R.drawable.powerofhabit);
        }
        title.setText(extraName);
    }
}
