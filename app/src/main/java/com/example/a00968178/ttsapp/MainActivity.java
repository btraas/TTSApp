package com.example.a00968178.ttsapp;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements TextToSpeech.OnInitListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void onTts(View v) {
        TextToSpeech tts = new TextToSpeech(this, this);
        tts.setLanguage(Locale.US);
        tts.speak(((EditText)findViewById(R.id.editText)).getText().toString(), TextToSpeech.QUEUE_ADD, null);

    }


    @Override
    public void onInit(int status) {

    }
}
