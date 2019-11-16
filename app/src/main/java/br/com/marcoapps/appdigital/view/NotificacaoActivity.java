package br.com.marcoapps.appdigital.view;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import br.com.marcoapps.appdigital.R;

public class NotificacaoActivity extends AppCompatActivity {

    private Activity activity;
    private Button btnVoltarTelaListaDeMensagens;
    private ImageView ivLogoEmissorDoDocumento;
    private TextView tvTituloDocumento;
    private TextView tvNumeroDocumento, tvNumeroProcesso;
    private TextView tvCidadeEmissor, tvUF, tvDataDocumento;
    private TextView tvTratamentoCliente, tvNomeCliente, tvSobreNomeCliente, tvCpfCnpj, tvNumeroCpfCnpj;
    private TextView tvcorpoDoDocumento, tvNumContrato, tvNomeDoEmissor;
    private TextView tvNomeDoContato,tvEnderecoDoContato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificacao);
    }

    public void voltarTelaListaDeMensagens(View v){

        this.finish();
    }
}
