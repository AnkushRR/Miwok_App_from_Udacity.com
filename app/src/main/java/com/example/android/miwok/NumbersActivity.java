package com.example.android.miwok;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ActionMode;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.EventListener;

public class NumbersActivity extends AppCompatActivity {

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        ArrayList<word_format> words = new ArrayList<word_format> ();
        words.add(new word_format("lutti","One",R.mipmap.ic_launcher));
        words.add(new word_format("otiiko","Two",R.mipmap.ic_launcher));
        words.add(new word_format("tolookosu","Three",R.mipmap.ic_launcher));
        words.add(new word_format("oyyisa","Four",R.mipmap.ic_launcher));
        words.add(new word_format("massokka","Five",R.mipmap.ic_launcher));
        words.add(new word_format("temokka","Six",R.mipmap.ic_launcher));
        words.add(new word_format("kenekaku","Seven",R.mipmap.ic_launcher));
        words.add(new word_format("kawinta","Eight",R.mipmap.ic_launcher));
        words.add(new word_format("wo'e","Nine",R.mipmap.ic_launcher));
        words.add(new word_format("na'aacha","Ten",R.mipmap.ic_launcher));

      //  ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);
        iWordAdapter adapter = new iWordAdapter(this,words);


        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }


}
