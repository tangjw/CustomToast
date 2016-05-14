package com.zonsim.customtoast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }
    
    public void toast1(View view) {
        Toast.makeText(MainActivity.this, "哈哈", Toast.LENGTH_SHORT).show();
    }
    
    public void toast2(View view) {
        
    }
}
