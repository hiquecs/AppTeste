package br.app.teste.henrique;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.io.FileNotFoundException;



public class Ranking extends AppCompatActivity {

    private TextView nomeJogador;
    private TextView pontoJogador;
    private String nomeRecuperado;
    private String pontuacaoJogador;
    private TextView p;
    private TextView placar;

    public Ranking() throws FileNotFoundException {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);
        Intent it = getIntent();
        nomeRecuperado  = it.getStringExtra("nomePessoa");
        pontuacaoJogador = it.getStringExtra("pontoJogador");
        nomeJogador = (TextView) findViewById(R.id.nomeJogador);
        pontoJogador = (TextView) findViewById(R.id.pontoJogador);
        p = (TextView) findViewById(R.id.record);
        placar  = (TextView) findViewById(R.id.placar);


        nomeJogador.setText(nomeRecuperado);
        pontoJogador.setText(pontuacaoJogador);

        SharedPreferences nome = getSharedPreferences("nome",0);
        SharedPreferences pontos = getSharedPreferences("pontos",0);

        String n = nome.getString("nome","");

        int i = pontos.getInt("pontos",MODE_PRIVATE);

        if ( i < Integer.parseInt(pontuacaoJogador)){
            salvarRanking();
        }
        p.setText( n );
        placar.setText( String.valueOf(i));

        if ( i < Integer.parseInt(pontuacaoJogador)){
            salvarRanking();
        }
    }

    public void voltarInicio(View botao){

        Intent it = new Intent(this, Principal.class);
        startActivity(it);
        fechar();
    }
    public void jogarNovamente(View botao ){
        Intent it = new Intent(this, QuePaisEEsse.class);
        it.putExtra("nomePessoa", nomeRecuperado);
        startActivity(it);
fechar();
    }

    public void fechar(){
        finish();
    }

    private void salvarRanking(){

        SharedPreferences nome = getSharedPreferences("nome",0);
        SharedPreferences pontos = getSharedPreferences("pontos",0);

        SharedPreferences.Editor editor = nome.edit();
        SharedPreferences.Editor editor1 = pontos.edit();

        editor.putString("nome",nomeRecuperado);
        editor.commit();
        editor1.putInt("pontos",Integer.parseInt(pontuacaoJogador));
        editor1.commit();

    }


}


