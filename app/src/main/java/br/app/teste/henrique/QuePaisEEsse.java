package br.app.teste.henrique;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Random;



public class QuePaisEEsse extends AppCompatActivity {

    Random rand = new Random();

    private int[] imagens1 = {R.drawable.bandeira1, R.drawable.bandeira2,
            R.drawable.bandeira3, R.drawable.bandeira4, R.drawable.bandeira5, R.drawable.bandeira6, R.drawable.bandeira7,
            R.drawable.bandeira8, R.drawable.bandeira9, R.drawable.bandeira10, R.drawable.bandeira11, R.drawable.bandeira12,
            R.drawable.bandeira13, R.drawable.bandeira14, R.drawable.bandeira15, R.drawable.bandeira16, R.drawable.bandeira17,
            R.drawable.bandeira18, R.drawable.bandeira19, R.drawable.bandeira20, R.drawable.bandeira21, R.drawable.bandeira22,
            R.drawable.bandeira23, R.drawable.bandeira24, R.drawable.bandeira25, R.drawable.bandeira26, R.drawable.bandeira27,
            R.drawable.bandeira28, R.drawable.bandeira29, R.drawable.bandeira30, R.drawable.bandeira31, R.drawable.bandeira32,
            R.drawable.bandeira33, R.drawable.bandeira34, R.drawable.bandeira35, R.drawable.bandeira36, R.drawable.bandeira37,
            R.drawable.bandeira38, R.drawable.bandeira39, R.drawable.bandeira40, R.drawable.bandeira41, R.drawable.bandeira42,
            R.drawable.bandeira43, R.drawable.bandeira44, R.drawable.bandeira45, R.drawable.bandeira46, R.drawable.bandeira47,
            R.drawable.bandeira48, R.drawable.bandeira49, R.drawable.bandeira50, R.drawable.bandeira51, R.drawable.bandeira52,
            R.drawable.bandeira53, R.drawable.bandeira54, R.drawable.bandeira55, R.drawable.bandeira56, R.drawable.bandeira57,
            R.drawable.bandeira58, R.drawable.bandeira59, R.drawable.bandeira60, R.drawable.bandeira61, R.drawable.bandeira62,
            R.drawable.bandeira63, R.drawable.bandeira64, R.drawable.bandeira65, R.drawable.bandeira66, R.drawable.bandeira67,
            R.drawable.bandeira68, R.drawable.bandeira69, R.drawable.bandeira70, R.drawable.bandeira71, R.drawable.bandeira72,
            R.drawable.bandeira73, R.drawable.bandeira74, R.drawable.bandeira75, R.drawable.bandeira76, R.drawable.bandeira77,
            R.drawable.bandeira78, R.drawable.bandeira79, R.drawable.bandeira80, R.drawable.bandeira81, R.drawable.bandeira82,
            R.drawable.bandeira83, R.drawable.bandeira84, R.drawable.bandeira85, R.drawable.bandeira86, R.drawable.bandeira87,
            R.drawable.bandeira88, R.drawable.bandeira89, R.drawable.bandeira90, R.drawable.bandeira91, R.drawable.bandeira92,
            R.drawable.bandeira93, R.drawable.bandeira94, R.drawable.bandeira95, R.drawable.bandeira96, R.drawable.bandeira97,
            R.drawable.bandeira98, R.drawable.bandeira99, R.drawable.bandeira100, R.drawable.bandeira101, R.drawable.bandeira102,
            R.drawable.bandeira103, R.drawable.bandeira104, R.drawable.bandeira105, R.drawable.bandeira106, R.drawable.bandeira107,
            R.drawable.bandeira108, R.drawable.bandeira109, R.drawable.bandeira110, R.drawable.bandeira111, R.drawable.bandeira112,
            R.drawable.bandeira113, R.drawable.bandeira114, R.drawable.bandeira115, R.drawable.bandeira116, R.drawable.bandeira117,
            R.drawable.bandeira118, R.drawable.bandeira119, R.drawable.bandeira120, R.drawable.bandeira121, R.drawable.bandeira122,
            R.drawable.bandeira123, R.drawable.bandeira124, R.drawable.bandeira125, R.drawable.bandeira126, R.drawable.bandeira127,
            R.drawable.bandeira128, R.drawable.bandeira129, R.drawable.bandeira130, R.drawable.bandeira131, R.drawable.bandeira132,
            R.drawable.bandeira133, R.drawable.bandeira134, R.drawable.bandeira135, R.drawable.bandeira136, R.drawable.bandeira137,
            R.drawable.bandeira138, R.drawable.bandeira139, R.drawable.bandeira140, R.drawable.bandeira141, R.drawable.bandeira142,
            R.drawable.bandeira143, R.drawable.bandeira144, R.drawable.bandeira145, R.drawable.bandeira146, R.drawable.bandeira147,
            R.drawable.bandeira148, R.drawable.bandeira149, R.drawable.bandeira150, R.drawable.bandeira151, R.drawable.bandeira152,
            R.drawable.bandeira153, R.drawable.bandeira154, R.drawable.bandeira155, R.drawable.bandeira156, R.drawable.bandeira157,
            R.drawable.bandeira158, R.drawable.bandeira159, R.drawable.bandeira160, R.drawable.bandeira161, R.drawable.bandeira162,
            R.drawable.bandeira163, R.drawable.bandeira164, R.drawable.bandeira165, R.drawable.bandeira166, R.drawable.bandeira167,
            R.drawable.bandeira168, R.drawable.bandeira169, R.drawable.bandeira170, R.drawable.bandeira171, R.drawable.bandeira172,
            R.drawable.bandeira173, R.drawable.bandeira174, R.drawable.bandeira175, R.drawable.bandeira176, R.drawable.bandeira177,
            R.drawable.bandeira178, R.drawable.bandeira179, R.drawable.bandeira180, R.drawable.bandeira181, R.drawable.bandeira182,
            R.drawable.bandeira183, R.drawable.bandeira184, R.drawable.bandeira185, R.drawable.bandeira186, R.drawable.bandeira187,
            R.drawable.bandeira188, R.drawable.bandeira189, R.drawable.bandeira190, R.drawable.bandeira191, R.drawable.bandeira192,
            R.drawable.bandeira193, R.drawable.bandeira194, R.drawable.bandeira195, R.drawable.bandeira196, R.drawable.bandeira197,
            R.drawable.bandeira198, R.drawable.bandeira199, R.drawable.bandeira200, R.drawable.bandeira201, R.drawable.bandeira202,
            R.drawable.bandeira203, R.drawable.bandeira204, R.drawable.bandeira205, R.drawable.bandeira206, R.drawable.bandeira207,
            R.drawable.bandeira208, R.drawable.bandeira209, R.drawable.bandeira210, R.drawable.bandeira211, R.drawable.bandeira212,
            R.drawable.bandeira213, R.drawable.bandeira214, R.drawable.bandeira215, R.drawable.bandeira216, R.drawable.bandeira217,
            R.drawable.bandeira218, R.drawable.bandeira219, R.drawable.bandeira220, R.drawable.bandeira221, R.drawable.bandeira222,};


