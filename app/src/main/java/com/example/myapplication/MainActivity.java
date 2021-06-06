package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public final static String TAG="===MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"Log msg");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        switch (id){
            case R.id.action_settings:
                return true;
            case R.id.action_hello_world:
                Toast.makeText(this,
                        R.string.hello_world,
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_android_forever:
                Toast.makeText(this,
                        R.string.android_forever,Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void btnClick(View view) {
        int id=view.getId();
        switch (id){
            case R.id.btn1:
                Toast.makeText(this,
                        "Button Clicked!",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}