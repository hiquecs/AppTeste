package br.app.teste.henrique;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Principal extends AppCompatActivity {
    private EditText txtNome;
    private Button botao;
    private TextWatcher MudarTexto = new TextWatcher(){

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        @Override
        public void afterTextChanged(Editable s) {
            aoMudarTexto();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtNome = (EditText) findViewById(R.id.txtNome);
        botao = (Button) findViewById(R.id.iniciarQuiz);

        botao.setEnabled(false);
        botao.setClickable(false);

        txtNome.addTextChangedListener(MudarTexto);

    }

    private void aoMudarTexto(){
        if(txtNome.length() != 0) {
            botao.setEnabled(true);
            botao.setClickable(true);
        } else {
            botao.setEnabled(false);
            botao.setClickable(false);
        }
    }


    public void sair(View botao) {
        finish();
    }

    public void jogar(View botao) {
        String nome = txtNome.getText().toString();
        Intent it = new Intent(this, QuePaisEEsse.class);
        it.putExtra("nomePessoa", nome);
        startActivity(it);
        finish();
    }
}
