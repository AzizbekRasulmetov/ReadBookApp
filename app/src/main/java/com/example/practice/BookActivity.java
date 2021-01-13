package com.example.practice;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class BookActivity extends AppCompatActivity {

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

        ListView listView = (ListView) findViewById(R.id.list_item);
        String extraString = getIntent().getStringExtra(EXTRA_NAME); //Get extra info

        if(extraString.equals(FinanceBook.FINANCE_BOOKS[0].toString())){
            image.setImageResource(R.drawable.richdad2);
            image.setContentDescription("Rich Dad Poor Dad");
        } else if (extraString.equals(FinanceBook.FINANCE_BOOKS[2].toString())){
            image.setImageResource(R.drawable.kitaanddognamed);
            image.setContentDescription("Kita and Dog Named Money");
        }else if(extraString.equals(FinanceBook.FINANCE_BOOKS[1].toString())){
            image.setImageResource(R.drawable.theroadtofinancialfreedom);
            image.setContentDescription("The Road To Financial Freedom");
        }else if(extraString.equals(FinanceBook.FINANCE_BOOKS[3].toString())){
            image.setImageResource(R.drawable.babylon);
            image.setContentDescription("The Richest Man In Babylon");
        }
        title.setText(extraString);








    }
}
