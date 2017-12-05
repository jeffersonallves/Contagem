package br.com.amazingsoft.contagem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int contagem = 0;
    private TextView texto;
    private ImageButton contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (TextView) findViewById(R.id.texto);
        contador = (ImageButton) findViewById(R.id.contador);

        contador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                contagem++;
                texto.setText("" + contagem);
            }
        });

        getSupportActionBar().setTitle("Teste");

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Button btn_TerminarTeste = (Button) findViewById(R.id.btn_TerminarTeste);
        btn_TerminarTeste.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                finish();
            }

        });
    }

}

