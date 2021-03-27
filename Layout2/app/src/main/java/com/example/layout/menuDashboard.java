package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menuDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_dashboard);
    }

    public void Pindah1(View view) {
        Intent intent = new Intent(menuDashboard.this, MainActivity.class);
        startActivity(intent);
    }

    public void Pindah2(View view) {
        Intent intent = new Intent(menuDashboard.this, relativeLayout.class);
        startActivity(intent);
    }

    public void Pindah3(View view) {
        Intent intent = new Intent(menuDashboard.this, constraintLayout.class);
        startActivity(intent);
    }

    public void Pindah5(View view) {
        Intent intent = new Intent(menuDashboard.this, tabelLayout.class);
        startActivity(intent);
    }

    public void Pindah6(View view) {
        Intent intent = new Intent(menuDashboard.this, scrollView.class);
        startActivity(intent);
    }

}