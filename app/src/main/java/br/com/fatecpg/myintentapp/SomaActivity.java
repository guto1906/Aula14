package br.com.fatecpg.myintentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SomaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soma);

        Intent intent = getIntent();
        String r = intent.getStringExtra("message");
        TextView text = (TextView)findViewById(R.id.resultado_soma);
        text.setText(r);

    }
}
