package com.yafiasamuelhalim.quaker;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Created by Yafia on 4/6/2018.
 */

public class MainActivity extends Activity {
    private ListView list;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> arrayList;
//    private SitesAdapter mAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_main);

        list = findViewById(R.id.listA);
        arrayList = new ArrayList<String>();

        arrayList.add("test");
        arrayList.add("asd");
        arrayList.add("asd");

        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, arrayList);

        list.setAdapter(adapter);


    }



}

