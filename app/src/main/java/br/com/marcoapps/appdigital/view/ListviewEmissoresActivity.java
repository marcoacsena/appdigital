package br.com.marcoapps.appdigital.view;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import br.com.marcoapps.appdigital.R;
import br.com.marcoapps.appdigital.model.AdapterMensagem;
import br.com.marcoapps.appdigital.model.Mensagem;

public class ListviewEmissoresActivity extends AppCompatActivity {

    private Activity activity;
    private ListView lvEmissores;
    private Button btnVoltar;

    private List<Mensagem> listMensagens;
    private AdapterMensagem adapterMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_emissores);

        lvEmissores = findViewById(R.id.lvEmissores);
        btnVoltar = findViewById(R.id.btnVoltar);
        configListView();

    }

    private void configListView() {

        listMensagens = new ArrayList<>();

        listMensagens.add(new Mensagem("Santander", "7"));
        listMensagens.add(new Mensagem("Santander", "2"));

        adapterMensagem = new AdapterMensagem(listMensagens, getApplicationContext());
        lvEmissores.setAdapter(adapterMensagem);

    }


    public void voltarTelaCpf(View v){

        this.finish();
    }

}
