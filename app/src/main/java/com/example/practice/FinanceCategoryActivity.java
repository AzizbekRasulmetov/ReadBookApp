package com.example.practice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class FinanceCategoryActivity extends AppCompatActivity {

    public static final String EXTRA_NAME = "extra";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finance_category_activity);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        ListView listView = (ListView) findViewById(R.id.list_item);

        //When clicked on item it will call intent to move to BookActivity with extra information
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    Intent intent = new Intent(FinanceCategoryActivity.this, BookActivity.class);
                    intent.putExtra(BookActivity.EXTRA_NAME, FinanceBook.FINANCE_BOOKS[position].toString());
                    startActivity(intent);
            }
        };

        AdapterView.OnItemClickListener itemClickListener1 = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(FinanceCategoryActivity.this, SelfHelpActivity.class);
                intent.putExtra(SelfHelpActivity.EXTRA_NAME, SelfHelpBook.SELF_HELP_BOOKS[i].toString());
                startActivity(intent);
            }
        };


        if(name.equals("finance")) {
            ArrayAdapter<FinanceBook> bookList = new ArrayAdapter<>(
                    this,
                    android.R.layout.simple_list_item_1,
                    FinanceBook.FINANCE_BOOKS
            );
            listView.setOnItemClickListener(itemClickListener);
            listView.setAdapter(bookList);
        }else if(name.equals("selfhelp")){
            ArrayAdapter<SelfHelpBook> bookList = new ArrayAdapter<>(
                    this,
                    android.R.layout.simple_list_item_1,
                    SelfHelpBook.SELF_HELP_BOOKS
            );
            listView.setOnItemClickListener(itemClickListener1);
            listView.setAdapter(bookList);
        }

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


    }
}
