package br.com.fatecpg.myintentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProdutoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);

        Intent intentproduto = getIntent();
        String r = intentproduto.getStringExtra("resultadoproduto");
        TextView text = (TextView)findViewById(R.id.resultado_produto);
        text.setText(r);
    }
}
