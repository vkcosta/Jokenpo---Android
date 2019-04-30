package br.salesiano.jokenpo_01;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView jogador;
    ImageView computador;
    int[] listaImagens = new int[]{R.drawable.pedra, R.drawable.papel, R.drawable.tesoura};
    int imagemSelecionada;
    String jogadaDoJogador, jogadaDoAndroid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jogador = (ImageView) findViewById(R.id.imagemJogador);
        computador = (ImageView) findViewById(R.id.imagemComputador);
    }

    public void clickButtonPedra(View v) {
        imagemSelecionada = (R.drawable.pedra);
        jogador.setBackgroundResource(imagemSelecionada);
        jogadaDoJogador = "pedra";
    }

    public void clickButtonPapel(View v) {
        imagemSelecionada = (R.drawable.papel);
        jogador.setBackgroundResource(imagemSelecionada);
        jogadaDoJogador = "papel";
    }

    public void clickButtonTesoura(View v) {
        imagemSelecionada = (R.drawable.tesoura);
        jogador.setBackgroundResource(imagemSelecionada);
        jogadaDoJogador = "tesoura";
    }

    /**
     * Este método gerará uma imagem aleatório dentre a lista de imagens e atribuirá essa imagem ao campo 'computador'
     */
    public void imagemAleatoria(int max) {
        int random = new Random().nextInt(listaImagens.length);
        computador.setBackgroundResource(listaImagens[random]);
        switch (random){
            case 0:
                jogadaDoAndroid = "pedra";
                break;
            case 1:
                jogadaDoAndroid = "papel";
                break;
            case 2:
                jogadaDoAndroid = "tesoura";
                break;
        }
    }

    /**
     * Este método executará a lógica das comparações das imagens e indicar o vencedor da partida
     */
    public void jogar(View v) {
        try {
            String resultado;
            imagemAleatoria(listaImagens.length);
            switch(jogadaDoAndroid){
                case "pedra":
                    if (jogadaDoJogador == "pedra"){
                        resultado = "empate!";
                    }else if (jogadaDoJogador == "papel"){
                        resultado = "Jogador venceu!";
                    } else if (jogadaDoJogador == "tesoura"){
                        resultado = "Android venceu!";
                    } else {
                        resultado = "Algo muito inesperado aconteceu aqui... o_O ";
                    }
                    break;
                case "papel":
                    if (jogadaDoJogador == "pedra"){
                        resultado = "Android venceu!";
                    }else if (jogadaDoJogador == "papel"){
                        resultado = "empate";
                    } else if (jogadaDoJogador == "tesoura"){
                        resultado = "Jogador venceu!";
                    } else {
                        resultado = "Algo muito inesperado aconteceu aqui... o_O ";
                    }
                    break;
                case "tesoura":
                    if (jogadaDoJogador == "pedra"){
                        resultado = "Jogador venceu!";
                    }else if (jogadaDoJogador == "papel"){
                        resultado = "Android venceu!";
                    } else if (jogadaDoJogador == "tesoura"){
                        resultado = "empate";
                    } else {
                        resultado = "Algo muito inesperado aconteceu aqui... o_O ";
                    }
                    break;

                    default:
                        resultado = "Algo muito inesperado MEEESMO aconteceu aqui... O_o ";
                        break;
            }
            Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();
        } catch (Exception ex) {
            Toast.makeText(getApplicationContext(), "Escolha uma imagem!", Toast.LENGTH_LONG).show();
        }
    }
}
