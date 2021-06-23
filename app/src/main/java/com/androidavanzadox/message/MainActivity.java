package com.androidavanzadox.message;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnToast;
    Button btnSnackBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToast = findViewById(R.id.buttonToast);
        btnSnackBar = findViewById(R.id.buttonSnackBar);

        btnToast.setOnClickListener(this);
        btnSnackBar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.buttonToast){
            Toast.makeText(this,"MENSAJE desde ACTIVITY",Toast.LENGTH_SHORT).show();
        }else if(v.getId()== R.id.buttonSnackBar){
            Log.i("SNACKBARLOG","se llamo al SNACKBAR");
            Snackbar.make(v,"ESTE ES UN SNACKBAR",Snackbar.LENGTH_LONG).show();
        }
    }
}