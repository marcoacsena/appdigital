package br.com.marcoapps.appdigital.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import br.com.marcoapps.appdigital.R;
import br.com.marcoapps.appdigital.adapter.AdapterListaMensagem;
import br.com.marcoapps.appdigital.model.ConfiguracaoMensagem;

public class RecyclerViewMensagemActivity extends AppCompatActivity {

    private Activity activity;
    private RecyclerView rvMensagem;
    private Button btnVoltarTelaEmissores;
    private ConfiguracaoMensagem configuracaoMensagem;
    private List<ConfiguracaoMensagem> listaConfiguracaoDeMensagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_mensagem);

        btnVoltarTelaEmissores = findViewById(R.id.btnVoltarTelaEmissores);
        rvMensagem =findViewById(R.id.rvMensagem);
//
//        //Criar lista de filmes
          criarListaConfiguracaoDeMensagens();
//
        //Configurar adapter
        AdapterListaMensagem adapterListaMensagem= new AdapterListaMensagem(listaConfiguracaoDeMensagens);
//
        //Configurar recyclerview
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());

        rvMensagem.setLayoutManager(layoutManager);
        rvMensagem.setHasFixedSize(true);
        rvMensagem.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        rvMensagem.setAdapter(adapterListaMensagem);

    }

    private void criarListaConfiguracaoDeMensagens() {

        configuracaoMensagem = new ConfiguracaoMensagem("Notificação", "São Paulo", "30 de janeiro de 2019", "17/09/2019");
        listaConfiguracaoDeMensagens.add(configuracaoMensagem);
        configuracaoMensagem = new ConfiguracaoMensagem("Notificação", "Brasília", "25 de junho de 2019", "05/05/2019");
        listaConfiguracaoDeMensagens.add(configuracaoMensagem);
        configuracaoMensagem = new ConfiguracaoMensagem("Notificação", "Belém", "10 de Abril de 2019", "09/03/2019");
        listaConfiguracaoDeMensagens.add(configuracaoMensagem);
        configuracaoMensagem = new ConfiguracaoMensagem("Notificação", "Rio De Janeiro", "15 de março de 2019", "20/02/2019");
        listaConfiguracaoDeMensagens.add(configuracaoMensagem);
    }

    public void voltarTelaEmissores(View v){

        this.finish();
    }
}
