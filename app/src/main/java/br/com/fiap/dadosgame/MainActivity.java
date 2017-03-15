package br.com.fiap.dadosgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imgJogador, imgComp;
    private int dados[] = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgJogador = (ImageView) findViewById(R.id.imgJogador);
        imgComp = (ImageView) findViewById(R.id.imgComp);

        dados = new int[6];
        dados[0] = R.drawable.dado1;
        dados[1] = R.drawable.dado2;
        dados[2] = R.drawable.dado3;
        dados[3] = R.drawable.dado4;
        dados[4] = R.drawable.dado5;
        dados[5] = R.drawable.dado6;
    }

    public void jogar (View view){
        Random rJogador = new Random();
        int nJogador = rJogador.nextInt(5);

        Random rComp = new Random();
        int nComp = rComp.nextInt(5);

        String resultado = "Empate";

        if (nJogador > nComp){
            resultado = "Jogador venceu!";
        } else if (nJogador < nComp){
            resultado = "Computador venceu!";
        }

        //Result 1
        imgJogador.setImageResource(dados[nJogador]);
        imgComp.setImageResource(dados[nComp]);
        //Result 2
        Toast.makeText(this, resultado, Toast.LENGTH_LONG).show();
    }
}

