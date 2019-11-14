package br.com.marcoapps.appdigital.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;

import br.com.marcoapps.appdigital.R;
import br.com.marcoapps.appdigital.adapter.AdapterMensagem;

public class RecyclerViewEmissoresActivity extends AppCompatActivity {

    private Activity activity;
    private RecyclerView rvEmissores;
    private Button btnVoltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_emissores);

        rvEmissores = findViewById(R.id.rvEmissores);
        btnVoltar = findViewById(R.id.btnVoltar);


        //Criar lista de filmes
        //criarListaDeFilmes();

        //Configurar adapter

        AdapterMensagem adapterMensagem = new AdapterMensagem();

        //Configurar recyclerview
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rvEmissores.setLayoutManager(layoutManager);
        rvEmissores.setHasFixedSize(true);
        rvEmissores.setAdapter( adapterMensagem);
    }

    public void voltarTelaLogin(View v){

        this.finish();
    }
}
