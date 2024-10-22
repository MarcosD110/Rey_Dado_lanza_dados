package com.example.cubilete_dados_aleatorios;

import android.annotation.SuppressLint;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Cargar GIF en el ImageButton rey_dado (necesario añadir libreria libs en gradle y en toml)
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton reyDadoButton = findViewById(R.id.rey_dado_original);
        Glide.with(this)
                .asGif()
                .load(R.drawable.rey_dado_original)
                .into(reyDadoButton);

        //Inicializar cada ImageButton e ImageView
        ImageButton reyDado = findViewById(R.id.rey_dado_original);
        ImageView dado_izquierdo = findViewById(R.id.dado_izq);
        ImageView dado_centro = findViewById(R.id.dado_cent);
        ImageView dado_derecho = findViewById(R.id.dado_der);

        //Funcion para sacar un numero aleatorio en cada dado.
        reyDado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valorAleatorio1 = 1+(int)(Math.random()*6);
                int valorAleatorio2 = 1+(int)(Math.random()*6);
                int valorAleatorio3 = 1+(int)(Math.random()*6);

                //Dado 1
                switch (valorAleatorio1) {
                    case 1: dado_izquierdo.setImageResource(R.drawable.dado1);
                        break;
                    case 2: dado_izquierdo.setImageResource(R.drawable.dado2);
                        break;
                    case 3: dado_izquierdo.setImageResource(R.drawable.dado3);
                        break;
                    case 4: dado_izquierdo.setImageResource(R.drawable.dado4);
                        break;
                    case 5: dado_izquierdo.setImageResource(R.drawable.dado5);
                        break;
                    case 6: dado_izquierdo.setImageResource(R.drawable.dado6);
                        break;

                }

                //Dado 2
                switch (valorAleatorio2) {
                    case 1: dado_centro.setImageResource(R.drawable.dado1);
                        break;
                    case 2: dado_centro.setImageResource(R.drawable.dado2);
                        break;
                    case 3: dado_centro.setImageResource(R.drawable.dado3);
                        break;
                    case 4: dado_centro.setImageResource(R.drawable.dado4);
                        break;
                    case 5: dado_centro.setImageResource(R.drawable.dado5);
                        break;
                    case 6: dado_centro.setImageResource(R.drawable.dado6);
                        break;

                }

                //Dado 3
                switch (valorAleatorio3) {
                    case 1: dado_derecho.setImageResource(R.drawable.dado1);
                        break;
                    case 2: dado_derecho.setImageResource(R.drawable.dado2);
                        break;
                    case 3: dado_derecho.setImageResource(R.drawable.dado3);
                        break;
                    case 4: dado_derecho.setImageResource(R.drawable.dado4);
                        break;
                    case 5: dado_derecho.setImageResource(R.drawable.dado5);
                        break;
                    case 6: dado_derecho.setImageResource(R.drawable.dado6);
                        break;

                }

            }
        });

    }
}