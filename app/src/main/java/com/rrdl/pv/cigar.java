package com.rrdl.pv;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.rrdl.pv.adapter.vpAdapter;
import com.rrdl.pv.model.Item;

import java.util.ArrayList;
import java.util.List;

public class cigar extends AppCompatActivity {

    List<Item> cigars  = new ArrayList<>();
    RecyclerView recyclerView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cigar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        cigars.add(new Item("here","sefe",14));
        recyclerView = findViewById(R.id.recycleView);
        Log.i("Main","Recycler View created");
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Log.i("Main","Recycler View init");
        recyclerView.setAdapter(new vpAdapter(this,cigars));
        Log.i("Main","Recycler View adapter set");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }

}
