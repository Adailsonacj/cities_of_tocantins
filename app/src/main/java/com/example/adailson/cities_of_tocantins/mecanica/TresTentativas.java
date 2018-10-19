package com.example.adailson.cities_of_tocantins.mecanica;

import android.app.Activity;

import com.example.adailson.cities_of_tocantins.Dados.BancoDePalavras;

public class TresTentativas implements MecanicaDoJogo {
    private int qtdPalavrasAcertadas = 0;
    private int qtdErros = 0;
    private BancoDePalavras banco;
    Activity activity;
    private String palavraCorrente;
    private int pontos;

    public TresTentativas(Activity activity) {
        banco = new BancoDePalavras(activity);
        this.palavraCorrente = banco.getNext();
        this.pontos = 0;
    }

    public String getNome() {
        return "3 Erros...";
    }

    public String getDescricao() {
        return "VOCÊ POSSUI TRÊS VIDAS.. <3 \n OS ESPAÇOS SÃO \"-\", PRESTE BASTANTE ATENÇÃO.";
    }

    public boolean jogoAcabou() {
        return this.qtdErros != 3;
    }

    public String getPalavraDaRodada() {
        return this.palavraCorrente;
    }

    public String tentativa(String palavra, String resposta) {
        if (palavra.toUpperCase().equals(resposta.toUpperCase())) {
            this.pontos += 100;
            this.palavraCorrente = this.banco.getNext();
            ++this.qtdPalavrasAcertadas;
            return "Acertou!! + 100 Pontos";
        } else {
            this.pontos -= 50;
            ++this.qtdErros;
            return "Tente Novamente!!";
        }
    }

    public String resultadoFinal() {
        if (this.pontos < 0) {
            this.pontos = 0;
        }

        return "\n ########FIM DE JOGO####### \n Você conseguiu " + this.pontos + " pontos! \n Acertou " + this.qtdPalavrasAcertadas + " palavras";
    }
}