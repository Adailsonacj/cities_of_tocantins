package com.example.adailson.cities_of_tocantins;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.adailson.cities_of_tocantins.Joguinho.Embaralhador;
import com.example.adailson.cities_of_tocantins.Joguinho.FabricaEmbaralhador;
import com.example.adailson.cities_of_tocantins.mecanica.FabricaMecanicaDoJogo;
import com.example.adailson.cities_of_tocantins.mecanica.MecanicaDoJogo;
import com.example.adailson.cities_of_tocantins.mecanica.TresTentativas;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    TextView verCidade;
    TextView verModo;
    TextView verDescricao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        verCidade = (TextView) findViewById(R.id.viewCidade);
        verModo = findViewById(R.id.viewModo);
        verDescricao = findViewById(R.id.viewDescicao);

        TresTentativas mecanica = new TresTentativas(this);
        verModo.setText(mecanica.getNome());
        //System.out.println("Modo de Jogo: " + mecanica.getNome() + "\n");
        verDescricao.setText(mecanica.getDescricao());
        /*
        //System.out.println("Descrição: " + mecanica.getDescricao() + "\n" + "\n");
        while (mecanica.jogoAcabou()) {
            String palavra = mecanica.getPalavraDaRodada();
            Embaralhador emb = FabricaEmbaralhador.getRandom();
            String embaralhada = emb.embaralhar(palavra);
            verCidade.setText(embaralhada);
            //System.out.println("Advinhe a palavra: " + embaralhada);

            //String resposta = s.nextLine();
            //String resultado = mecanica.tentativa(palavra, resposta);
            //System.out.println(resultado);
        }
        //System.out.println(mecanica.resultadoFinal());
        */
    }
}
