package com.example.project17_list2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txt_ItemSelect;
    private ListView lsv_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_ItemSelect = (TextView) findViewById(R.id.txt_ItemSelect);
        lsv_main = (ListView) findViewById(R.id.lsv_main);
        ArrayAdapter<CharSequence> arrAdap
                = ArrayAdapter.createFromResource(MainActivity.this,
                R.array.region_list,
                android.R.layout.simple_list_item_single_choice);
        lsv_main.setAdapter(arrAdap);
        lsv_main.setSelection(2);
        lsv_main.setOnItemClickListener(listViewRegionOnItemClick);
    }

    private AdapterView.OnItemClickListener listViewRegionOnItemClick
            = new AdapterView.OnItemClickListener()
    {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id)
        {
            txt_ItemSelect.setText("" + ((TextView) view).getText());
        }
    };

    }
