package com.sebafutzu.customadapter.GUI;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.sebafutzu.customadapter.R;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }

    public void generarLista(View view){
        Intent resultIntent = new Intent(this, Lista.class);
        Bundle bundle = new Bundle();
        ((Activity) this).startActivityForResult(resultIntent, 1);
    }

    public void generarGrilla(View view){
        Intent resultIntent = new Intent(this, Grilla.class);
        Bundle bundle = new Bundle();
        ((Activity) this).startActivityForResult(resultIntent, 2);
    }


}