    private RadioButton resposta1;
    private RadioButton resposta2;
    private RadioButton resposta3;
    private RadioButton resposta4;
    private ImageView bandeira;
    private String nomeRecuperado;
    private int questao = 1;
    private int pontuacao = 0;
    private RadioGroup grupo;
    private int rotacao = 0;



    private String[] nomes01 = {
            "Afeganistão", "Albania", "Algeria", "Samoa Americana", "Andorra", "Angola", "Anguilla", "Antigua e Barbuda", "Argentina",
            "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgica",
            "Belize", "Benin", "Bermuda", "Butão", "Bolivia", "Bosnia", "Botswana", "Brasil", "Ilhas Britanicas", "Brunei", "Bulgaria",
            "Burkina Faso", "Burundi", "Cambodia", "Camarões", "Canada", "Cabo Verde", "Ilhas Cayman", "Republica Central Africana", "Chad",
            "Chile", "China", "Ilhas Christmas", "Colombia", "Comoros", "Cook Islands", "Costa Rica", "Costa do Marfim", "Croacia", "Cuba",
            "Chipre", "Republica Tcheca", "República Democrática do Congo", "Dinamarca", "Djibouti", "Dominica", "Republica Dominicana",
            "Ecuador", "Egito", "El Salvador", "Guine Equatorial", "Eritrea", "Estonia", "Etiopia", "Ilhas Falkland", "Ilhas Faroe",
            "Fiji", "Finlandia", "Franca", "Polinesia Francesa", "Gabão", "Gambia", "Georgia", "Alemanha", "Gana", "Gibraltar", "Grecia",
            "Groelândia", "Grenada", "Guam", "Guatemala", "Guinea", "Guinea Bissau", "Guyana", "Haiti", "Honduras", "Hong Kong", "Hungria",
            "Islandia", "India", "Indonesia", "Iran", "Iraque", "Irlanda", "Israel", "Italia", "Jamaica", "Japão", "Jordania", "Kazakistão",
            "Kenya", "Kiribati", "Kuwait", "Kyrgyzstão", "Laos", "Latvia", "Libano", "Lesotho", "Liberia", "Libia", "Liechtenstein",
            "Lituania", "Luxemburgo", "Macao", "Macedonia", "Malawi", "Malasia", "Maldivas", "Mali", "Malta", "Ilhas Marshall", "Martinica",
            "Mauritania", "Mauricio", "Mexico", "Micronesia", "Moldávia", "Monaco", "Mongolia", "Montserrat", "Marrocos", "Moçambique", "Myanmar",
            "Namibia", "Nauru", "Nepal", "Holanda", "Antilhas Holandesas", "Nova Zelandia", "Nicaragua", "Niger", "Nigeria", "Niue", "Ilha Norfolk",
            "Corea do Norte", "Noruega", "Oman", "Paquistão", "Palau", "Panama", "Papua Nova Guiné", "Paraguai", "Peru", "Filipinas", "Ilhas Pitcairn",
            "Polonia", "Portugal", "Porto Rico", "Qatar", "Republica do Congo", "Romênia", "Russia", "Ruanda", "São Cristóvão e Nevis", "Santa Lucia",
            "Saint Pierre", "São Vicente e Granadinas", "Samoa", "San Marino", "São Tomé e Príncipe", "Arabia Saudita", "Senegal", "Servia e Montenegro",
            "Seychelles", "Serra Leoa", "Singapura", "Eslovaquia", "Eslovenia", "Ilhas Salomão", "Somalia", "Africa do Sul", "Georgia do Sul", "Coreia do Sul",
            "União Sovietica", "Espanha", "Sri Lanka", "Sudão", "Suriname", "Suazilândia", "Suecia", "Suiça", "Síria", "Taiwan", "Tajiquistão", "Tanzania",
            "Tailandia", "Tibete", "Timor Leste", "Togo", "Tonga", "Trinidade e Tobago", "Tunisia", "Turquia", "Turquemenistão", "Ilhas Turcas e Caicos", "Tuvalu",
            "Emirados Arabes", "Uganda", "Ucrania", "Reino Unido", "Estados Unidos", "Uruguai", "Ilhas Virgens", "Uzbequistão", "Vanuatu", "Vaticano", "Venezuela",
            "Vietnam", "Wallis e Futuna", "Iémen", "Zambia", "Zimbabwe"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que_pais_eesse);
        resposta1 = (RadioButton) findViewById(R.id.resposta01);
        resposta2 = (RadioButton)findViewById(R.id.resposta02);
        resposta3 = (RadioButton)findViewById(R.id.resposta03);
        resposta4 = (RadioButton)findViewById(R.id.resposta04);
        grupo = (RadioGroup) findViewById(R.id.grupo);
        bandeira =  findViewById(R.id.bandeira);
        Intent it = getIntent();
        nomeRecuperado = it.getStringExtra("nomePessoa");

