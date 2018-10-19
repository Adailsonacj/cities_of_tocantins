package com.example.adailson.cities_of_tocantins.Dados;

import android.app.Activity;
import android.content.res.AssetManager;
import android.content.res.Resources;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class BancoDePalavras {

    Activity atividade;

    // private String[] palavras = {"GATO", "CACHORRO", "PATO", "GAIVOTA", "LEAO", "BALEIA", "ZEBRA", "PEIXE", "TUCANO"};

    /*
        public String getNext()
        {
            Random r = new Random(System.currentTimeMillis());
            int referencia = r.nextInt();
            int indice = referencia %  palavras.length-1;
            return palavras[Math.abs(indice)];
        }
        /*/
    public BancoDePalavras(Activity atividade){
        this.atividade = atividade;
    }
    public String getNext() {
        ArrayList cidades = new ArrayList();
        int numeroSelecionado = 0;

        /*
        try {

            FileReader reader = new FileReader(atividade.getFilesDir().getPath() + "/cidadesTocantins.txt");

            //FileReader Reader = new FileReader(this.getFilesDir().getPath() + "/assinaturas.txt");
            //FileReader reader = new FileReader("/idadesTocantins.txt");
            BufferedReader buffer = new BufferedReader(reader);
            String linha = null;
            while ((linha = buffer.readLine()) != null) {
                cidades.add(linha);
            }
        } catch (Exception e) {
            System.out.println("Deu pau");
        }
        Random ran = new Random();
        numeroSelecionado = ran.nextInt(cidades.size());

*/
        return "Palmas";
    }
}
