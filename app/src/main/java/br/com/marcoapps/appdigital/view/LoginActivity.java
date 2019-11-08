package br.com.marcoapps.appdigital.view;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.marcoapps.appdigital.R;

public class LoginActivity extends AppCompatActivity {

    private EditText editCpf;
    private Button btnAcessarListaMensagens;
    private String Cpf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editCpf = findViewById(R.id.editCpf);
        btnAcessarListaMensagens = findViewById(R.id.btnAcessarListaMensagens);

        Cpf = editCpf.getText().toString();
        btnAcessarListaMensagens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (validarCpf(Cpf)){

                    Intent intent = new Intent(getApplicationContext(), ListaActivity.class);
                    intent.putExtra("cpf", Cpf);
                    startActivity(intent);

                }

            }
        });


    }


    private boolean validarCpf(String cpf) {

        return true;
    }



}
