package com.examples.audiolibros;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.examples.audiolibros.fragments.PreferenciasFragment;

public class PreferenciasActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportFragmentManager().beginTransaction().replace(android.R.id.
                content, new PreferenciasFragment()).commit();
    }
}