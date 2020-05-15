package br.unipar.bolsavalores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {
  TextView LPA,PVP,PL,ROE,VPA;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        LPA = (TextView)findViewById(R.id.LPA);
        PL = (TextView)findViewById(R.id.PL);
        ROE = (TextView)findViewById(R.id.ROE);
     VPA = (TextView)findViewById(R.id.VPA);
        PVP = (TextView)findViewById(R.id.PVP);

        Bundle b = getIntent().getExtras();
        assert b != null;
        double lpa = b.getDouble("lpa");
      double pl = b.getDouble("pl");
        double roe = b.getDouble("roe");
     double vpa = b.getDouble("vpa");
      double pvp = b.getDouble("pvp");

        String textoPVP = "Aqui esta o Resultado do P/VP:" + pvp;
     String textoVPA = "Aqui esta o Resultado do VPA:" + vpa;
    String textoROE = "Aqui esta o Resultado do ROE: " + roe;
        String textoPL = "Aqui esta o Resultado do P/=L" + pl;
     String textoLPA = "Aqui esta o Resultado do LPA: " + lpa;

        LPA.setText(textoLPA);
   PL.setText(textoPL);
        ROE.setText(textoROE);
   VPA.setText(textoVPA);
    PVP.setText(textoPVP);

        }


        }



