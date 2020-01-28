package com.example.rishabhex3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    View view;
    @Override    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.red:
                view.setBackgroundColor(Color.RED);
                break;
            case R.id.blue:
                view.setBackgroundColor(Color.BLUE);
                break;
            case R.id.green:
                view.setBackgroundColor(Color.GREEN);
                break;
            case R.id.yellow:
                view.setBackgroundColor(Color.YELLOW);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return super.onOptionsItemSelected(item);
    }



    @Override    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view=(View)findViewById(R.id.myview);
    }

}