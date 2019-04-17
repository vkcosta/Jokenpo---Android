package br.salesiano.jokenpo_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*Método responsável pelo clique na imagem pedra*/
    public void clickPedra(View v){
    System.out.println(v);
    }

    /*Método responsável pelo clique na imagem papel*/
    public void clickPapel(View v){

    }

    /*Método responsável pelo clique na imagem tesoura*/
    public void clickTesoura(View v){

    }

    /*A cada clique no botão é efetuada uma nova jogada da máquina e verificado quem é o vencedor da partida.*/
    public void jogar(View v){

    }

    /*Método responsável por gerar um número aleatório que será correspondente a uma das imagens: pedra, papel ou tesoura.
    * Essa imagem será a escolha da máquina*/
    private void imagemAleatorio(){

    }
}
