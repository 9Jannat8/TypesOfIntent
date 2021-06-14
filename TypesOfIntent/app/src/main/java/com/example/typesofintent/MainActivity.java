package com.example.typesofintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btnId);
        button2 = findViewById(R.id.btn2Id);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ForExplicitIntent.class);//Explicit Intent(within The App)
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".DifferentWayListener");//implicit Intent ...ata jabe adding backbutton project er differentwaylistener activity te
                startActivity(intent);
                //a khetre age j activity te jabo tar package name copy kore sei app er manifests file a jete hobe..oi activity er modde intent-filter er ongso ta copy paste korte hobe..
                //sekhane action name a package ta paste korte hobe.
                //tarpor category name a LAUNCHER er jaygay DEFAULT likhte hobe
            }
        });
    }
}