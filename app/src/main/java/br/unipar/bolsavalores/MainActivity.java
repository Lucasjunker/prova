package br.unipar.bolsavalores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText ativo_text;
    EditText lucro_liquido;
    EditText patri;
    EditText acao;
    EditText preco;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ativo_text = (EditText) findViewById(R.id.ativo_text);
        lucro_liquido = (EditText) findViewById(R.id.lucro_liquido);
        patri = (EditText) findViewById(R.id.patri);
        acao = (EditText) findViewById(R.id.acao);
        preco = (EditText) findViewById(R.id.preco);
    }

    public void calc(View v) {

        double lucroLiquido = Float.parseFloat(lucro_liquido.getText().toString());
        double numer_acao = Float.parseFloat(acao.getText().toString());
        double liquidoPatri = Float.parseFloat(patri.getText().toString());
        double precoAtual = Float.parseFloat(preco.getText().toString());

        double lpa = (lucroLiquido / numer_acao);
        double pl = (precoAtual / lpa);
        double roe = (lucroLiquido / liquidoPatri) * 100;
        double vpa = (liquidoPatri / numer_acao);
        double pvp = (precoAtual / vpa);


        Intent intent = new Intent(MainActivity.this, Resultado.class);
        Bundle b = new Bundle();
        b.putDouble("lpa", lpa);
        b.putDouble("pl", pl);
        b.putDouble("roe", roe);
        b.putDouble("vpa", vpa);
        b.putDouble("pvp", pvp);
        intent.putExtras(b);
        startActivity(intent);
        finish();

    }





        }



