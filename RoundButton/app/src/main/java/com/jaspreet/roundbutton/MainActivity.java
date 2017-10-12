package com.jaspreet.roundbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView ivm,ivc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    ivm =(ImageView)findViewById(R.id.mohali);
        ivc = (ImageView)findViewById(R.id.chandigarh);
        ivm.setOnClickListener(this);
        ivc.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == (R.id.mohali)){
            Toast.makeText(this, "MOHALI", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "CHANDIGARH", Toast.LENGTH_SHORT).show();
        }
    }
}
