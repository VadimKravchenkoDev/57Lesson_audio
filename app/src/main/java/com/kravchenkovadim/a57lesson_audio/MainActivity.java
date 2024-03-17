package com.kravchenkovadim.a57lesson_audio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    Button playButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       playButton = findViewById(R.id.playButton);
       mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.stuff);
       playButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if (playButton.getText().equals("Play")){
                   mediaPlayer.start();
                   playButton.setText("Pause");
               } else if(playButton.getText().equals("Pause")){
                   mediaPlayer.pause();
                   playButton.setText("Play");
               }
           }
       });
    }
}