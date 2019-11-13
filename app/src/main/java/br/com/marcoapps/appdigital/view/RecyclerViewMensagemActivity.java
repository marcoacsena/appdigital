package br.com.marcoapps.appdigital.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.icu.lang.UCharacter;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import br.com.marcoapps.appdigital.R;
import br.com.marcoapps.appdigital.adapter.AdapterListaMensagem;
import br.com.marcoapps.appdigital.model.ConfiguracaoMensagem;

public class RecyclerViewMensagemActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ConfiguracaoMensagem configuracaoMensagem;
    List<ConfiguracaoMensagem> listaConfiguracaoDeMensagem = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_mensagem);

        recyclerView =findViewById(R.id.recyclerViewMensagem);

        //Criar lista de filmes
        //criarListaConfiguracaoDeMensagem();

        //Configurar adapter
        AdapterListaMensagem adapterListaMensagem= new AdapterListaMensagem(listaConfiguracaoDeMensagem);

        //Configurar recyclerview
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapterListaMensagem);

    }

    private void criarListaConfiguracaoDeMensagem() {

        configuracaoMensagem = new ConfiguracaoMensagem("Notificação", "São Paulo", "30 de janeiro de 2019", "17/09/2019");
        listaConfiguracaoDeMensagem.add(configuracaoMensagem);
        configuracaoMensagem = new ConfiguracaoMensagem("Notificação", "Brasília", "25 de junho de 2019", "05/05/2019");
        listaConfiguracaoDeMensagem.add(configuracaoMensagem);
        configuracaoMensagem = new ConfiguracaoMensagem("Notificação", "Belém", "10 de Abril de 2019", "09/03/2019");
        listaConfiguracaoDeMensagem.add(configuracaoMensagem);
        configuracaoMensagem = new ConfiguracaoMensagem("Notificação", "Rio De Janeiro", "15 de março de 2019", "20/02/2019");
        listaConfiguracaoDeMensagem.add(configuracaoMensagem);
    }
}
