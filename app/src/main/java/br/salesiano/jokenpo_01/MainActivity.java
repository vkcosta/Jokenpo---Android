package br.salesiano.jokenpo_01;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView jogador;
    ImageView computador;
    int[] listaImagens = new int[]{R.drawable.pedra, R.drawable.papel, R.drawable.tesoura};
    int imagemSelecionada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jogador = (ImageView) findViewById(R.id.imagemJogador);
    }

    public void clickButtonPedra(View v) {
        imagemSelecionada = (R.drawable.pedra);
        jogador.setBackgroundResource(imagemSelecionada);
    }

    public void clickButtonPapel(View v) {
        imagemSelecionada = (R.drawable.papel);
        jogador.setBackgroundResource(imagemSelecionada);
    }

    public void clickButtonTesoura(View v) {
        imagemSelecionada = (R.drawable.tesoura);
        jogador.setBackgroundResource(imagemSelecionada);
    }

    /**
     * Este método gerará uma imagem aleatório dentre a lista de imagens e atribuirá essa imagem ao campo 'computador'
     */
    public void imagemAleatoria(int max) {
        int random = (int) (Math.random() * 0 + (max - 1));
        computador.setBackgroundResource(listaImagens[random]);
    }

    /**
     * Este método executará a lógica das comparações das imagens e indicar o vencedor da partida
     */
    public void jogar(View v) {
        try {
            imagemAleatoria(listaImagens.length);

        } catch (Exception ex) {
            Toast.makeText(getApplicationContext(), "Escolha uma imagem!", Toast.LENGTH_LONG).show();
        }
    }
}
