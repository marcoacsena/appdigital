package br.com.marcoapps.appdigital.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import br.com.marcoapps.appdigital.R;
import br.com.marcoapps.appdigital.adapter.AdapterMensagem;
import br.com.marcoapps.appdigital.model.Mensagem;
import br.com.marcoapps.appdigital.uteis.RecyclerItemClickListener;

public class RecyclerViewEmissoresActivity extends AppCompatActivity {

    private Activity activity;
    private RecyclerView rvEmissores;
    private Button btnVoltarTelaLogin;
    private Mensagem mensagem;
    private List<Mensagem> listaDeMensagens = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_emissores);

        rvEmissores = findViewById(R.id.rvMensagem);
        btnVoltarTelaLogin = findViewById(R.id.btnVoltarTelaLogin);


        //Criar lista de filmes
        //criarListaDeMensagens();

        //Configurar adapter
        AdapterMensagem adapterMensagem = new AdapterMensagem();

        //Configurar recyclerview
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rvEmissores.setLayoutManager(layoutManager);
        rvEmissores.setHasFixedSize(true);
        rvEmissores.setAdapter( adapterMensagem);

        //Configurar eventos de click

        rvEmissores.addOnItemTouchListener(

                new RecyclerItemClickListener(
                        getApplicationContext(),
                        rvEmissores,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {

                                Intent intent = new Intent(getApplicationContext(), RecyclerViewMensagemActivity.class);

                                startActivity(intent);
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {

                                Toast.makeText(getApplicationContext(),
                                        "Recurso clique Longo .... acionado", Toast.LENGTH_LONG).show();
                            }

                            @Override
                            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                            }
                        }
                )

        );

    }

//    private void criarListaDeMensagens() {
//
//        mensagem = new Mensagem(imagemEmissor, nomeEnvelope, "1");
//
//
//
//    }

    public void voltarTelaLogin(View v){
        this.finish();
    }

}
