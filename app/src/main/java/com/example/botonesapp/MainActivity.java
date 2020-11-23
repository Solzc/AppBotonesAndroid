package com.example.botonesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer PianoMP = MediaPlayer.create(this,R.raw.piano);
        final MediaPlayer ViolinMP = MediaPlayer.create(this,R.raw.violin);
        final MediaPlayer TrumpetMP = MediaPlayer.create(this,R.raw.trumpet);
        final MediaPlayer GuitarMP = MediaPlayer.create(this,R.raw.guitar);

        Button Boton1 = (Button) this.findViewById(R.id.button);
        Button Boton2 = (Button) this.findViewById(R.id.button2);
        Button Boton3 = (Button) this.findViewById(R.id.button3);
        Button Boton4 = (Button) this.findViewById(R.id.button4);

        Boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boton1.setBackgroundColor(Color.rgb(161,15,15));
                PianoMP.start();
            }
        });

        Boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boton2.setBackgroundColor(Color.rgb(202,125,10));
                ViolinMP.start();
            }
        });

        Boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boton3.setBackgroundColor(Color.rgb(3,118,110));
                TrumpetMP.start();
            }
        });

        Boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boton4.setBackgroundColor(Color.rgb(28,88,13));
                GuitarMP.start();
            }
        });

    }
}