        if(rotacao == 0) {
            controlaLayout();
        }
        rotacao++;
    }

    public void controlaLayout() {

        questao = rand.nextInt(4) + 1;


        int res1 = rand.nextInt(56);
        int res2 = rand.nextInt(56) + 56;
        int res3 = rand.nextInt(56) + 111;
        int res4 = rand.nextInt(54) + 168;

        if (questao == 1) {

            bandeira.setImageResource(imagens1[res1]);

            resposta1.setText(nomes01[res1]);
            resposta2.setText(nomes01[res2]);
            resposta3.setText(nomes01[res3]);
            resposta4.setText(nomes01[res4]);


        } else if (questao == 2) {
            bandeira.setImageResource(imagens1[res2]);

            resposta1.setText(nomes01[res1]);
            resposta2.setText(nomes01[res2]);
            resposta3.setText(nomes01[res3]);
            resposta4.setText(nomes01[res4]);

        } else if (questao == 3) {
            bandeira.setImageResource(imagens1[res3]);

            resposta1.setText(nomes01[res1]);
            resposta2.setText(nomes01[res2]);
            resposta3.setText(nomes01[res3]);
            resposta4.setText(nomes01[res4]);

        } else {
            bandeira.setImageResource(imagens1[res4]);
            resposta1.setText(nomes01[res1]);
            resposta2.setText(nomes01[res2]);
            resposta3.setText(nomes01[res3]);
            resposta4.setText(nomes01[res4]);
        }
    }

    public void jogoBandeira(View botao) {

        if (questao == 1 && resposta1.isChecked()) {
            pontuacao++;
            Toast
                    .makeText(this, "Acertou !!!", Toast.LENGTH_SHORT)
                    .show();
            controlaLayout();
        } else if (questao == 2 && resposta2.isChecked()) {
            pontuacao++;
            Toast
                    .makeText(this, "Acertou !!!", Toast.LENGTH_SHORT)
                    .show();
            controlaLayout();

        } else if (questao == 3 && resposta3.isChecked()) {
            pontuacao++;
            Toast
                    .makeText(this, "Acertou !!!", Toast.LENGTH_SHORT)
                    .show();
            controlaLayout();

        } else if (questao == 4 && resposta4.isChecked()) {
            pontuacao++;
            Toast
                    .makeText(this, "Acertou !!!", Toast.LENGTH_SHORT)
                    .show();
            controlaLayout();
        } else {
            Intent it = new Intent(this, Ranking.class);
            it.putExtra("nomePessoa", nomeRecuperado);
            it.putExtra( "pontoJogador",String.valueOf(pontuacao));
            startActivity(it);
            finish();
        }
        grupo.clearCheck();
    }
}
