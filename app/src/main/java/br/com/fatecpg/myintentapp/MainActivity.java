package br.com.fatecpg.myintentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText e = (EditText)findViewById(R.id.edit_message);
        String message = e.getText().toString();
        intent.putExtra("message", message);
        startActivity(intent);
    }
    public double nr1(){
        EditText N1 = (EditText) findViewById(R.id.numero1);
        return Double.parseDouble(N1.toString());
    }
    public double nr2(){
        EditText N2 = (EditText) findViewById(R.id.numero2);
        return Double.parseDouble(N2.toString());
    }
    public void somar(View view){
        Double resultado = nr1()+ nr2();
        String resultadosoma = resultado.toString();
        Intent intentsoma = new Intent(this, SomaActivity.class);
        intentsoma.putExtra("message", resultadosoma);
        startActivity(intentsoma);
    }
    public void multiplicar(View view){
        Intent intentproduto = new Intent(this, ProdutoActivity.class);
        Double resultado = nr1()* nr2();
        String resultadoproduto = resultado.toString();
        intentproduto.putExtra("message", resultadoproduto);
        startActivity(intentproduto);
    }
}
